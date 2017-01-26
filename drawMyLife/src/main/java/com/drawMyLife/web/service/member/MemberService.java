package com.drawMyLife.web.service.member;

import java.util.List;
import java.util.Map;

import com.drawMyLife.web.vo.MemberVO;

public interface MemberService {
	List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception;
	void insertMember(MemberVO vo) throws Exception;
	int selectId(MemberVO vo);
	int selectIdAndPw(MemberVO vo);
	MemberVO selectOneInfo(MemberVO vo);
	
}
