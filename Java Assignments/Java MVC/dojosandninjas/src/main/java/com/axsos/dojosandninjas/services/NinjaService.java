package com.axsos.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axsos.dojosandninjas.models.Ninja;
import com.axsos.dojosandninjas.repositories.NinjaRepository;


@Service
public class NinjaService {
	@Autowired 
	NinjaRepository ninjaRepository;
	
	public List<Ninja> findAll() {
		return ninjaRepository.findAll();
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optional = ninjaRepository.findById(id);
			if(optional.isPresent()) {
				return optional.get();
			}
			else {
				return null;
			}
	}
	
	public void deleteNinja(Long id) {
		ninjaRepository.deleteById(id);
	}
}
