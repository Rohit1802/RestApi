package com.example.myfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyfirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstApplication.class, args);
		System.out.println("Server is started");
	}

}
