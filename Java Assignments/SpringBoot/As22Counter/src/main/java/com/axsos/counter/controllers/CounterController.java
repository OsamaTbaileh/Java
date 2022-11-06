package com.axsos.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/your_server")
public class CounterController {
	
	@RequestMapping("")
	public String viewIndex(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		
		return "index.jsp";
	}
	
	
	

	
	
	@RequestMapping("/counter_add2")
	public String viewCount2(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount +=2;
			session.setAttribute("count", currentCount);
		}
		
		return "index2.jsp";
	}
	
	
	
	
	
	
	@RequestMapping("/counter")
//	u can remove the below code and it will work but the counter will start with nothing rather than starting with 0
	public String viewCounter(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}

		return "counter.jsp";
	}
	
	
	
	
	
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", 0);
		return "counter.jsp";
	}

}
