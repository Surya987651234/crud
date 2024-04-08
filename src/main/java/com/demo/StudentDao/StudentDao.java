package com.demo.StudentDao;

import org.springframework.data.repository.CrudRepository;

import com.demo.StudentDto.Student;

public interface StudentDao extends CrudRepository<Student, Integer> {

}
