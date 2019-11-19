package com.thp.spring.projetfinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thp.spring.projetfinal.entities.DeclarationFraisEntity;

@Repository
public interface DeclarationFraisRepository extends JpaRepository<DeclarationFraisEntity, Long>{

}
