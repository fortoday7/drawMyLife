package com.drawMyLife.web.service.member;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.drawMyLife.web.dao.MemberDao;
import com.drawMyLife.web.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService{
	@Resource(name="memberDao")
    private MemberDao memberDao;


	@Override
	public List<Map<String, Object>> selectBoardList(Map<String, Object> map) throws Exception {
		
		return memberDao.selectBoardList(map);
	}


	@Override
	public void insertMember(MemberVO vo) throws Exception {
		memberDao.insertMember(vo);
		
	}


	@Override
	public int selectId(MemberVO vo) {
		
		return memberDao.selectId(vo);
	}


	@Override
	public int selectIdAndPw(MemberVO vo) {
		// TODO Auto-generated method stub
		return memberDao.selectIdAndPw(vo);
	}


	@Override
	public MemberVO selectOneInfo(MemberVO vo) {
		// TODO Auto-generated method stub
		return memberDao.selectOneInfo(vo);
	}

}
