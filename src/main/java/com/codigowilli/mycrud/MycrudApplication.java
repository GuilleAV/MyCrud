package com.codigowilli.mycrud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycrudApplication {

	private static  Logger logger = LoggerFactory.getLogger(MycrudApplication.class);



	public static void main(String[] args) {

		SpringApplication.run(MycrudApplication.class, args);
		logger.debug("Este es mi mensaje debug");
	}


}
