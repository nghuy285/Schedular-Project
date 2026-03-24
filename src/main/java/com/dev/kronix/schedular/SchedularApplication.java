package com.dev.kronix.schedular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SchedularApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SchedularApplication.class, args);
	}

}
