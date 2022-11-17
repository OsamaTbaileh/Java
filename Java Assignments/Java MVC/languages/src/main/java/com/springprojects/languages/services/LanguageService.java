package com.springprojects.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprojects.languages.models.Language;
import com.springprojects.languages.repository.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	LanguageRepository languageRepository;
	
	//method to retrieve all languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	
	//method to find language by it's id
	public Language findLanguage(Long id) {
		Optional<Language> language = languageRepository.findById(id);
		if (language.isPresent()) {
			return language.get();
		}else {
			return null;
		}
	}
	
	//method to create a new language
	public Language createNewLanguage(Language newLanguage) {
		return languageRepository.save(newLanguage);
	}
	
	//method to delete language
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
	//method to update language
	public void updateLanguage(Language language) {
		languageRepository.save(language);
	}
}
