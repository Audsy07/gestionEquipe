package com.fr.adaming.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fr.adaming.dto.RegisterUserDto;
import com.fr.adaming.entity.User;
import com.fr.adaming.service.IUserService;

@RestController
@RequestMapping(path = "api/users")
public class UserRestController {

	@Autowired
	private IUserService service;

	@RequestMapping(method = RequestMethod.POST)
	public void create(@Valid @RequestBody RegisterUserDto dto) {

		User user = new User();
		user.setNom(dto.getNom());
		user.setPrenom(dto.getPrenom());
		user.setEmail(dto.getEmail());
		user.setPwd(dto.getPwd());

		service.create(user);

	}

	@RequestMapping(path = "/{id}", method = RequestMethod.GET)
	public User readById(@PathVariable Long id) {

		return service.readById(id);
	}

	@RequestMapping(method = RequestMethod.GET)
	public List<User> readAll() {

		return service.readAll();
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void update(@Valid @RequestBody User user) {

		service.update(user);
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete(@RequestBody User user) {
		service.delete(user);

	}

}
