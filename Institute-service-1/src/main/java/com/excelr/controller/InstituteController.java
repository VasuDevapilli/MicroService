package com.excelr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.excelr.model.Institute;
import com.excelr.repo.InstituteRepo;

@RestController
@RequestMapping("/instituteService")
public class InstituteController {

	@Autowired
	private InstituteRepo repo;
	@Autowired RestTemplate restTemplate;

	@PutMapping("/saveInstitute")
	public Institute saveData(@RequestBody Institute std) {
		Institute save = repo.save(std);
		return save;
	}

	@GetMapping("/getInstitute/{instituteCenterid}")
	public Institute getone(@PathVariable int instituteCenterid) {
		Institute getone = repo.findById(instituteCenterid).get();
		return getone;
	}

}