package jp.co.example.dao;

import jp.co.example.entity.MstShippingBaseFee;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MstShippingPriceDaoImpl implements MstShippingPriceDao{

	@Autowired
	private SessionFactory sessionFactory;

	/**
	 * 平米数、製作数毎の送料を取得するメソッド
	 * @param DanballOrderFormTopVo
	 *  */
	@Override
	public MstShippingBaseFee getSelectPerHeibei(Long prefecture) {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(MstShippingBaseFee.class);
		/**
		 * ※一意の値が得られない場合、ファイル「/opt/tomcat/7/logs/catalina.out」でクエリ上における比較演算子の向きを確認すること
		 * */
		criteria.add(Restrictions.eq("prifectureId",prefecture));
		//Return
		return (MstShippingBaseFee)criteria.uniqueResult();
		
	}
}
