package com.excelr.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	public List<Citizen> findByVaccinationCenterId(Integer id);
 

}
