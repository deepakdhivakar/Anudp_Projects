package com.example.StudentData.ServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentData.Entities.Course;
import com.example.StudentData.Exception.ResourceNotFoundException;
import com.example.StudentData.Repository.CourseRepo;
import com.example.StudentData.Service.CourseService;

@Service
public class CourseImpl implements CourseService {


	@Autowired
	CourseRepo courseRepo;
	
	public Course getcourseById(int courseId) {
		Optional<Course> rm=Optional.ofNullable(courseRepo.findById(courseId));
		Course course;
		if(rm.isPresent())
		{
			 course=rm.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return course;
	  
	}

	public Course addcourse(Course course) {
		return  courseRepo.save(course);
	}

	public Course updateDb(int courseId,Course course) {
		
		
		Course s1 = courseRepo.findById(courseId);
		
		if(s1!=null) {
			s1.setDuration(course.getDuration());

			s1.setCourseType(course.getCourseType()); 
			
		return courseRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(int courseId) {
	
		
		Course s2 = courseRepo.findById(courseId);
		
		if(s2!=null) {
			courseRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	



	  
	public List<Course> getAllCourse()   
	{  
	List<Course> course = new ArrayList<Course>();  
	courseRepo.findAll().forEach(course1 -> course.add(course1));  
	return course;  

}}