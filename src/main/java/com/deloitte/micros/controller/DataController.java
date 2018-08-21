package com.deloitte.micros.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.jr.ob.JSON;

@RestController
public class DataController {

	@RequestMapping("/data")
	public String getData() {
		JSON json = new JSON();		
		System.out.println("data invoked! "+json.toString());
		return json.toString();
	}
}
