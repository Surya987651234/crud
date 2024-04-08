package com.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.StudentDto.Student;
import com.demo.StudentService.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;

	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/hi")
	public String getname()
	{
		return "Hello Niru";
		
	}
	
	@PostMapping("/createStudent")
	public Student createStudent(@RequestBody Student student)
	
	{
		return studentService.createStudent(student);
		
	
	}
	
}
