package com.thp.spring.projetfinal.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.thp.spring.projetfinal.util.Statut;

public class MissionDTO extends MyDTO {

	private Long id;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	@JsonIgnoreProperties({"mission"})
	private UtilisateurDTO collaborateur;
	private ModeleDTO model;
	private Set<TacheMissionDTO> tachesMissions = new HashSet<TacheMissionDTO>();
	private Statut status = Statut.TODO;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public UtilisateurDTO getCollaborateur() {
		return collaborateur;
	}
	public void setCollaborateur(UtilisateurDTO collaborateur) {
		this.collaborateur = collaborateur;
	}
	public ModeleDTO getModel() {
		return model;
	}
	public void setModel(ModeleDTO model) {
		this.model = model;
	}
	public Set<TacheMissionDTO> getTachesMissions() {
		return tachesMissions;
	}
	public void setTachesMissions(Set<TacheMissionDTO> tachesMissions) {
		this.tachesMissions = tachesMissions;
	}
	public Statut getStatus() {
		return status;
	}
	public void setStatus(Statut status) {
		this.status = status;
	}
	public MissionDTO(Long id, String description, Date dateDebut, Date dateFin, UtilisateurDTO collaborateur,
			ModeleDTO model, Set<TacheMissionDTO> tachesMissions, Statut status) {
		super();
		this.id = id;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.collaborateur = collaborateur;
		this.model = model;
		this.tachesMissions = tachesMissions;
		this.status = status;
	}
	public MissionDTO(String description, Date dateDebut, Date dateFin, UtilisateurDTO collaborateur, ModeleDTO model,
			Set<TacheMissionDTO> tachesMissions, Statut status) {
		super();
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.collaborateur = collaborateur;
		this.model = model;
		this.tachesMissions = tachesMissions;
		this.status = status;
	}
	
	public MissionDTO() {
		super();
	}

	
	@Override
	public String toString() {
		return "MissionEntity [id=" + id + ", description=" + description + ", dateDebut=" + dateDebut + ", dateFin="
				+ dateFin +  ", status=" + status + "]";
	}
	

}
