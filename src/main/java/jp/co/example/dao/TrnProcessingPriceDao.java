package jp.co.example.dao;

import java.util.List;

import jp.co.example.entity.TrnProcessingPrice;


public interface  TrnProcessingPriceDao {
	/**
	 * Sample
	 *  */
//	public TrnProcessingPrice selectAll();
	
	/**
	 * 
	 *  
	 *  */
	public List<TrnProcessingPrice> getSelectAll();
	
	/**
	 * 
	 *  
	 *  */
	public TrnProcessingPrice getSelectParHeibei(double heibeiPerSeat,long pts);
}
