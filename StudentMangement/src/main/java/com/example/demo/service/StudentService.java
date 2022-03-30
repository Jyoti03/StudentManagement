package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository  studentRepository;

	public Student updateAdress(Integer studentId,Student InputStudent) {
		// TODO Auto-generated method stub
		
		Student Std = null;
		Std.setStudentAddress(InputStudent.getStudentAddress());
		return studentRepository.save(Std);
	}
	
	public Student updateMarks(Integer studentId,Student InputStudent) {
		// TODO Auto-generated method stub
		
		Student Std = null;
		Std.setStudentMarks(InputStudent.getStudentAddress());
		return studentRepository.save(Std);
	}
	
	
	public void delete(Integer studentId)
	{
		 studentRepository.deleteById(studentId);
	}

}
