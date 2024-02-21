package com.example.demo.professor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Professor {
	@Id @GeneratedValue
	private Long id;
	private String name;
	private String email;
	private String grade;
	
	public Professor() {	}
	
	public Professor(Long id, String name, String email, String grade) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.grade = grade;
	}
	
	public Professor(String name, String email, String grade) {
		
		this.name = name;
		this.email = email;
		this.grade = grade;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
		
}
