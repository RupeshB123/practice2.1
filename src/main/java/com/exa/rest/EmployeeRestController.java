package com.exa.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exa.binding.LoginForm;
import com.exa.model.Employee;
import com.exa.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeRestController 
{
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/addEmp")
	public ResponseEntity<String> registerEmployee(@RequestBody Employee emp)
	{
		
		
		
		String addEmployee = service.addEmployee(emp);
		
		if(addEmployee.equals("Enter correct details"))
		{
			return new ResponseEntity<String>(addEmployee, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<String>(addEmployee, HttpStatus.CREATED);
	}
	

	@PostMapping("/login")
	public Employee loginCheck(@RequestBody LoginForm loginForm)
	{
		
		Employee employee = service.loginCheck(loginForm);
		
		return employee;
	}
	
	
	@GetMapping("/getOne/{id}")
	public Employee getSingleEmployee(@PathVariable int id)
	{
		return service.getSingle(id);
		
		
	}
	
	
	@GetMapping("/getAll")
	public List<Employee> getAll()
	{
		 List<Employee> all = service.getAll();
		 
		 return all;
		
		
	}
	
	
	

}
