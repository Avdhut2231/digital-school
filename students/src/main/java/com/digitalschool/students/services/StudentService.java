package com.digitalschool.students.services;

import java.util.List;
import java.util.Optional;

import com.digitalschool.students.dtos.student.Student;

public interface StudentService {

	Student add(Student student);

	List<Student> findAll();

	Optional<Student> findById(Long id);

	Student update(Student student);

	String delete(Student student);

}
