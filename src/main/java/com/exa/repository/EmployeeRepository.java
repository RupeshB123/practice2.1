package com.exa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.exa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> 
{
	//@Query("select userName from empl where userName=? and pazzword=?")
		public Employee findByUserNameAndPazzword(String userName, String pazzword);
}
