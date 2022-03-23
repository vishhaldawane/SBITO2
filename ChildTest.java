
public class ChildTest {
	public static void main(String[] args) {
		
		GrandFather gf = new GrandFather();
		gf.farming();
		
		
		System.out.println("----------------------");
		
		Father f= new Father();
		f.farming();
		f.banking();
		
	
		
		System.out.println("----------------------");
		Child c = new Child();
		c.banking();
		c.farming();
		c.javaCoding();
	}
}

class GrandFather 
{
	GrandFather() {
		System.out.println("GrandFather() ctor....");
	}
	void farming() {
		System.out.println("GrandFather is farming...using bull .");
	}
}
class Father extends GrandFather
{
	Father() {
		//super();
		System.out.println("Father() ctor....");
	}
	void farming() {
		System.out.println("Father is farming....using tractor...");
	}
	void banking() {
		System.out.println("Father is banking...");
	}
}

class Child extends Father
{
	Child() {
		super();
		System.out.println("Child() ctor.....");
	}
	void farming() {
		
		System.out.println("Child is farming....using robo tractor...");
	}
	void banking() {
		System.out.println("Child is net banking...");
	}
	void javaCoding() {
		System.out.println("Child is coding in java...");
	}
}




class Person
{
	
}
class Student extends Person
{
	
}
class Employee extends Student
{
	
}