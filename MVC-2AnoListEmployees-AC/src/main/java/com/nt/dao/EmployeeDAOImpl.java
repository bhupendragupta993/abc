package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDao")
public class EmployeeDAOImpl implements EmployeeDAO {

	private static final String GET_ALL_EMPLOYEES = "SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMPL";

	@Autowired
	private JdbcTemplate jt;
	EmployeeDAOImpl(){
		System.out.println("EmployeeDAOImpl.EmployeeDAOImpl()");
	}

	@Override
	public List<EmployeeBO> getAllEmployees() {
		// TODO Auto-generated method stub
		BeanPropertyRowMapper<EmployeeBO> bprm = null;
		List<EmployeeBO> listBO = null;
		bprm = new BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class);
		listBO = (List<EmployeeBO>) jt.query(GET_ALL_EMPLOYEES, new RowMapperResultSetExtractor(bprm));
		return listBO;
	}//method

}//class
