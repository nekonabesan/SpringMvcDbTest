package jp.co.example.service;

import java.util.List;

import jp.co.example.dao.MstShippingPriceDao;
import jp.co.example.dao.TrnPrintProcessingPriceDao;
import jp.co.example.dao.TrnProcessingPriceDao;
import jp.co.example.entity.MstPrefecture;
import jp.co.example.entity.MstShippingBaseFee;
import jp.co.example.entity.TrnPrintProcessingPrice;
import jp.co.example.entity.TrnProcessingPrice;
import jp.co.example.util.ValidationChkUtil;
import jp.co.example.vo.CalcProcessingPriceVo;
import jp.co.example.vo.DanballOrderFormTopVo;
import jp.co.example.configration.ProjectConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FormProcessingPriceServiceImpl implements FormProcessingPriceService{
	/** 定数定義 */
	private static final ProjectConstants projectConstants=new ProjectConstants();
	/** 加工賃 */
	@Autowired
	private TrnProcessingPriceDao trnProcessingPriceDao;
	/** 印刷工賃 */
	@Autowired
	private TrnPrintProcessingPriceDao trnPrintProcessingPriceDao;
	/** 送料 */
	@Autowired
	private MstShippingPriceDao mstShippingPriceDao;
	/**  */
	private CalcProcessingPriceVo calcProcessingPriceVo=new CalcProcessingPriceVo();
	/**  */
	private ValidationChkUtil validationChkUtil=new ValidationChkUtil(); 
	/**  */
	private List<MstPrefecture> mstPrefecture;
	
	@Override
	@Transactional
	public List<TrnProcessingPrice> selectAllService(){
		return trnProcessingPriceDao.getSelectAll();
	}
	
	/** 
	 * @param heibei
	 * @param pts
	 * 
	 * */
	@Override
	@Transactional
	public CalcProcessingPriceVo calcProcessingPrice(DanballOrderFormTopVo danballOrderFormTop){
		
		/**  */
		int pts=danballOrderFormTop.getPts();
		this.calcProcessingPriceVo.setPts(pts);
		/**  */
		int height=danballOrderFormTop.getHeight();
		this.calcProcessingPriceVo.setHeight(height);
		/**  */
		int width=danballOrderFormTop.getWidth();
		this.calcProcessingPriceVo.setWidth(width);
		/**  */
		int depth=danballOrderFormTop.getDepth();
		this.calcProcessingPriceVo.setDepth(depth);
		/** 製作数をvoへセット */
		this.calcProcessingPriceVo.setPts(pts);
		/** 流れ、紙幅、平米数をvoへセット */
		this.calcHeibei(height,width,depth,pts);
		/** 直前に呼び出したメソッドでセットした平米数/一枚を変数化 */
		double heibeiPerSeat=this.calcProcessingPriceVo.getHeibeiPerSeat();
		/** DBより平米数当たりの加工賃を取得 */
		TrnProcessingPrice trnProcessingPrice=trnProcessingPriceDao.getSelectParHeibei(heibeiPerSeat,pts);
		/** 板厚(数値)をvoへセット */
		double thicknessValue=trnProcessingPrice.getMstThickness().getThicknessValue();
		this.calcProcessingPriceVo.setthicknessValue(thicknessValue);
		/** 板厚(文字列)をvoへセット */
		String thicknessName=trnProcessingPrice.getMstThickness().getThicknessName();
		this.calcProcessingPriceVo.setThicknessName(thicknessName);
		/** 髪質(文字列)をvoへセット */
		String seatAssortName=trnProcessingPrice.getMstSeatAssort().getSeatAssortName();
		this.calcProcessingPriceVo.setSeatAssortName(seatAssortName);
		/** 加工賃小計 */
		int processingPricePerSeat=(int)trnProcessingPrice.getProcessingPrice();
		this.calcProcessingPriceVo.setProcessingPricePerSeat(processingPricePerSeat);
		/** 加工賃合計 */
		int processingPriceSum=processingPricePerSeat*pts;
		this.calcProcessingPriceVo.setProcessingPriceSum(processingPriceSum);
		/** 販売価格/一枚 */
		int salesPricePerSeat=processingPricePerSeat+ProjectConstants.SEAT_PRICE_PER_HEIBEI_C5A;
		this.calcProcessingPriceVo.setSalesPricePerSeat(salesPricePerSeat);
		/** 販売価格小計 */
		int salesPriceSum=salesPricePerSeat*pts;
		this.calcProcessingPriceVo.setSalesPriceSum(salesPriceSum);
		/** 外寸をvoへセット */
		this.measureOutside(height,width,depth);
		/** 印刷工賃の計算 */
		if(danballOrderFormTop.getPrintFlg()==1){
			this.printFeeCalc(danballOrderFormTop);
		}
		/** 送料の計算 */
		Integer prefecture=danballOrderFormTop.getPrefecture();
		if(!ValidationChkUtil.intIsEmpty(prefecture)&&0<prefecture){
			this.shippingFeeCalc(danballOrderFormTop);
		}
		
		return this.calcProcessingPriceVo;
	}
	
	/**
	 * 印刷工賃を計算するメソッド
	 *  */
	@Override
	@Transactional
	public void printFeeCalc(DanballOrderFormTopVo danballOrderFormTop){
		/** 印刷工賃取得 */
		double heibeiPerSeat=this.calcProcessingPriceVo.getHeibeiPerSeat();
		int pts=this.calcProcessingPriceVo.getPts();
		TrnPrintProcessingPrice trnPrintProcessingPrice=this.trnPrintProcessingPriceDao.getSelectParHeibei(heibeiPerSeat,pts);
		this.calcProcessingPriceVo.setPrintingPrice((int)trnPrintProcessingPrice.getPrintProcessingPrice());
		/** 版代計算 */
		if(!ValidationChkUtil.intIsEmpty(danballOrderFormTop.getPrintHeight())&&!ValidationChkUtil.intIsEmpty(danballOrderFormTop.getPrintWidth())){
			/** 印刷面高さ、幅を取得 */
			int printHeight=danballOrderFormTop.getPrintHeight();
			int printWidth=danballOrderFormTop.getPrintWidth();
			/** !!仕様要確認!! */
			
		}
	}
	
	/**
	 * 送料を計算するメソッド
	 *  */
	@Override
	@Transactional
	public void shippingFeeCalc(DanballOrderFormTopVo danballOrderFormTop){
		/** 都道府県IDを取得 */
		long prefecture=danballOrderFormTop.getPrefecture();
		/** 送料/一個口を取得 */
		MstShippingBaseFee mstShippingBaseFee=this.mstShippingPriceDao.getSelectPerHeibei(prefecture);
		int shippingBaseFeeValue=(int)mstShippingBaseFee.getShippingBaseFeeValue();
		/** 送料/一個口をvoへセット */
		this.calcProcessingPriceVo.setShippingPrice(shippingBaseFeeValue);
		/** 平米数(切り上げ) */
		int heibeiToInt=(int)Math.ceil(this.calcProcessingPriceVo.getHeibeiAll());
		/** 個口数 */
		int baggegies=0;
		if(heibeiToInt%projectConstants.SHIPPING_BASE_FEE_PER_HEIBEI==0){
			baggegies=heibeiToInt/projectConstants.SHIPPING_BASE_FEE_PER_HEIBEI;
		}else{
			baggegies=(heibeiToInt/projectConstants.SHIPPING_BASE_FEE_PER_HEIBEI)+1;
		}
		this.calcProcessingPriceVo.setBaggegies(baggegies);
		/** 送料合計 */
		int shippingPriceSum=shippingBaseFeeValue*baggegies;
		this.calcProcessingPriceVo.setShippingPriceSum(shippingPriceSum);
	}
	
	/**
	 * 
	 *  */
	@Override
	public void chkFormInputValue(DanballOrderFormTopVo danballOrderFormTop){
		int width=danballOrderFormTop.getWidth();
		int height=danballOrderFormTop.getHeight();
		int depth=danballOrderFormTop.getDepth();
		int printPts=danballOrderFormTop.getPrintPts();
		int printWidth=danballOrderFormTop.getPrintWidth();
		int printHeight=danballOrderFormTop.getPrintHeight();
		int pts=danballOrderFormTop.getPts();
		String emailAddress=danballOrderFormTop.getEmailAddress();
		int phoneNumber=danballOrderFormTop.getPhoneNumber();
		/** width */
		
		/** height */
		
		/** depth */
		
		/** printPts */
		
		/** printWidth */
		
		/** printHeight */
		
		/** pts */
		
		/** emailAddress */
		
		/** phoneNumber */
		
	}
	
	/**
	 * 流れ、紙幅、平米数をvoへセットするメソッド
	 * @param height
	 * @param width
	 * @param depth
	 * @param pts
	 * */
	private void calcHeibei(Integer height,Integer width,Integer depth, Integer pts){
		/** 流れ */
		int nagare=(width*2)+8+(depth*2)+50;
		/** 紙幅 */
		int sifuku=(height+8)+(depth+10);
		/** 平米数/1枚 */
		double heibeiPerSeat=((nagare+50)*sifuku)*0.000001;
		/** 平米数 */
		double heibeiAll=heibeiPerSeat*pts;
		/** シート代合計 */
		int seatFee=((int)heibeiAll)*ProjectConstants.SEAT_PRICE_PER_HEIBEI_C5A;
		/** voへ計算結果をセット */
		this.calcProcessingPriceVo.setSifuku(sifuku);
		this.calcProcessingPriceVo.setNagare(nagare);
		this.calcProcessingPriceVo.setHeibeiPerSeat(heibeiPerSeat);
		this.calcProcessingPriceVo.setHeibeiAll(heibeiAll);
		this.calcProcessingPriceVo.setSeatFee(seatFee);
	}
	
	/** 
	 * 外寸を計算するメソッド
	 *  */
	private void measureOutside(int height,int width,int depth){
		int heightOuter=height+20;
		int widthOuter=width+10;
		int depthOuter=depth+10;
		this.calcProcessingPriceVo.setHeightOuter(heightOuter);
		this.calcProcessingPriceVo.setWidthOuter(widthOuter);
		this.calcProcessingPriceVo.setDepthOuter(depthOuter);
	}

	
	
	
	

}
