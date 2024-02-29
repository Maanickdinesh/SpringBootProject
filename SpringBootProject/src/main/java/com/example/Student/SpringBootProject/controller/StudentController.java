package com.example.Student.SpringBootProject.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.Student.SpringBootProject.Repo.StudentRepo;
import com.example.Student.SpringBootProject.entity.Student;

@RestController
public class StudentController {

	@Autowired
	StudentRepo repo;
	
	
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		
		List<Student> Students = repo.findAll();
		return Students;
	}
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
		Student studentbyid= repo.findById(id).get();
		return studentbyid;
	}
	@PostMapping("/students/add")
	@ResponseStatus(code =HttpStatus.CREATED)
	public void createStudent(@RequestBody Student student) {
		repo.save(student);
	}
	@PutMapping("/students/update/{id}")
	public Student updateStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		student.setStuDept("ECE");
		student.setStuName("Kavya");
		student.setStupercent(87);
		repo.save(student);
		return student;
	}
	@DeleteMapping("/students/delete/{id}")
	public void  deleteStudent(@PathVariable int id) {
		Student student = repo.findById(id).get();
		repo.delete(student);
		
		
		
	}

}
