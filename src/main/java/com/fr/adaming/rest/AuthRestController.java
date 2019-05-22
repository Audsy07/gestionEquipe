package com.fr.adaming.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.entity.User;
import com.fr.adaming.service.IAuthService;

@RestController
@RequestMapping(path = "api/auth")
public class AuthRestController {
	
	
	private IAuthService service; 
	
	@RequestMapping(path="/login", method =RequestMethod.POST)
	public void login(String email, String pwd) {
		
		
	}
	
	@RequestMapping(path="/register", method = RequestMethod.GET)
	public User register(User user) {
		user.getNom();
		user.getPrenom();
		user.getEmail();
		user.getPwd();
		
		return service.register(user);
		
	}

}
