package com.springboot.web.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.web.entity.Student;
import com.springboot.web.repo.StudentRepository;
import com.springboot.web.servicerepo.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public Student updateStudent(Long id, Student student) {

        Student existingStudent = studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found"));

        existingStudent.setName(student.getName());
        existingStudent.setScores(student.getScores());
        existingStudent.setMobileNumber(student.getMobileNumber());
        existingStudent.setEmail(student.getEmail());

        return studentRepository.save(existingStudent);
    }
    @Override
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new RuntimeException("Student not found with id: " + id);
        }
        studentRepository.deleteById(id);
    }
    // GET BY ID
    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    // GET ALL (ONLY ONCE)
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


}
