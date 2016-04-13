package com.d2cloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/", method=RequestMethod.GET)
public class ServerController {
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String get() {
		return "hello world from agent!";
	}

}
