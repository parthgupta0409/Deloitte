package com.delloite.cms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
@RequestMapping("/dosome")
public ModelAndView sdsd() {
	ModelAndView view=new ModelAndView();
	view.addObject("msg", "done");
	view.setViewName("sayHello");
	return view;
}
}
