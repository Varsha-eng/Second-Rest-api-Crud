package com.test.smitiv.RestApiForEmployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.test.smitiv.RestApiForEmployee.Entity.Employee;
import com.test.smitiv.RestApiForEmployee.dao.EmployeeDao;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping("/")
	public String employee()
	{
		return "Employee.jsp";
		
	}
	@RequestMapping("/addEmployee")
	public String addEmployee(Employee employee)
	{
		employeeDao.save(employee);
		return "Employee.jsp";
		
	}
	
	@RequestMapping("getEmployee")
	public ModelAndView getEmployee(@RequestParam int id)
	{
		
		ModelAndView mv =new ModelAndView("ShowEmp.jsp");
		Employee employee= employeeDao.findById(id).orElse(new Employee());
       mv.addObject(employee);
		return mv;		
	}
	@RequestMapping("/employees")
	@ResponseBody
	public String getEmployees()
	{
		return employeeDao.findAll().toString();
		
	}
	
	
}
