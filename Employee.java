package emp;

public class Employee //implements Comparable<Employee>
{
	int employeeNumber;
	String employeeName;
	float salary;
	public Employee(int employeeNumber, String employeeName, float salary) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", salary=" + salary
				+ "]";
	}
//	@Override
//	public int compareTo(Employee o) {
//		System.out.println("Comparing  "+employeeNumber+" with "+ o.employeeNumber);
//		return Integer.compare(employeeNumber, o.employeeNumber);
//
//	}
	
	
}
