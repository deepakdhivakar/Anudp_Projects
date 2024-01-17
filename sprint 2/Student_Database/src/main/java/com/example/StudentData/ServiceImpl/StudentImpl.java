package com.example.StudentData.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentData.Entities.Student;
import com.example.StudentData.Exception.ResourceNotFoundException;
import com.example.StudentData.Repository.StudentRepo;
import com.example.StudentData.Service.StudentService;

@Service
public class StudentImpl implements StudentService {
	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public Student login(String email, String password) {
		Student s = studentRepo.findByEmail(email);
		 
		 if(s!=null) {
			 if(s.getPassword().equals(password)) {
				 return s;
			 }else {
				throw new ResourceNotFoundException();
			}
		 }else {
			 throw new ResourceNotFoundException();
		 }
	  
	}

	@Override
	public Student addStudent(Student student) {
		return  studentRepo.save(student);
	}

	@Override
	public Student updateDb(String email,Student student) {
		
		
		Student s1 = studentRepo.findByEmail(email);
		
		if(s1!=null) {
			s1.setPassword(student.getPassword());
			s1.setCourse(student.getCourse());
		return studentRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	@Override
	public void deleteDb(String email) {
	
		
		Student s2 = studentRepo.findByEmail(email);
		
		if(s2!=null) {
			studentRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	  
		public List<Student> getAllStudent()   
		{  
		List<Student> student = new ArrayList<Student>();  
		studentRepo.findAll().forEach(student1 -> student.add(student1));  
		return student;  

	}
}
