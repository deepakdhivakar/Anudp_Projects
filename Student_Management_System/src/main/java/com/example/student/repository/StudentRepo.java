package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.student.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

	@Query(value =  "select * from Student where email =?" , nativeQuery = true)
	Student findByEmail(String email);
}
