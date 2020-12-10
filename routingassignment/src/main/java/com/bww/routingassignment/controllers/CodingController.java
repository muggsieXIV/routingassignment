package com.bww.routingassignment.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CodingController {
	@RequestMapping("/coding")
	public String one() {
		return "Hello Coding Dojo!";
	}
	@RequestMapping("/coding/python")
	public String two() {
		return "Python is dope af";
	}
	@RequestMapping("/coding/java")
	public String three() {
		return "Java is cool";
	}
}