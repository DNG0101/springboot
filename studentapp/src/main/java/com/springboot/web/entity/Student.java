package com.springboot.web.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_database")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;   // auto generated
	 private String name;
	
	 @Column(name="mobile_number")
	    private String mobileNumber;
	 
	 private String email;
	 private Integer scores; 
	 private String fathername;
	

}
