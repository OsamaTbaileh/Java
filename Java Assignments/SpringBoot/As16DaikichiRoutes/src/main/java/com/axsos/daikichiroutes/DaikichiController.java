package com.axsos.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
		
	@RequestMapping("")
	public String viewMain() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String firstRoute() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String secondRoute() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
