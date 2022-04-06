package namedquery;

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

public class NamedQueryTest {
	
	@Test
	public void showEmployeesAsPerSalary() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MyJPA"); 
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String token1 = "allEmpEarning3kAbove";
		String token2 = "allEmpEarning2kTo3k";
		
		System.out.println("Named query token1 : "+token1);
		System.out.println("Named query token2 : "+token2);
		
		//Query query = entityManager.createNamedQuery(token1, Emp.class);
		//query.setParameter("tempsal", 3000);
		
		Query query = entityManager.createNamedQuery(token2, Emp.class);
		query.setParameter("lowsal", 2000);
		query.setParameter("highsal", 3000);
		
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
