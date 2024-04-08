package com.demo.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.StudentDao.StudentDao;
import com.demo.StudentDto.Student;

@Service
public class StudentService {
	@Autowired
	
	StudentDao studentDao;
	
	
	public StudentService() {
		// TODO Auto-generated constructor stub
	}

	public Student createStudent(Student std)
	{
		return studentDao.save(std);
		
	}


}
