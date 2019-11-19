package com.thp.spring.projetfinal.entities;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "frais")
public class DeclarationFraisEntity extends MyEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2572099151627148056L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_frais")
	private Long id;
	@Column(name = "description")
	private String description;
	@Column(name = "date_declaration")
	private Date dateDeclaration;
	@Column(name = "file_declaration")
	private File fichier;
	@ManyToOne
	@JoinColumn(name = "mission_id")
	private MissionEntity missionFrais;

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

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	public File getFichier() {
		return fichier;
	}

	public void setFichier(File fichier) {
		this.fichier = fichier;
	}

	public MissionEntity getMissionFrais() {
		return missionFrais;
	}

	public void setMissionFrais(MissionEntity missionFrais) {
		this.missionFrais = missionFrais;
	}

	public DeclarationFraisEntity(Long id, String description, Date dateDeclaration, File fichier,
			MissionEntity missionFrais) {
		super();
		this.id = id;
		this.description = description;
		this.dateDeclaration = dateDeclaration;
		this.fichier = fichier;
		this.missionFrais = missionFrais;
	}

	public DeclarationFraisEntity(String description, Date dateDeclaration, File fichier, MissionEntity missionFrais) {
		super();
		this.description = description;
		this.dateDeclaration = dateDeclaration;
		this.fichier = fichier;
		this.missionFrais = missionFrais;
	}

	public DeclarationFraisEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DeclarationFraisEntity [id=" + id + ", description=" + description + ", dateDeclaration="
				+ dateDeclaration + ", fichier=" + fichier + ", missionFrais=" + missionFrais + "]";
	}

}
