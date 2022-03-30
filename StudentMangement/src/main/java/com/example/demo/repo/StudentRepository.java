package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
	
	public Student UpdateStudentAdressById(Integer StudentId,Student InputStudent);
	public Student UpdateStudentMarksById(Integer StudentId,Student   InputStudent);
	
	public void deleteById(Integer StudentId);

}
