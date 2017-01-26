package com.drawMyLife.web.service.diary;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.drawMyLife.web.dao.DiaryDao;
import com.drawMyLife.web.vo.DiaryVO;

@Service("diaryService")
public class DiaryServiceImpl implements DiaryService{

	@Resource(name="diaryDao")
	DiaryDao diaryDao;
	
	@Override
	public void insertDiary(DiaryVO vo) {
		diaryDao.insert(vo);
	}

	@Override
	public List<DiaryVO> selectList(HashMap<String, Object> param) {
		
		return diaryDao.selectList(param);
	}

}
