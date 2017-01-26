package com.drawMyLife.web.controller;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.drawMyLife.web.service.diary.DiaryService;
import com.drawMyLife.web.vo.DiaryVO;

@Controller
public class DiaryController {
	
	@Resource(name="diaryService")
	DiaryService diaryService;
	
	@RequestMapping(value = "/diary/insert", method = RequestMethod.GET)
	public String insertDiaryGet(HttpServletRequest req, HttpServletResponse resp)
	{
		return "diary/insert";
	}
	
	@RequestMapping(value = "/diary/insert", method = RequestMethod.POST)
	public String insertDiaryPost(@ModelAttribute DiaryVO vo,HttpServletRequest req, HttpServletResponse resp)
	{		
		diaryService.insertDiary(vo);
		return "redirect:/diary/list";
	}
	
	//다이어리 리스트
	@RequestMapping(value = "/diary/list", method = RequestMethod.GET)
	public ModelAndView listDiaryGet(HttpServletRequest req, HttpServletResponse resp)
	{
		ModelAndView mav=new ModelAndView("diary/list");
		
		
		HashMap<String, Object> map=new HashMap<String, Object>();
		
		String page=req.getParameter("page");
		
		if(page ==null || page.equals("")){
			page="1";
		}
		map.put("start", Integer.parseInt(page)-1);
		
		List<DiaryVO> list=diaryService.selectList(map);
		mav.addObject("diaryList", list);
		
		System.out.println(list);
		return mav;
	}
}
