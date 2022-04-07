package com.sbi.emp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

public class EmployeeService { //Car

	DataSource dataSource; //Engine

	public void setDataSource(DataSource source) {
		System.out.println("setDataSource(DataSource)......");
		dataSource = source;
	}
	
	public List<Employee> getEmployees() {
		List<Employee> staff = new ArrayList<Employee>();
		try {
			Connection conn = dataSource.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select * from employee_tbl");
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeNumber(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setJob(rs.getString(3));
				emp.setManager(rs.getInt(4));
				
				java.sql.Date dateFound= rs.getDate(5);
				LocalDate localDate = dateFound.toLocalDate(); // LocalDate.of(dateFound.getYear(), dateFound.getMonth(), dateFound.getDay());
				
				emp.setJoiningDate(localDate);
				emp.setSalary(rs.getInt(6));
				emp.setComm(rs.getInt(7));
				emp.setDeptno(rs.getInt(8));
				
				staff.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return staff;
	}
	
}
