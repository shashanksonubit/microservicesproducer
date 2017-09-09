package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.demo.model.Add;
import com.employee.demo.model.Employee;
import com.example.demo.service.CalculateService;
/**
 * Vikash  Kumar
 * 
 */
 
@RestController
public class EmployeeController {
	@Autowired 
	CalculateService calculateServiceImpl;
	@RequestMapping(value="/")
	public String getHomePage(){
		return "Home page";
	}
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public Employee firstPage() {

		Employee emp = new Employee();
		emp.setName("emp1");
		emp.setDesignation("manager");
		emp.setEmpId("1");
		emp.setSalary(3000);

		return emp;
	}
	
	@RequestMapping(value="/add/{a}/{b}",method=RequestMethod.GET)
	public Add add(@PathVariable int a,@PathVariable int b){
	int c=	calculateServiceImpl.add(a, b);
	Add add=new Add();
	add.setAddition(c);
	return add;
		
	}
	@RequestMapping(value="/divide/{a}/{b}",method=RequestMethod.GET)
	public int divide(@PathVariable int a,@PathVariable int b){
	int c=	calculateServiceImpl.divide(a, b);
	return c;
		
	}

}
