package com.nt.services;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeService {
	
	List<EmployeeDTO> fetchAllEmployees();

}
