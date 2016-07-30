package jp.co.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.example.dao.MstPrefectureDao;
import jp.co.example.entity.MstPrefecture;

@Service
public class DanballFormServiceImpl implements DanballFormService{
	
	@Autowired
	private MstPrefectureDao mstPrefectureDao;
	
	private List<MstPrefecture>mstPrefecture;

	@Override
	@Transactional
	public List<MstPrefecture> getPrefectureAll() {
		this.mstPrefecture=mstPrefectureDao.selectPrefectureAll();
		return this.mstPrefecture;
	}

}
