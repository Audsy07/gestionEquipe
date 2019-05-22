package com.fr.adaming.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class RegisterUserDto {

	private String nom;
	 
	private String prenom;
	
	@Email @NotNull
	private String email; 
	
	@NotNull
	private String pwd; 

}
