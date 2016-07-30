package jp.co.example.service;

import java.util.List;

import jp.co.example.entity.TrnProcessingPrice;
import jp.co.example.vo.CalcProcessingPriceVo;
import jp.co.example.vo.DanballOrderFormTopVo;

public interface FormProcessingPriceService {
	
	/**
	 * 
	 * 
	 *  */
	public List<TrnProcessingPrice> selectAllService();

	/**
	 * 
	 *  
	 *  */
	public CalcProcessingPriceVo calcProcessingPrice(DanballOrderFormTopVo danballOrderFormTop);
	
	/**
	 * 
	 *  
	 *  */
	public void printFeeCalc(DanballOrderFormTopVo danballOrderFormTop);
	
	/** 
	 * 
	 *  
	 *  */
	public void chkFormInputValue(DanballOrderFormTopVo danballOrderFormTop);
	
	/** 
	 * 
	 * 
	 *  */
	public void shippingFeeCalc(DanballOrderFormTopVo danballOrderFormTop);
}
