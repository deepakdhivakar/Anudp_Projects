package com.example.StudentData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.StudentData.Entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {

	@Query(value =  "select * from course where courseId =?" , nativeQuery = true)
	Course findById(int courseId);

	
	
}