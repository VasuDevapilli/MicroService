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

import com.excelr.model.Citizen;
import com.excelr.model.VaccinationCenter;
import com.excelr.repo.VaccinationRepo;

@RestController
@RequestMapping("vaccinationCenter")
public class VaccinationController {
	@Autowired RestTemplate restTemplate;
	
	
	@Autowired VaccinationRepo centerRepo;
	
	@GetMapping("/test")
	public VaccinationCenter addCenter(@RequestBody VaccinationCenter newCenter)
	{
		VaccinationCenter center = centerRepo.save(newCenter);
		return center;
	}
	

	@PutMapping("/save")
	public VaccinationCenter saveData(@RequestBody VaccinationCenter vc) {
		VaccinationCenter save=centerRepo.save(vc);
		return save;
	}
	
	@GetMapping("/getvacci/{id}")
	public VaccinationCenter getone(@PathVariable int id) {
		VaccinationCenter center= centerRepo.findById(id).get();
		return center;
	}
	
	@GetMapping("/get/{id}")
	
	public RequiredResponse getData(@PathVariable int id) {
		RequiredResponse requiredresponse=new RequiredResponse(null, null);
		
		VaccinationCenter center=centerRepo.findById(id).get();
		requiredresponse.setCenter(center);
		
		List<Citizen> listofcitizens=restTemplate.getForObject("http://CITIZEN-SERVICE/citizen/getCitizen/"+id,List.class);
		requiredresponse.setCitizens(listofcitizens);
		return requiredresponse;
	}

}
