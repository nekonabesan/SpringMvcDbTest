package jp.co.example.dao;

import jp.co.example.entity.MstShippingBaseFee;

public interface MstShippingPriceDao {
	public MstShippingBaseFee getSelectPerHeibei(Long prefectureId);
}
