package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PutMapping("/UpdateStudentAdressById/{StudentId}")
	public Student updateAdressById(@PathVariable("StudentId")Integer StudentId,Student InputStudent)
	{
		return studentService.updateAdress(StudentId,InputStudent);
	}
	//http://localhost:8086/UpdateStudentAdressById/{StudentId}
	
	@PutMapping("/UpdateStudentMarksById/{StudentId}")
	public Student updateMarksById(@PathVariable("StudentId")Integer StudentId,Student InputStudent)
	{
		return studentService.updateMarks(StudentId, InputStudent);
	}
	//http://localhost:8086/UpdateStudentMarksById/{StudentId}
	
	@DeleteMapping("/DeleteStudentById/{StudentId}")
	public void DeleteStudentById(@PathVariable("StudentId")Integer StudentId)
	{
		 studentService.delete(StudentId);
	}
	

}
