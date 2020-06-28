package com.nt.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO dao;
	
	EmployeeServiceImpl(){
		System.out.println("EmployeeServiceImpl.EmployeeServiceImpl()");
	}

	@Override
	public List<EmployeeDTO> fetchAllEmployees() {
		// TODO Auto-generated method stub
		List<EmployeeBO> listBO = null;
		List<EmployeeDTO> listDTO = null;
		EmployeeDTO dto = null;
		listBO = dao.getAllEmployees();
		//copy listBO to listDTO
		listDTO = new ArrayList<EmployeeDTO>();
		for (EmployeeBO bo :listBO) {
			dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSno(listDTO.size()+1);
			listDTO.add(dto);
		}
		
		return listDTO;
	}//method

}//class
