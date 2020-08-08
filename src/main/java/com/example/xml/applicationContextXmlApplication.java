package com.example.xml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
@Configuration
public class applicationContextXmlApplication {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContextxml = new ClassPathXmlApplicationContext(
				"applicationContext.xml")) {
			PeronDao dao = applicationContextxml.getBean(PeronDao.class);
		System.out.println(dao);
		}
		

	}
}
