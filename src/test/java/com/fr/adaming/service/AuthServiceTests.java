package com.fr.adaming.service;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fr.adaming.entity.User;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AuthServiceTests {


	
//	private IUserService service;
//
//	private User result;
//
//	@Test
//	public void createUser() {
//
//		User testUser = new User(null, "nom", "prenom", "email@email.fr", "coucou");
//
//		service.create(testUser);
//
////		result = service.create(testUser);
////		
////		assertArrayEquals("un problème d'ajout avec le user", "SUCCESS", result);
//
////		assertNotNull(result.getId());
//
//	}
//
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
//
//	
//	@Before
//	public void beforeMethod() {
//		
//		System.out.println("***********Before test method***********");
//	}
//	
//	@After
//	public void afterMethod() {
//		
//		System.out.println("***********After test method***********");
//		if (result != null && result.getId()!=null) {
//			deleteUser();
//		}
//		
//	}
}
