package com.fr.adaming.service;

import org.springframework.stereotype.Service;

import com.fr.adaming.entity.User;


public interface IAuthService{
	
	public void login(String email, String pwd);
	
	public User register(User user);

}
