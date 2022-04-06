package entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_tbl")
public class Emp {

	@Id
	@Column(name="EMPNO")
	private int employeeNumber;
	
	@Column(name="ENAME")
	private String employeeName;
	
	@Column(name="JOB")
	private String job;
	
	@Column(name="MGR")
	private Integer mgr;
	
	@Column(name="HIREDATE")
	private LocalDate hiredate;
	
	@Column(name="EMP_SAL")
	private int salary;
	
	@Column(name="COMM")
	private Integer commision;
	
	@Column(name="DEPTNO")
	private int departmentNumber;

	
	
	public Emp() {
		super();
		System.out.println("Employee() ctor.....");
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getMgr() {
		return mgr;
	}

	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}

	public LocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Integer getCommision() {
		return commision;
	}

	public void setCommision(Integer commision) {
		this.commision = commision;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	
	
}
