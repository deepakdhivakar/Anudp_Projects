package com.example.StudentData.Service;

import java.util.List;

import com.example.StudentData.Entities.Course;

public interface CourseService {
	Course getcourseById(int courseId );
	Course addcourse(Course course);
	Course updateDb(int courseId,Course course);
	void deleteDb(int courseId);
	List<Course> getAllCourse();
}