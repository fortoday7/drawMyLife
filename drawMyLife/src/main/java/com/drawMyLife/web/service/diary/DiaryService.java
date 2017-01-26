package com.drawMyLife.web.service.diary;

import java.util.HashMap;
import java.util.List;

import com.drawMyLife.web.vo.DiaryVO;

public interface DiaryService {

	void insertDiary(DiaryVO vo);
	List<DiaryVO> selectList(HashMap<String, Object> param);
}
