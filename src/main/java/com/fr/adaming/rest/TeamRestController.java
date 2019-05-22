package com.fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.Team;
import com.fr.adaming.service.ITeamService;

@RestController
@RequestMapping(path = "api/teams")
public class TeamRestController {
	
	@Autowired
	private ITeamService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody Team team) {
		
		service.create(team);
		
	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public Team readParId(@PathVariable Long id) {
		return service.readById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<Team> readAll() {
		
		return service.readAll();
	}

	@RequestMapping(method = RequestMethod.PUT)
	public Team update(Team team) {
		
		return service.update(team);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(Team team) {
		
		service.delete(team);
		
	}	
	
}
