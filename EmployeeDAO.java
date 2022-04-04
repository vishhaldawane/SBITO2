import java.util.Set;

public interface EmployeeDAO
{
	void addEmployee(Employee emplyee);
	void modifyEmployee(Employee emp);
	void deleteEmployee(int empno);
	Employee findEmployee(int empno);
	Set<Employee> findAllEmployees();
}
