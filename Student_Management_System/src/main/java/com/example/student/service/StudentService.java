package com.example.student.service;

import com.example.student.entities.Student;

public interface StudentService { 
	
	Student login(String email ,String password);

	Student addStudent(Student student);

	Student updatedb(String email, Student student);

	
	void Delete(String email);
}
