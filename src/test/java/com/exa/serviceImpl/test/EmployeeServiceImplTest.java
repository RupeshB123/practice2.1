package com.exa.serviceImpl.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.OngoingStubbing;
import org.powermock.api.mockito.PowerMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exa.binding.LoginForm;
import com.exa.model.Employee;
import com.exa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplTest 
{
	
	 EmployeeRepository mockRepo = PowerMockito.mock(EmployeeRepository.class);

	 @Autowired
		private EmployeeRepository empRepo;


	@Test
	public void addEmployee() 
	{

		Employee employee = new Employee(101, "nm", 55.55, 54444l, "mmm", "kkk");
//	
		
//		PowerMockito.when(mockRepo.save(emp)).thenReturn(employee);
		
		 Employee save = empRepo.save(employee);
		
		assertNotNull(save); 
		
		//return "Employee added successfully";
	}
	
	
//	@Test
	public void loginCheck(LoginForm loginForm) 
	{
		
		
		Employee employee = mockRepo.findByUserNameAndPazzword(loginForm.getUserName() , loginForm.getPazzword());

		assertNotNull(employee);
		
		//EmployeeRepository mockRepo = new 

		
		
		//return employee;
	}

}
