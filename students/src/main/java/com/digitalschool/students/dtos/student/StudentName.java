package com.digitalschool.students.dtos.student;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentName { 
	
	private String firstName;
	private String midlleName;
	private String lastName;

}
