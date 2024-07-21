package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.excelr.model.StudentTable;
import com.excelr.repo.StudentRepo;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired StudentRepo repo;
	
	@PostMapping("/add")
	public ResponseEntity<StudentTable>addStudent(@RequestBody StudentTable newStudent){
		
		StudentTable  student = repo.save(newStudent);
		return new ResponseEntity<>(student,HttpStatus.OK);
		
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<List<StudentTable>> getbyId(@PathVariable Integer id ){
		{
			List<StudentTable> listStudent=repo.findByinstituteCenterid(id);
			return new ResponseEntity<>(listStudent,HttpStatus.OK);
		} 

		
	

	}
}
