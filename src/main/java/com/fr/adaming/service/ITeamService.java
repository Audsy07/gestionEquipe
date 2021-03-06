package com.fr.adaming.service;

import java.util.List;

import com.fr.adaming.entity.Team;

public interface ITeamService {

	public void create(Team team);

	public Team readById(Long id);

	public List<Team> readAll();

	public Team update(Team team);

	public void delete(Team team);

}
