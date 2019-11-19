package com.thp.spring.projetfinal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.projetfinal.entities.MissionEntity;
@Repository
public interface MissionRepository extends JpaRepository< MissionEntity, Long>{
	public MissionEntity findByDescription(String description);
	public MissionEntity findByCollaborateurId(Long idUtilisateur);
	public List<MissionEntity> findByCollaborateurManagerId(Long idManager);
}
