package com.example.StudentData.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentData.Entities.Student;
import com.example.StudentData.Service.StudentService;

@RestController

@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/login")
	public Student get(@RequestHeader String email ,@RequestHeader String password) {
		return studentService.login(email,password); 
	}
	
	
	@GetMapping("/student")  
	private List<Student> getAllStudent()   
	{  
	return studentService.getAllStudent();  
	} 
	
	@PostMapping("/post")
	public Student addStudent(@RequestBody Student student) {
		
		return studentService.addStudent(student);
	}
	
	@PutMapping("/update")
	public Student update(@RequestHeader String email ,@RequestBody Student student) {
		
		return studentService.updateDb(email,student); 
	}
	@DeleteMapping("/delete")
	public String delete(@RequestHeader String email) {
		studentService.deleteDb(email);
		return "data deleted";
	}
	
	
}