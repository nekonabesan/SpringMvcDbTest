package jp.co.example.dao;

import jp.co.example.entity.TrnPrintProcessingPrice;

public interface TrnPrintProcessingPriceDao {
	public TrnPrintProcessingPrice getSelectParHeibei(double heibeiPerSeat,long pts);
}
