package com.spring.mongodb.groceries;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Mon 31-Aug-2020 22:14
 */
@SpringBootApplication
public class GroceriesApplication {

	public static void main(String[] args) {
//		System.setProperty("server.servlet.context-path", "/groceries");
		SpringApplication.run(GroceriesApplication.class, args);
	}

}
