package com.test.smitiv.RestApiForEmployee.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.smitiv.RestApiForEmployee.Entity.Employee;



public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	
	
	//that is it ... no need to write any code here.....
}
