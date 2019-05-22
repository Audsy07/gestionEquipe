package com.fr.adaming.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity 
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Team {
	
	@Id
	private Long id;
	
	@Column
	private String nomTeam;
	
	@Column
	private String niveau;
	
	@OneToMany
	private List<User> users;
	
//	private List<Team> listTeam;
	
	

}
