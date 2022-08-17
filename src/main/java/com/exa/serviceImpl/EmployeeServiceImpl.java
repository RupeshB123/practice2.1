package com.exa.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exa.binding.LoginForm;
import com.exa.model.Employee;
import com.exa.repository.EmployeeRepository;
import com.exa.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService 
{
	
	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public String addEmployee(Employee emp) 
	{
		
		//Employee employee = new Employee(0, null, null, null, null, null);
		
		if(emp.getEmpName()==null )
		{
			return "Enter correct details" ;
		}
		
		Employee employee = empRepo.save(emp);
		
		return "Employee added successfully";
	}

	@Override
	public Employee loginCheck(LoginForm loginForm) 
	{
		
		Employee employee = empRepo.findByUserNameAndPazzword(loginForm.getUserName() , loginForm.getPazzword());

		
		
		return employee;
	}

	@Override
	public Employee getSingle(int id) 
	{
		
		Optional<Employee> findById = empRepo.findById(id);
		
		if(findById.isPresent())
		{
			return findById.get();
		}
		return null;
	}

	@Override
	public List<Employee> getAll() 
	{
		
		List<Employee> findAll = empRepo.findAll();
		
		// TODO Auto-generated method stub
		return findAll;
	}
	
	
	

}
