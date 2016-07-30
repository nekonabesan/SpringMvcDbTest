package jp.co.example.dao;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.example.entity.TrnPrintProcessingPrice;

@Repository
public class TrnPrintProcessingPriceDaoImpl implements TrnPrintProcessingPriceDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * 平米数、製作数毎の加工賃/1枚を取得するメソッド
	 * @param heibei
	 * @param pts
	 * @return TrnPrintProcessingPrice
	 *  */
	@Override
	public TrnPrintProcessingPrice getSelectParHeibei(double heibeiPerSeat,long pts){
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(TrnPrintProcessingPrice.class);
		/**
		 * ※一意の値が得られない場合、ファイル「/opt/tomcat/7/logs/catalina.out」でクエリ上における比較演算子の向きを確認すること
		 * */
		criteria.add(Restrictions.lt("lowerHeibei",heibeiPerSeat));
		criteria.add(Restrictions.ge("upperHeibei",heibeiPerSeat));
		criteria.add(Restrictions.lt("lowerPts",pts));
		criteria.add(Restrictions.ge("upperPts",pts));
		//Return
		return (TrnPrintProcessingPrice)criteria.uniqueResult();
	};
}
