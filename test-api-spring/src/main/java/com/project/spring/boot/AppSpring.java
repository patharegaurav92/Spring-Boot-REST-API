package com.project.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSpring {

	public static void main(String[] args) {
		System.out.println("in main");
		SpringApplication.run(AppSpring.class, args);
		
	}

}
