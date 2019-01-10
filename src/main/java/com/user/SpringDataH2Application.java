package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

@ComponentScan(basePackages= "com.user")
public class SpringDataH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataH2Application.class, args);
	}

}

