package com.bww.routingassignment.controllers;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
public class DojoControllers {
	@RequestMapping("/dojo")
	public String four() {
		return "The Dojo is awesome";
	}
	@RequestMapping("/burbank-dojo/")
	public String five() {
		return "Burbank dojo is in southern California.";
	}
	@RequestMapping("/san-jose/")
	public String six() {
		return "SJ dojo is the dojo HQ";
	}
}
