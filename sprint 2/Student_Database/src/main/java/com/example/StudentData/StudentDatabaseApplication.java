package com.example.StudentData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentDatabaseApplication.class, args);
		System.out.println("Connected...");
	}

}
