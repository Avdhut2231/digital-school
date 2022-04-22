package com.digitalschool.students.dtos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="batch")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Batch {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String standard;
	
	
	private String division;
}
