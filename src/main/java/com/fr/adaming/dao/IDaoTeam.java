package com.fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fr.adaming.entity.Team;
import com.fr.adaming.entity.User;

@Repository
public interface IDaoTeam extends JpaRepository<Team, Long>{
	

	
}
