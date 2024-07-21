package com.excelr.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.excelr.model.VaccinationCenter;

@Repository
public interface VaccinationRepo extends CrudRepository<VaccinationCenter, Integer> {

}
