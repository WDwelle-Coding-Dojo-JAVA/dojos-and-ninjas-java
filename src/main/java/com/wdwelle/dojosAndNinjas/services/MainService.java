package com.wdwelle.dojosAndNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wdwelle.dojosAndNinjas.models.Dojo;
import com.wdwelle.dojosAndNinjas.models.Ninja;
import com.wdwelle.dojosAndNinjas.repositories.DojoRepository;
import com.wdwelle.dojosAndNinjas.repositories.NinjaRepository;
@Service
public class MainService {
	@Autowired
	NinjaRepository ninjaRepo;
	
	@Autowired
	DojoRepository dojoRepo;
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public Ninja saveNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Dojo saveDojo(Dojo dojo) {
		return dojoRepo.save(dojo);
	}
}
