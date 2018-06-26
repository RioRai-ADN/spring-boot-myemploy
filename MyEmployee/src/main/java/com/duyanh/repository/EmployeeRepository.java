package com.duyanh.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.duyanh.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	List<Employee> findByNameContaining(String q);
}
