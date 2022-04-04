import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.junit.jupiter.api.Test;

public class AssociationORMTest {

	@Test
	public void createSamplePassportTest() {
		
		Passport passport = new Passport();
		passport.setPassportId(369369369);
		passport.setIssuedBy("Govt. Of. India");
		passport.setPassportIssuedDate(LocalDate.of(2022, 6, 25));
		passport.setPassportExpiryDate(LocalDate.of(2032, 6, 25));
		
		System.out.println("passport is : "+passport);
	}
	
@Test
public void createSampleAddressTest() 
{
	Address add1= new Address();
	add1.setAddressId(101);
	add1.setArea("belapur");
	add1.setCity("Navi Mumbai");
	add1.setCountry("India");
	add1.setPin(400614);
	add1.setState("Maharashtra");
	add1.setStreet("Khau Gali");
	
	System.out.println("Address Details are :" +add1 );
}
	
@Test
public void createSampleProjectTest() {
	Project project = new Project();
	project.setProjectDeadLine(LocalDate.of(2022, 04, 04));
	project.setProjectId(121);
	project.setProjectTitle("Online Banking");
		System.out.println("Project Details are: "+project);
		
}

@Test
public void createSampleAddressListTest() 
{
	Address add1= new Address();
	add1.setAddressId(101);
	add1.setArea("belapur");
	add1.setCity("Navi Mumbai");
	add1.setCountry("India");
	add1.setPin(400614);
	add1.setState("Maharashtra");
	add1.setStreet("Khau Gali");
		
	System.out.println("Address Details are :" +add1 );
	Address add2= new Address();
	add2.setAddressId(102);
	add2.setArea("nerul");
	add2.setCity("Navi Mumbai");
	add2.setCountry("India");
	add2.setPin(400504);
	add2.setState("Maharashtra");
	add2.setStreet("Tilak Street");
	System.out.println("Address Details are :" +add2 );
	
	Address add3= new Address();
	add3.setAddressId(103);
	add3.setArea("vashi");
	add3.setCity("Navi Mumbai");
	add3.setCountry("India");
	add3.setPin(400704);
	add3.setState("Maharashtra");
	add3.setStreet("MGandhi Street");
	System.out.println("Address Details are :" +add3 );
	
	ArrayList<Address> al=new ArrayList<Address>();
	al.add(add3);
	al.add(add2);
	al.add(add1);
	
	Iterator<Address> it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(" address "+it.next()); 
		System.out.println("--------------------");
	}
	
	
	
	
	



}
@Test
public void createSampleProjectListTest() {
	ArrayList<Project> projectList=new ArrayList<Project>();
	Project project1 = new Project();
	Project project2 = new Project();
	project1.setProjectDeadLine(LocalDate.of(2022, 04, 04));
	project1.setProjectId(121);
	project1.setProjectTitle("Online Banking");
	project2.setProjectDeadLine(LocalDate.of(2022, 05, 04));
	project2.setProjectId(122);
	project2.setProjectTitle("Airline Project");
	projectList.add(project1);
	projectList.add(project2);
	Iterator<Project> it1=projectList.iterator();
	while(it1.hasNext())
	{
		System.out.println("the project details"+it1.next());
	}
		//System.out.println("Project Details are: "+project);
		
}

	@Test 
	public void createSampleEmployeeTest() {
	
	Employee employee = new Employee();
	employee.setEmployeeNumber(256);
	employee.setEmployeeName("Sajith");
	employee.setEmployeeJoining(LocalDate.of(2019, 10, 10));
	employee.setEmployeeSalary(50000);
	
	Passport passport = new Passport();
	passport.setPassportId(369369369);
	passport.setIssuedBy("Govt. Of. India");
	passport.setPassportIssuedDate(LocalDate.of(2022, 6, 25));
	passport.setPassportExpiryDate(LocalDate.of(2032, 6, 25));
	
	employee.setPassport(passport);
	
	Address add1= new Address();
	add1.setAddressId(101);
	add1.setArea("belapur");
	add1.setCity("Navi Mumbai");
	add1.setCountry("India");
	add1.setPin(400614);
	add1.setState("Maharashtra");
	add1.setStreet("Khau Gali");
		
	
	Address add2= new Address();
	add2.setAddressId(102);
	add2.setArea("nerul");
	add2.setCity("Navi Mumbai");
	add2.setCountry("India");
	add2.setPin(400504);
	add2.setState("Maharashtra");
	add2.setStreet("Tilak Street");

	
	Address add3= new Address();
	add3.setAddressId(103);
	add3.setArea("vashi");
	add3.setCity("Navi Mumbai");
	add3.setCountry("India");
	add3.setPin(400704);
	add3.setState("Maharashtra");
	add3.setStreet("MGandhi Street");
	
	
	ArrayList<Address> al=new ArrayList<Address>();
	al.add(add3);
	al.add(add2);
	al.add(add1);
	
	employee.setAddressList(al);
	
	
	ArrayList<Project> projectList=new ArrayList<Project>();

	Project project1 = new Project();
	Project project2 = new Project();
	
	project1.setProjectId(121);
	project1.setProjectTitle("Online Banking");
	project1.setProjectDeadLine(LocalDate.of(2022, 04, 04));
	
	project2.setProjectId(122);
	project2.setProjectTitle("Airline Project");
	project2.setProjectDeadLine(LocalDate.of(2022, 05, 04));
	
	projectList.add(project1);
	projectList.add(project2);
	
	employee.setProjectList(projectList);
	

//	System.out.println(employee);
	System.out.println("--- Employee Personal Information ---");
	System.out.println("Employee Number      :"+employee.getEmployeeNumber());
	System.out.println("Employee name        :"+employee.getEmployeeName());
	System.out.println("Employee joining     :"+employee.getEmployeeJoining());
	System.out.println("Employee Salary      :"+employee.getEmployeeSalary());
	
	System.out.println("--- Employee Passport Information ---");
	Passport passport1 = employee.getPassport();
	System.out.println("Passport number      : "+passport1.getPassportId());
	System.out.println("Passport Issued Date : "+passport1.getPassportIssuedDate());
	System.out.println("Passport Expiry Date : "+passport1.getPassportExpiryDate());
	System.out.println("Passport Issued By   : "+passport1.getIssuedBy());
		
	System.out.println("------------------------");
	System.out.println("--- Employee Address Information ---");
	ArrayList<Address> empAddList = employee.getAddressList();
	for (Address address : empAddList) {
		System.out.println("Area             : "+address.getArea());
		System.out.println("Street           : "+address.getState());
		System.out.println("City             : "+address.getCity());
		System.out.println("Country          : "+address.getCountry());
		System.out.println("Pin              : "+address.getPin());
		System.out.println("------------");
	}
	System.out.println("--- Employee Project Information ---");
	ArrayList<Project> empProjects = employee.getProjectList();
	for (Project project : empProjects) {
		System.out.println("Project id       : "+project.getProjectId());
		System.out.println("Project Title    : "+project.getProjectTitle());
		System.out.println("Project DeadLine : "+project.getProjectDeadLine());
		System.out.println("------------");
	}

}
	
	interface EmployeeDAO
	{
		void addEmployee(Employee emplyee);
		void modifyEmployee(Employee emp);
		void deleteEmployee(int empno);
		Employee findEmployee(int empno);
		Set<Employee> findAllEmployees();
	}
	
	class EmployeeDAOImpl implements EmployeeDAO
	{

		Set<Employee> staff = new HashSet<Employee>(); //a blank Set
		
		@Override
		public void addEmployee(Employee emplyee) {
			staff.add(emplyee);
		}

		@Override
		public void modifyEmployee(Employee emp) {
			for (Employee employee : staff) {
				if(employee.getEmployeeNumber() == emp.getEmployeeNumber() ) {
					staff.remove(employee);
					staff.add(emp);
					break;
				}
			}
		}

		@Override
		public void deleteEmployee(int empno) {
			for (Employee employee : staff) {
				if(employee.getEmployeeNumber() == empno ) {
					staff.remove(employee);
					break;
				}
			}
			
		}

		@Override
		public Employee findEmployee(int empno) {
			Employee tempEmp = null;
			for (Employee employee : staff) {
				if(employee.getEmployeeNumber() == empno ) {
					tempEmp = employee;
					break;
				}
			}
			return tempEmp;
		}

		@Override
		public Set<Employee> findAllEmployees() {
			return staff;
		}
		
	}
