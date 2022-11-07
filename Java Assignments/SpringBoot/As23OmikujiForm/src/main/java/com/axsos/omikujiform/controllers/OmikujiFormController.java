package com.axsos.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/omikuji")
public class OmikujiFormController {

	@RequestMapping("")
	public String viewForm() {
		return "form.jsp";
	}
	
	
	@RequestMapping(value ="/form", method=RequestMethod.POST)
	public String processForm(
			@RequestParam(value="number") String number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="thing") String thing,
			@RequestParam(value="say") String say,
			HttpSession session
			) {
			session.setAttribute("number", number);
			session.setAttribute("city", city);
			session.setAttribute("person", person);
			session.setAttribute("thing", thing);
			session.setAttribute("say", say);
		return "redirect:/omikuji/show";
		
	}
	
	
	@GetMapping("/show")
	public String viewShowPage() {
		return "show.jsp";
		
	}
	
	
}
