package com.duyanh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duyanh.model.Employee;
import com.duyanh.repository.EmployeeRepository;

@Service
public class EmployeeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Iterable<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> search(String q) {
		// TODO Auto-generated method stub
		return employeeRepository.findByNameContaining(q);
	}

	@Override
	public Employee findOne(int id) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(id);
	}

	@Override
	public void save(Employee contact) {
		// TODO Auto-generated method stub
		employeeRepository.save(contact);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		employeeRepository.delete(id);
	}

	
}
