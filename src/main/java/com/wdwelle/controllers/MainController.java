package com.wdwelle.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.wdwelle.models.Dojo;
import com.wdwelle.services.MainService;

@Controller
public class MainController {
	@Autowired
	MainService mainService;
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo")Dojo dojo) {
		return "newDojo";
	}
	
	@PostMapping("/dojos/add")
	public String createDojo(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}else {
			mainService.saveDojo(dojo);
			return "redirect:/";
		}
	}
}
