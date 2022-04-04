import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CrudTesting {

	@Test
	public void createEmployeeTest() {
		// TODO Auto-generated method stub
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to create record.....");
		Employee theEmp = new Employee(); //TRANSIENT OBJECT - IN MEMORY 
		//theEmp.setEmployeeNumber(102);
		theEmp.setName("Julie");
		theEmp.setJob("Clerk");
		theEmp.setJoiningDate(LocalDate.of(2019, 6, 22));
		theEmp.setSalary(52000);
		theEmp.setAge(22);
		
		Employee theEmp1 = new Employee();
		//theEmp.setEmployeeNumber(102);
		theEmp1.setName("Robert");
		theEmp1.setJob("Salesman");
		theEmp1.setJoiningDate(LocalDate.of(2018, 6, 22));
		theEmp1.setSalary(59000);
		theEmp1.setAge(23);
		
		Employee theEmp2 = new Employee();
		//theEmp.setEmployeeNumber(102);
		theEmp2.setName("Smith");
		theEmp2.setJob("Analyst");
		theEmp2.setJoiningDate(LocalDate.of(2015, 6, 22));
		theEmp2.setSalary(62000);
		theEmp2.setAge(29);
		
		
		et.begin();
			em.persist(theEmp); //PERSISTED OBJECT
			em.persist(theEmp1);
			em.persist(theEmp2);
		et.commit();
		
		System.out.println("Created the record.....");
		
	}
	
	@Test
	public void findEmplTest() {
		
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
	Assertions.assertTrue(emf!=null);
		
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager(); //ATTACHED OBJECT 
	Assertions.assertTrue(em!=null);
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to read record.....");
		Employee theEmp = em.find(Employee.class, 8); // 8 is the PK
	Assertions.assertTrue(theEmp!=null);
		System.out.println("Emp number : "+theEmp.getEmployeeNumber());
		System.out.println("Emp name   : "+theEmp.getName());
		System.out.println("Emp doj    : "+theEmp.getJob());
		System.out.println("Emp salary : "+theEmp.getSalary());
		System.out.println("Emp age    : "+theEmp.getAge());
		
	}
	
	@Test
	public void findAllEmpsTest() {
		
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
	Assertions.assertTrue(emf!=null);
		
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager(); //ATTACHED OBJECT 
	Assertions.assertTrue(em!=null);
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to read record.....");
		
		Query query = em.createQuery("from Employee"); //HQL 		SQL:select * from emp_tbl
		List<Employee> staff = query.getResultList();
		
		
	Assertions.assertTrue(staff.size() > 0);
		for (Employee theEmp : staff) {
				System.out.println("Emp number : "+theEmp.getEmployeeNumber());
				System.out.println("Emp name   : "+theEmp.getName());
				System.out.println("Emp doj    : "+theEmp.getJob());
				System.out.println("Emp salary : "+theEmp.getSalary());
				System.out.println("Emp age    : "+theEmp.getAge());
				System.out.println("------------------------------");
		}
		
	}
	
	
	@Test
	public void updateEmplTest() {
		
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
	Assertions.assertTrue(emf!=null);
		
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to read record.....");
		
		et.begin();
			System.out.println("Transactin started....");
			Employee theEmp = em.find(Employee.class, 8); // ATTACHED OBJECT
		Assertions.assertTrue(theEmp!=null);
			System.out.println("Current Emp number : "+theEmp.getEmployeeNumber());
			System.out.println("Current Emp name   : "+theEmp.getName());
			System.out.println("Current Emp doj    : "+theEmp.getJob());
			System.out.println("Current Emp salary : "+theEmp.getSalary());
			System.out.println("Current Emp age    : "+theEmp.getAge());
			
			System.out.println("Trying to make changes in the ATTACHED object's state via setter methods....");
			theEmp.setName("GoldSmith");
			theEmp.setJob("Sr.Analyst");
			theEmp.setSalary(theEmp.getSalary()+500);
			theEmp.setAge(theEmp.getAge()+2);
			
			em.merge(theEmp); //fires the update Query....
			System.out.println("Transactin completed.......");
		et.commit();
		
	}
	
	@Test
	public void updateEmplTest2() {
		
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
	Assertions.assertTrue(emf!=null);
		
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to read record.....");
		
		et.begin();
			System.out.println("Transactin started....");
			
			Employee theEmp = new Employee(); //TRANSIENT
			theEmp.setEmployeeNumber(7);
			theEmp.setName("MILLER");
			theEmp.setJob("Accountant");
			theEmp.setJoiningDate(LocalDate.of(2011, 6, 22));
			theEmp.setSalary(42000);
			theEmp.setAge(33);
				
			em.merge(theEmp); //fires the update Query....save or update
			System.out.println("Transactin completed.......");
		et.commit();
		
	}
	
	@Test
	public void deleteEmplTest() {
		
		System.out.println("Trying to read persistence.xml file...");
		
		//3
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
	Assertions.assertTrue(emf!=null);
		
		System.out.println("EntityManagerFactory created....");
		
		EntityManager em = emf.createEntityManager();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityManager created....");
		
		EntityTransaction et = em.getTransaction();
	Assertions.assertTrue(em!=null);
		System.out.println("EntityTransaction created....");
		
		System.out.println("Trying to read record.....");
		
		et.begin();
			System.out.println("Transactin started....");
			Employee theEmp = em.find(Employee.class, 8); // ATTACHED OBJECT
		Assertions.assertTrue(theEmp!=null);
			System.out.println("Current Emp number : "+theEmp.getEmployeeNumber());
			System.out.println("Current Emp name   : "+theEmp.getName());
			System.out.println("Current Emp doj    : "+theEmp.getJob());
			System.out.println("Current Emp salary : "+theEmp.getSalary());
			System.out.println("Current Emp age    : "+theEmp.getAge());
			
			System.out.println("Trying to DELETE THE ATTACHED object's ");
		
			
			em.remove(theEmp);
			
			System.out.println("Transaction completed.......");
		et.commit();
		
	}
}
