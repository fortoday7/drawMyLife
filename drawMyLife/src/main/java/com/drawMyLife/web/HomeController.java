package com.drawMyLife.web;

import java.util.Locale;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.drawMyLife.web.service.member.MemberServiceImpl;

@Controller
public class HomeController {
	
	@Resource(name="memberService")
	private MemberServiceImpl memberService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model,HttpSession session) throws Exception {
		System.out.println("session name "+session.getAttribute("sname"));
		
		return "home";
	}	
}
