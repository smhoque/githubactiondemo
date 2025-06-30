package com.example.demo_java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJavaApplication {

	public static void main(String[] args) {
		System.out.println("Hello World!");
		SpringApplication.run(DemoJavaApplication.class, args);
	}

}
