package com.imagegrafia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.model.Student;

@RestController
@RequestMapping("/api")
public class HomeController {

	@RequestMapping(value="/info",method=RequestMethod.GET)
	public String[] getInfo() {
//		String str[] = {"Ashish","Btech","8599894881s"};
		return new String []{"Ashish","Btech","8599894881s"};
	}
	@GetMapping
	public Student info() {
		
		return new Student();
	}
}
