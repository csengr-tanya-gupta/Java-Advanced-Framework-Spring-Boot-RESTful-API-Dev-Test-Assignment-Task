package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entity.Student;
import com.capgemini.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
		System.out.println("Student Saved Successfully!");
	}
	
	public void saveStudents(List<Student> students) {
		studentRepository.saveAll(students);
		System.out.println("Students Saved Successfully!");
	}
}