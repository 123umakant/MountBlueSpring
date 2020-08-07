package com.example.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger("ScopeApplication.class");

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ScopeApplication.class, args);

		PeronDao personDao = context.getBean(PeronDao.class);
		PeronDao personDaoSecInstance = context.getBean(PeronDao.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.JdbcConnection);
		
		LOGGER.info("{}",personDaoSecInstance);
		LOGGER.info("{}",personDaoSecInstance.JdbcConnection);
	}
}
