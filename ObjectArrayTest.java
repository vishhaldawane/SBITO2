import emp.Employee;

public class ObjectArrayTest {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(101,"jack",5000);
		Employee e2 = new Employee(102,"jane",6000);
		Employee e3 = new Employee(103,"jill",7000);
		
		Employee staff[] = new Employee[25]; //just 5 references | no allocation for empno,ename, salary
		 
		staff[0]= new Employee(101,"Shashi",5000); //allocate empno,ename,salary
		staff[1]= new Employee(102,"Ayan",6000);
		staff[2]= new Employee(103,"Nimya",7000);
		staff[3]= new Employee(104,"KrishnaKumar",8000);
		staff[4]= new Employee(105,"Suraj",9000);
	
		for (int i = 0; i < staff.length; i++) {
			System.out.println("staff "+staff[i]);	
		}
		
		System.out.println("Adding 5th employee...");
		staff[5]= new Employee(106,"Sourabh",10000);
		System.out.println("Added the 5th employee....");
		
	}
}




















class Log
{
	
}
class Contact
{
	
}
class ChemicalElement
{
	
}
class Book
{
	
}
