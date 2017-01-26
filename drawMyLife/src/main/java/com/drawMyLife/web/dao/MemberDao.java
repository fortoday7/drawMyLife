package com.drawMyLife.web.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.drawMyLife.common.dao.AbstractDao;
import com.drawMyLife.web.vo.MemberVO;

@Repository("memberDao")
public class MemberDao extends AbstractDao {

	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) {

		return (List<Map<String, Object>>) selectList("member.selectMemberList");

	}

	public void insertMember(MemberVO vo) {
		insert("member.insertMember", vo);
	}

	public int selectId(MemberVO vo) {
		
		return (Integer) selectOne("member.selectId", vo);
	}

	public int selectIdAndPw(MemberVO vo) {
		
		return (Integer) selectOne("member.selectIdAndPw", vo);
	}

	public MemberVO selectOneInfo(MemberVO vo) {
		
		return (MemberVO) selectOne("member.selectOneInfo", vo);
	}
}
