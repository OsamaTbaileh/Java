package com.axsos.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsos.dojosandninjas.models.Dojo;
import com.axsos.dojosandninjas.models.Ninja;
import com.axsos.dojosandninjas.services.DojoService;
import com.axsos.dojosandninjas.services.NinjaService;


@Controller
public class MainController {
	
	@Autowired
	DojoService dojoService;
	
	@Autowired 
	NinjaService ninjaService;
	
	
	@GetMapping("/")
	public String home() {
	return "redirect:/dojos/new";
	}
	
	@GetMapping("/dojos/new")
	public String viewHome(@ModelAttribute("dojo") Dojo dojo) {
		return "home.jsp";
	}
	
	@PostMapping("dojos/new")
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "home.jsp";
		}
		else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
		
	
	@GetMapping("/ninjas/new")
	public String viewAddNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojosFromController", dojoService.findAll());
		return "addNinja.jsp";
	}
		
	@PostMapping("/ninjas/new")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result){
		if(result.hasErrors()) {
			return "addNinja.jsp";
		}
		else {
			ninjaService.createNinja(ninja);
			return"redirect:/ninjas/new";
		}
	}
	
	
	@GetMapping("/dojos/{id}")
	public String viewAddNinja(@PathVariable("id") Long id, Model model) {
		model.addAttribute("dojo", dojoService.findDojo(id));
		return "dojoPage.jsp";
	}
}
	