//bmp(jdbc)  cmp(orm)
	@Test 
	public void createSampleEmployeesTest() {
	
	Employee employee1 = new Employee();
	Employee employee2 = new Employee();
	Employee employee3 = new Employee();
	Employee employee4 = new Employee();
	Employee employee5 = new Employee();
	
	employee1.setEmployeeNumber(256);
	employee1.setEmployeeName("Sajith");
	employee1.setEmployeeJoining(LocalDate.of(2019, 10, 10));
	employee1.setEmployeeSalary(50000);
	
	employee2.setEmployeeNumber(356);
	employee2.setEmployeeName("Shashi");
	employee2.setEmployeeJoining(LocalDate.of(2019, 11, 12));
	employee2.setEmployeeSalary(60000);

	employee3.setEmployeeNumber(456);
	employee3.setEmployeeName("Ayan");
	employee3.setEmployeeJoining(LocalDate.of(2019, 12, 15));
	employee3.setEmployeeSalary(70000);

	
	employee4.setEmployeeNumber(556);
	employee4.setEmployeeName("Nimya");
	employee4.setEmployeeJoining(LocalDate.of(2019, 06, 20));
	employee4.setEmployeeSalary(80000);

	
	employee5.setEmployeeNumber(656);
	employee5.setEmployeeName("KrishaKumar");
	employee5.setEmployeeJoining(LocalDate.of(2019, 03, 15));
	employee5.setEmployeeSalary(90000);

	Passport passport1 = new Passport();	passport1.setPassportId(369369369);	passport1.setIssuedBy("Govt. Of. India");	passport1.setPassportIssuedDate(LocalDate.of(2022, 6, 25));	passport1.setPassportExpiryDate(LocalDate.of(2032, 6, 25));	
	Passport passport2 = new Passport();	passport2.setPassportId(169169460);	passport2.setIssuedBy("Govt. Of. Nepal");	passport2.setPassportIssuedDate(LocalDate.of(2021, 6, 25));	passport2.setPassportExpiryDate(LocalDate.of(2021, 6, 25));
	Passport passport3 = new Passport();	passport3.setPassportId(269169562);	passport3.setIssuedBy("Govt. Of. Srilanka");	passport3.setPassportIssuedDate(LocalDate.of(2018, 6, 25));	passport3.setPassportExpiryDate(LocalDate.of(2018, 6, 25));
	Passport passport4 = new Passport();	passport4.setPassportId(369169664);	passport4.setIssuedBy("Govt. Of. Russia");	passport4.setPassportIssuedDate(LocalDate.of(2020, 6, 25));	passport4.setPassportExpiryDate(LocalDate.of(2020, 6, 25));
	Passport passport5 = new Passport();	passport5.setPassportId(469169765);	passport5.setIssuedBy("Govt. Of. USA");	passport5.setPassportIssuedDate(LocalDate.of(2019, 6, 25));	passport5.setPassportExpiryDate(LocalDate.of(2019, 6, 25));
	
	employee1.setPassport(passport1);
	employee2.setPassport(passport2);
	employee3.setPassport(passport3);
	employee4.setPassport(passport4);
	employee5.setPassport(passport5);
	
	
	//employee1
	Address add1= new Address();	add1.setAddressId(101);	add1.setArea("belapur1");add1.setCity("Navi Mumbai");		add1.setCountry("India");	add1.setPin(400614);	add1.setState("Maharashtra");	add1.setStreet("Khau Gali");
	Address add2= new Address();	add2.setAddressId(102);	add2.setArea("nerul1");	add2.setCity("Navi Mumbai");	add2.setCountry("India");	add2.setPin(400504);	add2.setState("Maharashtra");	add2.setStreet("Tilak Street");
	Address add3= new Address();	add3.setAddressId(103);	add3.setArea("vashi1");	add3.setCity("Navi Mumbai");	add3.setCountry("India");	add3.setPin(400704);	add3.setState("Maharashtra");	add3.setStreet("MGandhi Street");

	//employee2
	Address add4= new Address();	add4.setAddressId(104);	add4.setArea("Sanpada2"); add4.setCity("Navi Mumbai");		add4.setCountry("India");	add4.setPin(400614);	add4.setState("Maharashtra");	add4.setStreet("Khau Gali");
	Address add5= new Address();	add5.setAddressId(105);	add5.setArea("SeaWood2");	add5.setCity("Navi Mumbai");	add5.setCountry("India");	add5.setPin(400504);	add5.setState("Maharashtra");	add5.setStreet("Tilak Street");
	
	//employee3
	Address add6= new Address();	add6.setAddressId(106);	add6.setArea("Panvel3");add6.setCity("Navi Mumbai");		add6.setCountry("India");	add6.setPin(400614);	add6.setState("Maharashtra");	add6.setStreet("Khau Gali");
	Address add7= new Address();	add7.setAddressId(107);	add7.setArea("Kalamboli3");	add7.setCity("Navi Mumbai");	add7.setCountry("India");	add7.setPin(400504);	add7.setState("Maharashtra");	add7.setStreet("Tilak Street");
	Address add8= new Address();	add8.setAddressId(108);	add8.setArea("Juinagar3");	add8.setCity("Navi Mumbai");	add8.setCountry("India");	add8.setPin(400704);	add8.setState("Maharashtra");	add8.setStreet("MGandhi Street");
	Address add9= new Address();	add9.setAddressId(109);	add9.setArea("Thane3");	add9.setCity("Navi Mumbai");	add9.setCountry("India");	add9.setPin(400704);	add9.setState("Maharashtra");	add9.setStreet("MGandhi Street");

	//employee4
	Address add10= new Address();	add10.setAddressId(110);	add10.setArea("Mahim4");	add10.setCity("Navi Mumbai");	add10.setCountry("India");	add10.setPin(400704);	add10.setState("Maharashtra");	add10.setStreet("MGandhi Street");

	
	//employee5
	Address add11= new Address();	add11.setAddressId(111);	add11.setArea("Pune5");     add11.setCity("Navi Mumbai");		add11.setCountry("India");	add11.setPin(400614);	add11.setState("Maharashtra");	add11.setStreet("Khau Gali");
	Address add12= new Address();	add12.setAddressId(112);	add12.setArea("Nagpur5");	add12.setCity("Navi Mumbai");	add12.setCountry("India");	add12.setPin(400504);	add12.setState("Maharashtra");	add12.setStreet("Tilak Street");
	Address add13= new Address();	add13.setAddressId(113);	add13.setArea("Nasik5");	add13.setCity("Navi Mumbai");	add13.setCountry("India");	add13.setPin(400704);	add13.setState("Maharashtra");	add13.setStreet("MGandhi Street");
	Address add14= new Address();	add14.setAddressId(114);	add14.setArea("Chennai5");	add14.setCity("Navi Mumbai");	add14.setCountry("India");	add14.setPin(400704);	add14.setState("Maharashtra");	add14.setStreet("MGandhi Street");
	Address add15= new Address();	add15.setAddressId(115);	add15.setArea("Indore5");	add15.setCity("Navi Mumbai");	add15.setCountry("India");	add15.setPin(400704);	add15.setState("Maharashtra");	add15.setStreet("MGandhi Street");


	ArrayList<Address> addressList1=new ArrayList<Address>();
	addressList1.add(add3);	addressList1.add(add2);	addressList1.add(add1);
	
	ArrayList<Address> addressList2=new ArrayList<Address>();
	addressList2.add(add4);	addressList2.add(add5);	
	
	ArrayList<Address> addressList3=new ArrayList<Address>();
	addressList3.add(add6);	addressList3.add(add7);	addressList3.add(add8); addressList3.add(add9);
	
	ArrayList<Address> addressList4=new ArrayList<Address>();
	addressList4.add(add10);	
	
	ArrayList<Address> addressList5=new ArrayList<Address>();
	addressList5.add(add11);	addressList5.add(add12);	addressList5.add(add13); addressList5.add(add14);
	addressList5.add(add15);
	
	
	
	employee1.setAddressList(addressList1);
	employee2.setAddressList(addressList2);
	employee3.setAddressList(addressList3);
	employee4.setAddressList(addressList4);
	employee5.setAddressList(addressList5);
	

	Project project1 = new Project();
	Project project2 = new Project();
	Project project3 = new Project();
	Project project4 = new Project();
	Project project5 = new Project();
		
	project1.setProjectId(121);
	project1.setProjectTitle("Online Banking");
	project1.setProjectDeadLine(LocalDate.of(2022, 04, 04));
	
	project2.setProjectId(122);
	project2.setProjectTitle("Airline Project");
	project2.setProjectDeadLine(LocalDate.of(2022, 05, 04));
	
	
	project3.setProjectId(123);
	project3.setProjectTitle("Insurance Project");
	project3.setProjectDeadLine(LocalDate.of(2023, 05, 04));
	
	
	project4.setProjectId(125);
	project4.setProjectTitle("Online Shopping");
	project4.setProjectDeadLine(LocalDate.of(2023, 01, 01));
	
	
	project5.setProjectId(130);
	project5.setProjectTitle("Scheme For Farmers");
	project5.setProjectDeadLine(LocalDate.of(2025, 05, 24));
	
	
	ArrayList<Project> projectList1=new ArrayList<Project>();
	ArrayList<Project> projectList2=new ArrayList<Project>();
	ArrayList<Project> projectList3=new ArrayList<Project>();
	ArrayList<Project> projectList4=new ArrayList<Project>();
	ArrayList<Project> projectList5=new ArrayList<Project>();
	
	projectList1.add(project1);
	projectList1.add(project2);
	
	
	projectList2.add(project1);
	projectList2.add(project2);
	projectList2.add(project3);
	
	projectList3.add(project5);
	
	projectList4.add(project1);
	projectList4.add(project4);
	
	projectList5.add(project1);
	projectList5.add(project2);
	projectList5.add(project3);
	projectList5.add(project4);
	projectList5.add(project5);
	
	
	employee1.setProjectList(projectList1);
	employee2.setProjectList(projectList2);
	employee3.setProjectList(projectList3);
	
	employee4.setProjectList(projectList4);
	employee5.setProjectList(projectList5);

	
	EmployeeDAOImpl empDAO = new EmployeeDAOImpl();
	empDAO.addEmployee(employee1);
	empDAO.addEmployee(employee2);
	empDAO.addEmployee(employee3);
	empDAO.addEmployee(employee4);
	empDAO.addEmployee(employee5);

//	System.out.println(employee);
	
	
	Set<Employee> staff = empDAO.findAllEmployees();
	
	for (Employee employee : staff) {
	
		System.out.println("--- Employee Personal Information ---");
		System.out.println("Employee Number      :"+employee.getEmployeeNumber());
		System.out.println("Employee name        :"+employee.getEmployeeName());
		System.out.println("Employee joining     :"+employee.getEmployeeJoining());
		System.out.println("Employee Salary      :"+employee.getEmployeeSalary());
		
		System.out.println("--- Employee Passport Information ---");
		Passport passport = employee.getPassport();
		System.out.println("Passport number      : "+passport.getPassportId());
		System.out.println("Passport Issued Date : "+passport.getPassportIssuedDate());
		System.out.println("Passport Expiry Date : "+passport.getPassportExpiryDate());
		System.out.println("Passport Issued By   : "+passport.getIssuedBy());
			
		System.out.println("------------------------");
		System.out.println("--- Employee Address Information ---");
		ArrayList<Address> empAddList = employee.getAddressList();
		for (Address address : empAddList) {
			System.out.println("Area             : "+address.getArea());
			System.out.println("Street           : "+address.getState());
			System.out.println("City             : "+address.getCity());
			System.out.println("Country          : "+address.getCountry());
			System.out.println("Pin              : "+address.getPin());
			System.out.println("------------");
		}
		System.out.println("--- Employee Project Information ---");
		ArrayList<Project> empProjects = employee.getProjectList();
		for (Project project : empProjects) {
			System.out.println("Project id       : "+project.getProjectId());
			System.out.println("Project Title    : "+project.getProjectTitle());
			System.out.println("Project DeadLine : "+project.getProjectDeadLine());
			System.out.println("------------");
		}
		System.out.println("===================================================");
		try {
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



}

class Passport
{
	private int passportId; // <-- primary key
	private LocalDate passportIssuedDate;
	private LocalDate passportExpiryDate;
	private String issuedBy;
	
	public int getPassportId() {
		return passportId;
	}
	public void setPassportId(int passportId) {
		this.passportId = passportId;
	}
	public LocalDate getPassportIssuedDate() {
		return passportIssuedDate;
	}
	public void setPassportIssuedDate(LocalDate passportIssuedDate) {
		this.passportIssuedDate = passportIssuedDate;
	}
	public LocalDate getPassportExpiryDate() {
		return passportExpiryDate;
	}
	public void setPassportExpiryDate(LocalDate passportExpiryDate) {
		this.passportExpiryDate = passportExpiryDate;
	}
	public String getIssuedBy() {
		return issuedBy;
	}
	public void setIssuedBy(String issuedBy) {
		this.issuedBy = issuedBy;
	}
	@Override
	public String toString() {
		return "Passport [passportId=" + passportId + ", passportIssuedDate=" + passportIssuedDate
				+ ", passportExpiryDate=" + passportExpiryDate + ", issuedBy=" + issuedBy + "]";
	}
	
	
}
class Employee
{
	private int employeeNumber; //primary key
	private String employeeName;
	private LocalDate employeeJoining;
	private double employeeSalary;
	Passport passport= new Passport();
	ArrayList<Address> addressList = new ArrayList<Address>();
	ArrayList<Project> projectList= new ArrayList<Project>();
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
	public LocalDate getEmployeeJoining() {
		return employeeJoining;
	}
	public void setEmployeeJoining(LocalDate employeeJoining) {
		this.employeeJoining = employeeJoining;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public ArrayList<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(ArrayList<Address> addressList) {
		this.addressList = addressList;
	}
	public ArrayList<Project> getProjectList() {
		return projectList;
	}
	public void setProjectList(ArrayList<Project> projectList) {
		this.projectList = projectList;
	}
	@Override
	public String toString() {
		return "Employee [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", employeeJoining="
				+ employeeJoining + ", employeeSalary=" + employeeSalary + ", passport=" + passport + ", addressList="
				+ addressList + ", projectList=" + projectList + ", getEmployeeNumber()=" + getEmployeeNumber()
				+ ", getEmployeeName()=" + getEmployeeName() + ", getEmployeeJoining()=" + getEmployeeJoining()
				+ ", getEmployeeSalary()=" + getEmployeeSalary() + ", getPassport()=" + getPassport()
				+ ", getAddressList()=" + getAddressList() + ", getProjectList()=" + getProjectList() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
class Address
{
	private int addressId;
	private String area;
	private String street;
	private String city;
	private String state;
	private String country;
	private int pin;
	
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", area=" + area + ", street=" + street + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
	
}
class Project
{
	private int projectId;
	private String projectTitle;
	private LocalDate projectDeadLine;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectTitle() {
		return projectTitle;
	}
	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}
	public LocalDate getProjectDeadLine() {
		return projectDeadLine;
	}
	public void setProjectDeadLine(LocalDate projectDeadLine) {
		this.projectDeadLine = projectDeadLine;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectTitle=" + projectTitle + ", projectDeadLine="
				+ projectDeadLine + "]";
	}
	
	 
}

