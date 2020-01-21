package com.test.smitiv.RestApiForEmployee.dao;

import org.springframework.data.repository.CrudRepository;

import com.test.smitiv.RestApiForEmployee.Entity.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
