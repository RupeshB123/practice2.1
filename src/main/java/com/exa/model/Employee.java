package com.exa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "EMPL")
public class Employee  
{
	@Id
	@GeneratedValue
	@Column(name = "EMP_ID")
	private int empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name="EMP_SALARY")
	private Double empSalary;
	
	@Column(name="PHONE_NO")
	private Long phoneNo;
	
	@Column(name="USER_NAME")
	private String userName;
	
	@Column(name="PZZWORD")
	private String pazzword;
	

}
