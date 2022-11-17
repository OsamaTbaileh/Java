package com.springprojects.languages.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springprojects.languages.models.Language;
import com.springprojects.languages.services.LanguageService;

@Controller
public class LanguageController {
	@Autowired
	LanguageService languageService;
	//routes
	//first page (home page which represent all languages and create new one)
	//first mapping to render the home page
	@GetMapping("/")
	public String homePage() {
		return "redirect:/languages";
	}
	//second mapping to represent all languages
	@GetMapping("/languages")
	public String allLanguages(@ModelAttribute("newLanguage") Language newLangauge,Model model){
		List<Language> allLanguages = languageService.allLanguages();
		model.addAttribute("allLanguages", allLanguages);
		return "homePage.jsp";
	}
	//third mapping to create a new language from form
	@PostMapping("/languages")
	public String createNewLanguage(@Valid @ModelAttribute("newLanguage") Language newLangauge, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Language> allLanguages = languageService.allLanguages();
			model.addAttribute("allLanguages", allLanguages);
			return "homePage.jsp";
		}else {
			languageService.createNewLanguage(newLangauge);
			return "redirect:/languages";
		}
	}
	//second page which is editing language
	//method to render edit page
	@GetMapping("/languages/edit/{id}")
	public String editPage(@PathVariable("id") Long id, Model model) {
		Language language = languageService.findLanguage(id);
		model.addAttribute("updatedlanguage", language);
		return "editPage.jsp";
	}
	//method to edit 
	@PutMapping("/langauges/edit/{id}")
	public String editLanguage(@Valid @ModelAttribute("updatedlanguage") Language updatedLanguage, BindingResult result) {
		if(result.hasErrors()) {
			return "editPage.jsp";
		}else {
			languageService.updateLanguage(updatedLanguage);
			return "redirect:/";
		}
	}
	
	//method to delete 
	@RequestMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}
	
	//method to show the language its self
	@GetMapping("/languages/{id}")
	public String view(@PathVariable("id") Long id, Model model) {
		Language theLanguage = languageService.findLanguage(id);
		model.addAttribute("theLanguage", theLanguage);
		return "view.jsp";
	}
}
