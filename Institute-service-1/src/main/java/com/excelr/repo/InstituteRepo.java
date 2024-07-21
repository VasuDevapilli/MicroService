package com.excelr.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.Institute;

@Repository
public interface InstituteRepo extends CrudRepository<Institute, Integer> {

}
