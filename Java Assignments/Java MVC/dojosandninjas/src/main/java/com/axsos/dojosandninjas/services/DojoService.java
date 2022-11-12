package com.axsos.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.dojosandninjas.models.Dojo;
import com.axsos.dojosandninjas.repositories.DojoRepository;


@Service
public class DojoService {
	@Autowired
	DojoRepository dojoRepository;
	
	public List<Dojo> findAll(){
		return dojoRepository.findAll();
	}
	
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> optional = dojoRepository.findById(id);
			if(optional.isPresent()) {
				return optional.get();
			}
			else {
				return null;
			}
	}
	
	public void deleteDojo(Long id) {
		dojoRepository.deleteById(id);
	}
}
