package com.example.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		// BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new
		// QuickSortAlgorithm());
		// this thing is done by spring

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		BinarySearchImpl binarySearchImpl = context.getBean(BinarySearchImpl.class);
		int result = binarySearchImpl.binarySearch(new int[] { 1, 5, 7, 9, 3 }, 3);
	
		System.out.println(result);

	}
}
