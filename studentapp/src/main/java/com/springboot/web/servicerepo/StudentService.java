package com.springboot.web.servicerepo;

import java.util.List;

import com.springboot.web.entity.Student;

public interface StudentService {
	 Student saveStudent(Student student);

	 Student updateStudent(Long id, Student student);
	 void deleteStudent(Long id);
	    Student getStudentById(Long id);
	    List<Student> getAllStudents();

}
