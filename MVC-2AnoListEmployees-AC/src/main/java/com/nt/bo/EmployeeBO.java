package com.nt.bo;

import lombok.Data;

@Data
public class EmployeeBO {
	

	private int empNo;
	private String ename;
	private  String job;
	private long sal;
	private  int deptNo;
	EmployeeBO(){
		System.out.println("EmployeeBO.EmployeeBO()");
	}
	

}
