package com.techiepark.tinyurl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.techiepark.tinyurl.model.TinyUrl;
import com.techiepark.tinyurl.service.TinyUrlService;

@Controller
public class URLRegistrationController {

	@Autowired
	TinyUrlService tinyUrlService;

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView view = new ModelAndView("register");
		view.addObject("url", new TinyUrl());
		return view;
	}

	@RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
	public ModelAndView addUrl(HttpServletRequest request, HttpServletResponse response,
			@ModelAttribute("url") TinyUrl tinyUrl) {
		tinyUrlService.registerUrl(tinyUrl);
		return new ModelAndView("welcome", "url", tinyUrl.getUrl());
	}
}
