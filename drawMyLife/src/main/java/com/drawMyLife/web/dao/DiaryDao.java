package com.drawMyLife.web.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.drawMyLife.common.dao.AbstractDao;
import com.drawMyLife.web.vo.DiaryVO;

@Repository("diaryDao")
public class DiaryDao extends AbstractDao{
	
	public void insert(DiaryVO vo){
		insert("diary.insertDiary", vo);		
	}
	public List<DiaryVO> selectList(Map<String, Object> param){ 
		List<DiaryVO> list=selectList("diary.selectList",param);
		return list;
	}
}
