package com.spring.mongodb.groceries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceriesApplication {

	public static void main(String[] args) {
//		System.setProperty("server.servlet.context-path", "/groceries");
		SpringApplication.run(GroceriesApplication.class, args);
	}

}
