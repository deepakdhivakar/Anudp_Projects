package com.example.StudentData.Service;

import java.util.List;

import com.example.StudentData.Entities.Student;

public interface StudentService { 
	Student login(String email, String password );


	Student addStudent(Student student);

	Student updateDb(String email,Student student);

	void deleteDb(String email);
	List<Student> getAllStudent();
	}

