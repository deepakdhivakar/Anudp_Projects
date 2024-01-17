package com.example.StudentData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentData.Entities.Course;
import com.example.StudentData.Service.CourseService;

@RestController


@CrossOrigin(origins = "http://localhost:4200")
public class CourseController {

	@Autowired
	CourseService courseService;
	
	@GetMapping("/course/{Id}")
	public Course getcourseById(@PathVariable int courseId) {
		return courseService.getcourseById(courseId); 
	} @GetMapping("/course")  
	private List<Course> getAllCourse()   
	{  
	return courseService.getAllCourse();  
	}  
	@PostMapping("/postcourse")
	public Course addcourse(@RequestBody Course course) {
		
		return courseService.addcourse(course);
	}
	
	@PutMapping("/updatecourse")
	public Course update(@RequestHeader int courseId ,@RequestBody Course course) {
		
		return courseService.updateDb(courseId ,course); 
	}
	@DeleteMapping("/deletecourse")
	public String delete(@RequestHeader int courseId ) {
		courseService.deleteDb(courseId );
		return "data deleted";
	}
	
	
}