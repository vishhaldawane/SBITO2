package jpql;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Test;

import dao.BaseDAO;
import dao.BaseDAOImpl;
import entity.Emp;

public class JPQLTest {
	
	@Test
	public void showEmployeesAsPerSalary() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		//SQL:   select * from Employee_tbl WHERE EMP_SAL  >=3000
		//JPQL:           FROM Emp e        WHERE e.salary >= 3000
		
		String str= "FROM Emp e WHERE e.salary >= 3000";
		System.out.println("JPQL : "+str);
		
		Query query = entityManager.createQuery(str);
		
		List<Emp> staff = query.getResultList();
		
		for (Emp employee : staff) {
			System.out.println("Emp Number   : "+employee.getEmployeeNumber());
			System.out.println("Emp Name     : "+employee.getEmployeeName());
			System.out.println("Emp Manager  : "+employee.getMgr());
			System.out.println("Emp Job      : "+employee.getJob());
			System.out.println("Emp Hiredate : "+employee.getHiredate());
			System.out.println("Emp Salary   : "+employee.getSalary());
			System.out.println("Emp Comm     : "+employee.getCommision());
			System.out.println("Emp Deptno   : "+employee.getDepartmentNumber());
			System.out.println("------------------------");
		}
	}
	
	
	
}
