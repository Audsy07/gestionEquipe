package com.fr.adaming.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fr.adaming.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTests {

	@Autowired
	private IUserService service;

	private User result;

	@Test
	public void a_createUser() {

		User testUser = new User(null, "nom", "prenom", "email@email.fr", "coucou");

		result = service.create(testUser);

		assertEquals("ajout d'un utilisateur", testUser, result);

	}

	@Test
	public void a_createUserNomNull() {

		User testUser = new User(2L, null, "prenom2", "email2@email.fr", "coucou2");

		result = service.create(testUser);
	}

	@Test
	public void a_createUserPrenomNull() {

		User testUser = new User(3L, "nom3", null, "email3@email.fr", "coucou3");

		result = service.create(testUser);

	}

	@Test
	public void a_createUserPwdNull() {

		User testUser = new User(4L, "nom4", "prenom4", "email4@email.fr", null);

		result = service.create(testUser);
	}

//	public void a_createListUser() {
//		
//		User testUser = new User(4L, "nom4", "prenom4", "email4@email.fr", "coucou4");
//		
//		result = service.create(testUser);	
//		
//	}

	@Test
	public void a_createUserWithOneEmail() {

		User testUser = new User(5L, "nom5", "prenom5", "email@email.fr", "coucou5");

		result = service.create(testUser);

		assertNotNull("email déjà utilisé", testUser);

	}

	@Test
	public void b_findUserById() {

		service.readById(2L);
	}
	
	@Test
	public void b_notfindUserById() {
		
		service.readById(7L);
		
	}

	@Test
	public void b_readListUser() {

		List<User> list = service.readAll();

		assertThat(list);
	}

	@Test
	public void c_updateUser() {

		User testUser = new User(1L, "nom1", "prenom1", "email1@email.fr", "coucou1");

		service.update(testUser);

		assertNotEquals("mis à jour d'un utilisateur", testUser, result);
	}
	
	@Test
	public void c_updateNomUser() {

		User testUser = new User(2L, "nom2", "prenom2", "email2@email.fr", "coucou2");

		service.update(testUser);

		assertNotEquals("mis à jour du nom de l'utilisateur", testUser, result);
	}

	@Test
	public void c_updatePrenomUser() {

		User testUser = new User(3L, "nom3", "prenom3", "email3@email.fr", "coucou3");

		service.update(testUser);

		assertNotEquals("mis à jour du prénom de l'utilisateur", testUser, result);
	}

	@Test
	public void c_updatePwdUser() {
		
		User testUser = new User(4L, "nom4", "prenom4", "email4@email.fr", "coucou4");
		
		service.update(testUser);

		assertNotEquals("mis à jour du pwd de l'utilisateur", testUser, result);
	}
	
	@Test
	public void d_deleteUser() {

		User testUser = new User(1L, "nom1", "prenom1", "email1@email.fr", "coucou1");	

		assertTrue(service.delete(testUser));

	}
	

	@After
	public void afterMethod() {

		System.out.println("***********After test method***********");


//	@Test
//	public void deleteUser() {
//
//		// pour la suppression, supprimer l'user qu'on vient de créer dans la méthode
//		// précédente
//		// si la méthode renvoit un booléen
//
//		// boolean result = service.delete(result.getId());
//		// assertTrue(result);
//	}

	}

}
