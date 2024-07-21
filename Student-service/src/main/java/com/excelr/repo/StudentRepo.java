package com.excelr.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.excelr.model.StudentTable;

@Repository
public interface StudentRepo extends CrudRepository<StudentTable, Integer> {
	

	public List<StudentTable>findByinstituteCenterid(Integer id);

}
