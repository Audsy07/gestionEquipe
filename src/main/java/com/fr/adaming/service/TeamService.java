package com.fr.adaming.service;

import java.util.List;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IDaoTeam;
import com.fr.adaming.entity.Team;

@Service
public class TeamService implements ITeamService{
	
	@Autowired
	private IDaoTeam dao;
	
	private Logger log = Logger.getLogger(TeamService.class);

	@Override
	public void create(Team team) {
		
	try {
		
		if ((team.getId() == null) || (team.getId() == 0)) {
			dao.save(team);	
			
		}
			
		} catch (Exception e) {
			log.debug("DEBUG : L'équipe existe déjà");
		}	
		
//		if (team.getId()==null) {
//		dao.save(team);		
//	}else System.out.println("L'équipe existe déjà");
//		
	}

	@Override
	public Team readById(Long id) {
		
		try {
			if (id!=null) {
				
				dao.findById(id).get();
			}
			
		} catch (Exception e) {
			log.debug("DEBUG readById Team : L'équipe n'a pas été trouvé");
		
		}return null;
		
	}

	@Override
	public List<Team> readAll() {
		
		return dao.findAll();
	}

	@Override
	public Team update(Team team) {
		
		if (team.getId()!=null) {
			
			dao.save(team);
			
		} return null;
	}

	@Override
	public void delete(Team team) {
		
		try {		
			dao.delete(team);
			
		} catch (Exception e) {
			log.debug("DEBUG deleteTeam : l'équipe n'a pas été supprimé");
		}
		
	}
	
}
