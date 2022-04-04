import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManagerFactory emf;
	EntityManager em ;
	
	public EmployeeDAOImpl() {
		System.out.println("EmployeeDAOImpl()....");
		// TODO Auto-generated method stub
				System.out.println("Trying to read persistence.xml file...");
				
				//3
				this.emf = Persistence.createEntityManagerFactory("MyJPA");
				System.out.println("EntityManagerFactory created....");
				
				this.em = emf.createEntityManager();
				System.out.println("EntityManager created....");
	}
	public void addEmployee(Employee empolyee) {
		
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.persist(empolyee);
		et.commit();
		
	}

	public void modifyEmployee(Employee emp) {
		EntityTransaction et = em.getTransaction();
		et.begin();
			em.merge(emp);
		et.commit();

	}

	public void deleteEmployee(int empno) {
		EntityTransaction et = em.getTransaction();
		et.begin();
			Employee emp = em.find(Employee.class, empno);
			em.remove(emp);
		et.commit();
		
	}

	public Employee findEmployee(int empno) {
		return em.find(Employee.class, empno);
	}

	public Set<Employee> findAllEmployees() {
		Query query = em.createQuery("from Employee");
		List<Employee> list = query.getResultList();
		Set<Employee> empSet = new HashSet(list);
		return empSet;
	}

}
