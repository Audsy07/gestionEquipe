package com.fr.adaming.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.fr.adaming.dao.IDaoUser;
import com.fr.adaming.entity.User;

@Service
public class UserService implements IUserService {

	private Logger log = Logger.getLogger(UserService.class);

	@Autowired
	private IDaoUser dao;

	@Override
	public User create(User user) {

		try {

			if (user != null) {
				// if ((user.getId() == null) || (user.getId() == 0) || (user.getEmail()!=
				// null)) {
				dao.save(user);
				log.trace("Trace createUser: Un utilisateur est créé");
				return user;
			}

		} catch (Exception e) {

			if ((e instanceof SQLIntegrityConstraintViolationException)
					|| (e instanceof DataIntegrityViolationException) || (e instanceof ConstraintViolationException)) {
				
				e.printStackTrace();

				log.error("ERROR createUser: l'email existe déjà");

			} else
				log.debug("DEBUG createUser : l'utilisateur n'est pas valide");

		}
		return null;

	}

//		if ((user.getId() == null) || (user.getId() == 0)) {
//			dao.save(user);
//			System.out.println("DEBUG create : Un utilisateur est créé");
//
//		} else {
//
//			if (dao.existsById(user.getId())) {
//
//				log.debug("DEBUG create : ID déjà existant");
//
//			} else
//			dao.save(user);
//			log.debug("DEBUG create : L'utilisateur existe déjà");

	@Override
	public User readById(Long id) {

		try {

			if (id != null) {
				dao.findById(id).get();
				log.debug("DEBUG readById: l'utilisateur" + " " + id + " " + "a été trouvé");
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.debug("DEBUG readById: l'utilisateur n'a pas été trouvé par son id");
		}
		return null;
	}

	@Override
	public List<User> readAll() {
		
		List<User> list = dao.findAll();
		
		System.out.println("La liste des utilisateurs est:" +list);
		
		return list;
		
		

	}

	@Override
	public void update(User user) {

		try {

			if (user.getId() != null) {
				dao.save(user);
				log.debug("DEBUG update: un utilisateur a été mis à jour");
			}

		} catch (Exception e) {
			e.printStackTrace();
			log.debug("DEBUG updateTeam: L'utilisateur n'a pas été mis à jour");
		}

//		if (user.getId() == null) {
//			
//			log.debug("DEBUG update : Cet utilisateur n'existe pas");
//
//		} else {
//
//			if (dao.existsById(user.getId())) {
//
//				dao.save(user);
//				log.debug("DEBUG update : L'utilisateur a été mis à jour");
//
//			} else
//
//				log.debug("DEBUG update : Pas de mis à jour possible");
//		}
	}

	@Override
	public boolean delete(User user) {

		try {

			dao.delete(user);
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			log.debug("DEBUG deleteUser: l'utilisateur n'a pas été supprimé");
			return false;

		}

	}

}
