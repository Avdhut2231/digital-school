package com.digitalschool.students.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digitalschool.students.dtos.student.Student;
import com.digitalschool.students.services.StudentService;

@RestController("/students")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public Student add(@RequestBody Student student) {
		return studentService.add(student);
	}
	
	@GetMapping
	public List<Student> findAll() {
		return studentService.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Student> findById(@PathVariable Long id) {
		return studentService.findById(id);
	}
	
	@PutMapping
	public Student update(@RequestBody Student student) {
		return studentService.update(student);
	}
	
	@DeleteMapping
	public String delete(@RequestBody Student student) {
		return studentService.delete(student);
	}
}
