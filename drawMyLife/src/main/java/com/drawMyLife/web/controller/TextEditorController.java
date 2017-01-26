package com.drawMyLife.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TextEditorController {
	
	@RequestMapping(value="/editor/daum_frame", method=RequestMethod.GET)
	String textEditorGet(HttpServletRequest req, HttpServletResponse resp)
	{
		System.out.println("daum editor 요청");
		return "common/editor_frame";
	}
}
