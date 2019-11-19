package com.thp.spring.projetfinal.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thp.spring.projetfinal.dto.MissionDTO;
import com.thp.spring.projetfinal.dto.TacheMissionDTO;
import com.thp.spring.projetfinal.service.MissionService;
import com.thp.spring.projetfinal.service.TacheMissionService;
import com.thp.spring.projetfinal.service.UtilisateurService;
import com.thp.spring.projetfinal.util.Priorite;
import com.thp.spring.projetfinal.util.Statut;

import com.thp.spring.projetfinal.dto.MailDTO;
import com.thp.spring.projetfinal.service.EmailService;

@RestController
@CrossOrigin("*")
public class TacheMissionController {

	@Autowired
	TacheMissionService tacheMissionService;
	@Autowired
	EmailService emailService;
	@Autowired
	MissionService missionService;
	@Autowired
	UtilisateurService utilisateurService;

	@GetMapping(value = "/taches")
	public List<TacheMissionDTO> findAll() {
		return tacheMissionService.findAll();
	}

	@PutMapping(value = "/taches/update", produces = MediaType.APPLICATION_JSON_VALUE)
	public TacheMissionDTO updateTask(@RequestBody TacheMissionDTO taskToUpdate) {
		return tacheMissionService.addTask(taskToUpdate);
	}

	@GetMapping(value = "/taches/{idUser}")
	public List<TacheMissionDTO> findMissionByUtilisateur(@PathVariable Long idUser) {
		return tacheMissionService.getTacheMissionByUtilisateurId(idUser);

	}

	@GetMapping(value = "/tachesp/{priorite}")
	public List<TacheMissionDTO> findMissionByUserAndPriorite(@PathVariable Long idUser) {

		return tacheMissionService.getTacheMissionByUtilisateurId(idUser);

	}

	@GetMapping(value = "/tachesCollaborateur/{idUser}")

	public List<TacheMissionDTO> getTacheCollaborateur(@PathVariable Long idUser) {
		List<TacheMissionDTO> tacheCollaborateur = new ArrayList<TacheMissionDTO>();
		List<TacheMissionDTO> tacheCollaborateurById = tacheMissionService.getTacheMissionByUtilisateurId(idUser);
		for (TacheMissionDTO tacheDTO : tacheCollaborateurById) {
			if (tacheDTO.getStatus() == Statut.DOING && tacheDTO.getPriorite() == Priorite.p0) {
				tacheCollaborateur.add(tacheDTO);
			}
		}
		System.out.println(tacheCollaborateur);
		return tacheCollaborateur;
	}

	@GetMapping(value = "/mailManager/{idManager}")
	public void evoyerEmail(@PathVariable Long idManager) {
		MailDTO mMessage = new MailDTO();
		List<MissionDTO> missionManager = missionService.findByCollaborateurManagerId(idManager);
		for (MissionDTO m : missionManager) {
			Set<TacheMissionDTO> al = m.getTachesMissions();

		
				for (Iterator<TacheMissionDTO> itr = al.iterator(); itr.hasNext();) {
					TacheMissionDTO tm = itr.next();
					System.out.println(tm+"---------------");
					if (tm.getStatus() == Statut.DONE && tm.getPriorite() == Priorite.p0) {
						String[] s = new String[] { utilisateurService.findById(idManager).getMail() };

					System.out.println(s);
					mMessage.setTo(s);
					mMessage.setSubject("test manager");
					mMessage.setText("test manager");
					emailService.sendEmail(mMessage);
						System.out.println("émail envoyé");

					}

				}

			}

		}
	
}
