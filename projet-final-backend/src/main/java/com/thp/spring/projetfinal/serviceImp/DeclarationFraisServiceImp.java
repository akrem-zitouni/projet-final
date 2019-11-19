package com.thp.spring.projetfinal.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.spring.projetfinal.dto.DeclarationFraisDTO;
import com.thp.spring.projetfinal.entities.DeclarationFraisEntity;
import com.thp.spring.projetfinal.helper.ModelMapperConverter;
import com.thp.spring.projetfinal.repository.DeclarationFraisRepository;
import com.thp.spring.projetfinal.service.DeclarationFraisService;

@Service
public class DeclarationFraisServiceImp implements DeclarationFraisService {

	@Autowired
	DeclarationFraisRepository fraisRepository;

	@Override
	public DeclarationFraisDTO addFrais(DeclarationFraisDTO fraisDTO) {
		DeclarationFraisEntity fraisEntity = ModelMapperConverter.converToEntity(fraisDTO,
				DeclarationFraisEntity.class);
		return ModelMapperConverter.converToDTO(fraisRepository.save(fraisEntity), DeclarationFraisDTO.class);
	}

	@Override
	public DeclarationFraisDTO findById(Long id) {
		DeclarationFraisEntity frais = fraisRepository.findById(id).orElse(null);
		return ModelMapperConverter.converToDTO(frais, DeclarationFraisDTO.class);
	}

	@Override
	public List<DeclarationFraisDTO> findAll() {
		List<DeclarationFraisEntity> frais = fraisRepository.findAll();
		return ModelMapperConverter.convertAllToDTO(frais, DeclarationFraisDTO.class);
	}

	@Override
	public void deleteFrais(Long id) {
		fraisRepository.deleteById(id);

	}

}
