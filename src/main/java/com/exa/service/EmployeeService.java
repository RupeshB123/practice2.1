package com.exa.service;

import java.util.List;

import com.exa.binding.LoginForm;
import com.exa.model.Employee;

public interface EmployeeService 
{

	public String addEmployee(Employee emp);

	public Employee loginCheck(LoginForm loginForm);

	public Employee getSingle(int id);

	public List<Employee> getAll();  

}
