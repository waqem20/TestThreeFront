package com.wh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.wh.manager.StudentManager;
import com.wh.view.StudentView;

@RestController
public class StudentAddController {

	@Autowired
	private StudentManager studentManager;

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {
		System.out.println("in the student page");
		return new ModelAndView("student");
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute("person") StudentView student, BindingResult bindingResult) {
		System.out.println("Controller Front AddStudent Method: " + student);
		studentManager.saveStudent(student);
		return new ModelAndView("result", "person", student);
	}

}
