package com.fr.adaming.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fr.adaming.dto.RegisterUserDto;
import com.fr.adaming.entity.User;

@Repository
public interface IDaoUser extends JpaRepository<User, Long>{

	@Query(value ="from User where email=:emailParam and pwd =:pwdParam")
	public RegisterUserDto findByLoginAndPwd(@Param("emailParam") String email, @Param("pwdParam") String pwd);
	
}
