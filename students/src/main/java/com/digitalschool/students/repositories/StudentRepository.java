package com.digitalschool.students.repositories;

import org.springframework.data.repository.CrudRepository;

import com.digitalschool.students.dtos.student.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
