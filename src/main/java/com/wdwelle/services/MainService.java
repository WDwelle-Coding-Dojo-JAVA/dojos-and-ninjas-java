package com.wdwelle.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wdwelle.models.Dojo;
import com.wdwelle.models.Ninja;
import com.wdwelle.repositories.DojoRepository;
import com.wdwelle.repositories.NinjaRepository;

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
