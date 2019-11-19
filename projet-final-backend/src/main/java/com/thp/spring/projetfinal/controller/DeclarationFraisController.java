package com.thp.spring.projetfinal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetfinal.dto.DeclarationFraisDTO;
import com.thp.spring.projetfinal.service.DeclarationFraisService;

@RestController
@CrossOrigin("*")
public class DeclarationFraisController {
	
	@Autowired
	DeclarationFraisService fraisService;
	
	
	@GetMapping(value = "/frais")
	public List<DeclarationFraisDTO> getAllDeclaration() {
		return fraisService.findAll();
	}
	
	@DeleteMapping(value = "/frais/{idFrais}")
	public void deleteFrais(@PathVariable Long idFrais) {
		fraisService.deleteFrais(idFrais);
	}
	
	@PostMapping(value = "/frais")
	public void addFrais(@RequestBody DeclarationFraisDTO fraisDTO) {
		fraisService.addFrais(fraisDTO);
	}

}
