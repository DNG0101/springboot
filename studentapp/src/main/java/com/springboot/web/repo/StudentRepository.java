package com.springboot.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.web.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
