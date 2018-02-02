package com.deloitte.micros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String user, Model model) {
    	System.out.println("Request received");
//		if(null==user || user.isEmpty())
//			user = "World";
		model.addAttribute("name",user);
		return "greetings";
	}
}
