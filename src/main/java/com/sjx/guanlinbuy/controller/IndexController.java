package com.sjx.guanlinbuy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("index")
public class IndexController {

	@RequestMapping("/")
	public String sayHello(){
		return "i love you so much,Ya Ge";
	}
}
