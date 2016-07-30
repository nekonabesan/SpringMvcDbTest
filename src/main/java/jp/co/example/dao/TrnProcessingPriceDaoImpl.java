package jp.co.example.dao;

import java.util.List;

import jp.co.example.entity.TrnProcessingPrice;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.FetchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrnProcessingPriceDaoImpl implements TrnProcessingPriceDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * テーブルの全データを取得するメソッド
	 * @return List
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public List<TrnProcessingPrice> getSelectAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TrnProcessingPrice.class);
		return criteria.list();
	}
	
	/**
	 * 平米数、製作数毎の加工賃/1枚を取得するメソッド
	 * @param heibei
	 * @param pts
	 * @return TrnProcessingPrice
	 *  */
	@Override
	public TrnProcessingPrice getSelectParHeibei(double heibeiPerSeat,long pts){
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TrnProcessingPrice.class);
		/**
		 * ※一意の値が得られない場合、ファイル「/opt/tomcat/7/logs/catalina.out」でクエリ上における比較演算子の向きを確認すること
		 * */
		criteria.createAlias("mstThickness","mstThickness");
		criteria.createAlias("mstSeatAssort","mstSeatAssort");
		criteria.add(Restrictions.le("lowerHeibei",heibeiPerSeat));
		criteria.add(Restrictions.gt("upperHeibei",heibeiPerSeat));
		criteria.add(Restrictions.le("lowerPts",pts));
		criteria.add(Restrictions.gt("upperPts",pts));
		//Return
		return (TrnProcessingPrice)criteria.uniqueResult();
	}
	
}
