package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("empdetail")
public class EmployeeDeatil {

	@Value("ahmedabad")
	private String empCity;

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
	
	
}
