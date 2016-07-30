package jp.co.example.vo;

public class CalcProcessingPriceVo {
	/** 板厚(数値) */
	private double thicknessValue=0.0;
	/** 板厚(文字列) */
	private String thicknessName="";
	/** 髪質(文字列) */
	private String seatAssortName;
	/** 高さ */
	private Integer height=0;
	/** 幅 */
	private Integer width;
	/** 深さ */
	private Integer depth;
	/** 高さ(外寸) */
	private Integer heightOuter=0;
	/** 幅(外寸) */
	private Integer widthOuter=0;
	/** 深さ(外寸) */
	private Integer depthOuter=0;
	/** 加工賃/1枚 */
	private Integer processingPricePerSeat=0;
	/** 加工賃小計 */
	private Integer processingPriceSum=0;
	/** 販売価格/一枚 */
	private Integer salesPricePerSeat=0;
	/** 販売価格小計 */
	private Integer salesPriceSum=0;
	/** 印刷フラグ */
	private Integer printFlg=0;
	/** 印刷箇所 */
	private Integer printPoints=0;
	/** 印刷面幅 */
	private Integer printWidth=0;
	/** 印刷面高さ */
	private Integer printHeight=0;
	/** 版面デザイン依頼フラグ */
	private Integer desine;
	/** 印刷工賃小計 */
	private Integer printingPrice=0;
	/** 印刷工賃合計 */
	private Integer printingPriceSum=0;
	/** 都道府県ID */
	private Integer prefecture=0;
	/** 個口数 */
	private Integer baggegies=0;
	/** 送料小計 */
	private Integer shippingPrice=0;
	/** 送料合計 */
	private Integer shippingPriceSum=0;
	/** 版代合計 */
	private Integer platePriceSum=0;
	/** 流れ */
	private Integer nagare=0;
	/** 紙幅 */
	private Integer sifuku=0;
	/** 平米数/一枚 */
	private double heibeiPerSeat=0;
	/** 平米数/製作数 */
	private double heibeiAll=0;
	/** シート代合計 */
	private Integer seatFee=0;
	/** 製作数 */
	private Integer pts=0;
	/** 合計金額 */
	private Integer priceSum;
	/** 消費税 */
	private Integer taxSum;
	/** メールアドレス */
	private String emailAddress;
	/** 電話番号 */
	private Integer phoneNumber;
	/** 問い合わせ詳細 */
	private String message;
	/** 代引き手数料 */
	private static final Integer SETTELEMENT_FEE=315;
	
	
	public double getthicknessValue() {
		return thicknessValue;
	}
	public void setthicknessValue(double thicknessValue) {
		this.thicknessValue = thicknessValue;
	}
	public String getThicknessName() {
		return thicknessName;
	}
	public void setThicknessName(String thicknessName) {
		this.thicknessName = thicknessName;
	}
	public double getThicknessValue() {
		return thicknessValue;
	}
	public void setThicknessValue(double thicknessValue) {
		this.thicknessValue = thicknessValue;
	}
	public String getSeatAssortName() {
		return seatAssortName;
	}
	public void setSeatAssortName(String seatAssortName) {
		this.seatAssortName = seatAssortName;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public Integer getWidth() {
		return width;
	}
	public void setWidth(Integer width) {
		this.width = width;
	}
	public Integer getDepth() {
		return depth;
	}
	public void setDepth(Integer depth) {
		this.depth = depth;
	}
	public Integer getHeightOuter() {
		return heightOuter;
	}
	public void setHeightOuter(Integer heightOuter) {
		this.heightOuter = heightOuter;
	}
	public Integer getWidthOuter() {
		return widthOuter;
	}
	public void setWidthOuter(Integer widthOuter) {
		this.widthOuter = widthOuter;
	}
	public Integer getDepthOuter() {
		return depthOuter;
	}
	public void setDepthOuter(Integer depthOuter) {
		this.depthOuter = depthOuter;
	}
	public Integer getProcessingPricePerSeat() {
		return processingPricePerSeat;
	}
	public void setProcessingPricePerSeat(Integer processingPricePerSeat) {
		this.processingPricePerSeat = processingPricePerSeat;
	}
	public Integer getProcessingPriceSum() {
		return processingPriceSum;
	}
	public void setProcessingPriceSum(Integer processingPriceSum) {
		this.processingPriceSum = processingPriceSum;
	}
	public Integer getSalesPricePerSeat() {
		return salesPricePerSeat;
	}
	public void setSalesPricePerSeat(Integer salesPricePerSeat) {
		this.salesPricePerSeat = salesPricePerSeat;
	}
	public Integer getSalesPriceSum() {
		return salesPriceSum;
	}
	public void setSalesPriceSum(Integer salesPriceSum) {
		this.salesPriceSum = salesPriceSum;
	}
	public Integer getPrintFlg() {
		return printFlg;
	}
	public void setPrintFlg(Integer printFlg) {
		this.printFlg = printFlg;
	}
	public Integer getPrintPoints() {
		return printPoints;
	}
	public void setPrintPoints(Integer printPoints) {
		this.printPoints = printPoints;
	}
	public Integer getPrintWidth() {
		return printWidth;
	}
	public void setPrintWidth(Integer printWidth) {
		this.printWidth = printWidth;
	}
	public Integer getPrintHeight() {
		return printHeight;
	}
	public void setPrintHeight(Integer printHeight) {
		this.printHeight = printHeight;
	}
	public Integer getDesine() {
		return desine;
	}
	public void setDesine(Integer desine) {
		this.desine = desine;
	}
	public Integer getPrintingPrice() {
		return printingPrice;
	}
	public void setPrintingPrice(Integer printingPrice) {
		this.printingPrice = printingPrice;
	}
	public Integer getPrintingPriceSum() {
		return printingPriceSum;
	}
	public void setPrintingPriceSum(Integer printingPriceSum) {
		this.printingPriceSum = printingPriceSum;
	}
	public Integer getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(Integer prefecture) {
		this.prefecture = prefecture;
	}
	public Integer getBaggegies() {
		return baggegies;
	}
	public void setBaggegies(Integer baggegies) {
		this.baggegies = baggegies;
	}
	public Integer getShippingPrice() {
		return shippingPrice;
	}
	public void setShippingPrice(Integer shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public Integer getShippingPriceSum() {
		return shippingPriceSum;
	}
	public void setShippingPriceSum(Integer shippingPriceSum) {
		this.shippingPriceSum = shippingPriceSum;
	}
	public Integer getPlatePriceSum() {
		return platePriceSum;
	}
	public void setPlatePriceSum(Integer platePriceSum) {
		this.platePriceSum = platePriceSum;
	}
	public Integer getNagare() {
		return nagare;
	}
	public void setNagare(Integer nagare) {
		this.nagare = nagare;
	}
	public Integer getSifuku() {
		return sifuku;
	}
	public void setSifuku(Integer sifuku) {
		this.sifuku = sifuku;
	}
	public double getHeibeiPerSeat() {
		return heibeiPerSeat;
	}
	public void setHeibeiPerSeat(double heibeiPerSeat) {
		this.heibeiPerSeat = heibeiPerSeat;
	}
	public double getHeibeiAll() {
		return heibeiAll;
	}
	public void setHeibeiAll(double heibeiAll) {
		this.heibeiAll = heibeiAll;
	}
	public Integer getSeatFee() {
		return seatFee;
	}
	public void setSeatFee(Integer seatFee) {
		this.seatFee = seatFee;
	}
	public Integer getPts() {
		return pts;
	}
	public void setPts(Integer pts) {
		this.pts = pts;
	}
	public Integer getPriceSum() {
		return priceSum;
	}
	public void setPriceSum(Integer priceSum) {
		this.priceSum = priceSum;
	}
	public Integer getTaxSum() {
		return taxSum;
	}
	public void setTaxSum(Integer taxSum) {
		this.taxSum = taxSum;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public static Integer getSettelementFee() {
		return SETTELEMENT_FEE;
	}
	

}
