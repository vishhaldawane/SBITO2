package com.sbi.project;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/emps") // localhost:8080/emps
public class EmployeeController {
	List<Employee> staff = new ArrayList<Employee>();
	public EmployeeController() {
		System.out.println("EmployeeController() constructor...");
		Employee employee1 = new Employee(7654,"Smith", "Clerk", LocalDate.now(), 4500, 21);
		Employee employee2 = new Employee(7754,"Allen", "Salesman", LocalDate.now(), 3500, 21);
		Employee employee3 = new Employee(7551,"Ward", "Clerk", LocalDate.now(), 2500, 21);
		Employee employee4 = new Employee(7839,"Miller", "Salesman", LocalDate.now(), 1500, 21);
		Employee employee5 = new Employee(3651,"Clark", "Manager", LocalDate.now(), 2500, 21);
		Employee employee6 = new Employee(7839,"KING","PRESIDENT",LocalDate.now(),5000,25);
		staff.add(employee1);		staff.add(employee2);		staff.add(employee3);		staff.add(employee4);		staff.add(employee5); staff.add(employee6);
	}
	@RequestMapping("/getEmps") // localhost:8080/emps/getEmps
	public List<Employee> getAllEmployees() {System.out.println("/getEmps");return staff;}
	
	@RequestMapping("/getEmp/{eno}") // localhost:8080/emps/getEmp/7839
	public Employee getEmployee(@PathVariable("eno") int employeeNumberToSearch) {
		System.out.println("/getEmp");
		boolean employeeFound=false;
		Employee employeeObject = null;
		for(int i=0;i<staff.size();i++) {
			employeeObject = staff.get(i);
			if(employeeObject.getEmployeeNumber() == employeeNumberToSearch) {
				employeeFound = true;
				break;
			}
		}
		if(employeeFound==true)	return employeeObject;	else	return null;
	}
	
	@RequestMapping("/deleteEmp/{eno}") // localhost:8080/emps/deleteEmp/7839
	public String deleteEmployee(@PathVariable("eno") int employeeNumberToDelete) {
		System.out.println("/deleteEmp");
		boolean employeeFound=false;
		Employee employeeObject = null;
		for(int i=0;i<staff.size();i++) {
			employeeObject = staff.get(i);
			if(employeeObject.getEmployeeNumber() == employeeNumberToDelete) {
				employeeFound = true;	staff.remove(i);	break;
			}
		}
		if(employeeFound==true)	
				return "Employee Object deleted : "+employeeNumberToDelete;
		else
			return "Employee Object NOT found : "+employeeNumberToDelete;
	}
	
	@RequestMapping("/updateEmp") // localhost:8080/emps/updateEmp/7839
	public String updateEmployee(@RequestBody Employee employeeObjectToModify) {
		System.out.println("/updateEmp");
		boolean employeeFound=false;
		Employee employeeObject = null;
		for(int i=0;i<staff.size();i++) {
			employeeObject = staff.get(i);
			if(employeeObject.getEmployeeNumber() == employeeObjectToModify.getEmployeeNumber()) {
				employeeFound = true;
				staff.remove(i);
				staff.add(employeeObjectToModify);
				break;
			}
		}
		if(employeeFound==true)	
			return "Employee Object successfully modified"; 
		else
			return "Employee Object NOT found : "+employeeObjectToModify.getEmployeeNumber(); 
				
	}
	
	@RequestMapping("/addEmp") // localhost:8080/emps/updateEmp/7839
	public String addEmployee(@RequestBody Employee employeeObjectToAdd) {
		System.out.println("/addEmp");
		boolean employeeFound=false;
		Employee employeeObject = null;
		for(int i=0;i<staff.size();i++) {
			employeeObject = staff.get(i);
			if(employeeObject.getEmployeeNumber() == employeeObjectToAdd.getEmployeeNumber()) {
				employeeFound = true;
				break;
			}
		}
		if(employeeFound==true)	
			return "Employee with this employeeNumber already exists!!!"; 
		else {
			staff.add(employeeObjectToAdd);
			return "Employee Object addedd succesfully : ";
		}
				
	}
}
/*

	localhost:8080/emps
	localhost:8080/emps/getEmps	-- staff
	localhost:8080/emps/getEmp/7654 -- one of the emp from the staff



*/








