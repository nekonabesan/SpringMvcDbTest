package jp.co.example.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jp.co.example.entity.MstPrefecture;
import jp.co.example.entity.TrnProcessingPrice;

@Repository
public class MstPrefectureDaoImpl implements MstPrefectureDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	/**
	 * テーブルの全データを取得するメソッド
	 * @return List
	 * */
	@SuppressWarnings("unchecked")
	@Override
	public List<MstPrefecture> selectPrefectureAll(){
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(MstPrefecture.class);
		return criteria.list();
	};
}
