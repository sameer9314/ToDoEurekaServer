package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Purpose : Main class for Eureka Server.
 * 
 * @author Sameer Saurabh
 * @version 1.0
 * @Since 11/08/2018
 */
@EnableEurekaServer
@SpringBootApplication
public class ToDoServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ToDoServerApplication.class, args);
	}
}
