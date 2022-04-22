package com.digitalschool.students.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalschool.students.dtos.student.Student;
import com.digitalschool.students.repositories.StudentRepository;
import com.digitalschool.students.services.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student add(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> findAll() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Optional<Student> findById(Long id) {
		return studentRepository.findById(id);
	}

	@Override
	public Student update(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public String delete(Student student) {
		studentRepository.delete(student);
		return "Student deleted successfully";
	}

}
