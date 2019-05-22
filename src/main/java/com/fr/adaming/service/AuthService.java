package com.fr.adaming.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IDaoUser;
import com.fr.adaming.entity.User;

@Service
public class AuthService implements IAuthService{

	@Autowired
	private IDaoUser dao; 
	
	@Override
	public void login(String email, String pwd) {
//		return dao.login();
		dao.findByLoginAndPwd(email, pwd);
		
	}

	@Override
	public User register(User user) {
	
		return dao.save(user);
	}

}
