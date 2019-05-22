package com.fr.adaming;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import springfox.documentation.swagger2.annotations.EnableSwagger2;

import org.apache.log4j.*;

@SpringBootApplication
@EnableSwagger2
public class ProjetJeuApplication {

	public static void main(String[] args) {
		
		
	SpringApplication.run(ProjetJeuApplication.class, args);
		
	   Logger logger = Logger.getLogger(ProjetJeuApplication.class);
	   
	   logger.trace("Yo World!");
	   logger.debug("Hello World!");
	   logger.info("CC World!");
	   logger.warn("Non World!");
	   logger.error("Ô secours World!");
	   logger.fatal("BAH World!");

	}

}
