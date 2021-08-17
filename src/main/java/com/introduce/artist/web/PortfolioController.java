package com.introduce.artist.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PortfolioController {

//	@RequestMapping( name = "/main.do",method = RequestMethod.GET )
//	public PortfolioViewModel showList(PortfolioViewModel vm) {
//			
//		return vm;
//	}
	@RequestMapping( "/main.do" )
	public String showList(PortfolioViewModel vm) {
			
		return "main";
	}
	
	@RequestMapping( "/owen.do" )
	public String showViewt(PortfolioViewModel vm) {
			
		return "Owen";
	}
	
}
