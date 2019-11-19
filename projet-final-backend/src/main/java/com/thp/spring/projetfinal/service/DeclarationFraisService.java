package com.thp.spring.projetfinal.service;

import java.util.List;

import com.thp.spring.projetfinal.dto.DeclarationFraisDTO;

public interface DeclarationFraisService {
	
	
	DeclarationFraisDTO addFrais(DeclarationFraisDTO fraisDTO);

	DeclarationFraisDTO findById(Long id);

	List<DeclarationFraisDTO> findAll();


	void deleteFrais(Long id);

}
