package jp.co.example;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.validation.Valid;

import jp.co.example.dao.TrnProcessingPriceDao;
import jp.co.example.entity.MstPrefecture;
import jp.co.example.service.DanballFormService;
import jp.co.example.service.FormProcessingPriceService;
import jp.co.example.vo.CalcProcessingPriceVo;
import jp.co.example.vo.DanballOrderFormTopVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private FormProcessingPriceService formProcessingPriceService;
	
	@Autowired
	private DanballFormService danballFormService;
	
	
	private CalcProcessingPriceVo calcProcessingPriceVo=new CalcProcessingPriceVo();
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		DanballOrderFormTopVo danballOrderFormTopVo=new DanballOrderFormTopVo();
		
		/**  */
		model.addAttribute("danballOrderFormTopVo",danballOrderFormTopVo);
		/** 都道府県リストの取得 */
		List<MstPrefecture>mstPrefecture=this.danballFormService.getPrefectureAll();
		model.addAttribute("mstPrefecture", mstPrefecture );
		return "custom";
	}
	
	/**
	 * 
	 *  */
	@RequestMapping(value = "/exec", method = RequestMethod.POST)
	public String detail(@Valid @ModelAttribute DanballOrderFormTopVo danballOrderFormTopVo,BindingResult result,Model model) {
		/** 都道府県リストの取得 */
		List<MstPrefecture>mstPrefecture=this.danballFormService.getPrefectureAll();
		model.addAttribute("mstPrefecture", mstPrefecture);
		/** 都道府県入力値をLong型へキャスト */
		long prefectureToLong=0;
		if(danballOrderFormTopVo.getPrefecture()!=0){prefectureToLong=danballOrderFormTopVo.getPrefecture();}
		model.addAttribute("prefectureToLong", prefectureToLong);
		/** Validation */
		if(result.hasErrors()){
			/** Voセット */
			model.addAttribute("danballOrderFormTopVo",danballOrderFormTopVo);
			/** フォームトップ画面を再表示 */
			return "custom";
		}
		
		/** 加工賃・送料の計算 */
		this.calcProcessingPriceVo=this.formProcessingPriceService.calcProcessingPrice(danballOrderFormTopVo);
		/**  */
		model.addAttribute("danballOrderFormTopVo",danballOrderFormTopVo);
		/**  */
		model.addAttribute("calcProcessingPriceVo",this.calcProcessingPriceVo);
		
		return "exec";
	}
}
