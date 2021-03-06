package com.ci.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ci.controller.form.Student;

import ch.qos.logback.core.joran.event.SaxEvent;

@Controller
public class StudentController {
	
	@GetMapping("show")
	public ModelAndView getData() {
		ModelAndView mav = new ModelAndView();
		Student s1 = new Stutent();
		//data
		mav.addObject("s1", s1);
		//view
		mav.setViewName("login");
		return mav;
	}
	
	@PostMapping("save")
	public ModelAndView saveData(Student s1) {
		ModelAndView mav = new ModelAndView();
		//data
		mav.addObject("s1", s1);
		//view
		mav.setViewName("success");
		System.out.println(s1);
		return mav;
	}
}
