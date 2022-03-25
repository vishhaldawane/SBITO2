
public class InterfaceTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("Vishhal");
		Person p2 = new Person("Jack");
		Person p3 = new Person("Jane");
		
		p1.sleep(22, 7);	p1.wakeUp(5);
		p2.sleep(00, 7);	p2.wakeUp(7);
		p3.sleep(1, 7);		p3.wakeUp(8);
		
		System.out.println("--------------------------");
		
		Laptop l1 = new Laptop("MacBook");
		Laptop l2 = new Laptop("Dell Inspiron 5250");
		Laptop l3 = new Laptop("Leveno");
		
		l1.sleep(22, 7);  l1.wakeUp(6);
		l2.sleep(8, 2);   l2.wakeUp(10);
		l3.sleep(9, 3);   l3.wakeUp(12);
	}

}

interface Waking
{
	void wakeUp(int whatTime);
}
interface Sleeping
{
	void sleep(int whatTime, int howLong);
}
class NeuclearReactor 
{
	
}
class Laptop implements Waking, Sleeping //isA
{
	String modelName;
	
	public Laptop (String name) {
		super();
		this.modelName= name;
	}
	
	public void wakeUp(int whatTime) {
		System.out.println(modelName+" is waking up..at "+whatTime);
	}
	public void sleep(int whatTime, int howLong) {
		System.out.println(modelName+" is sleeping at "+whatTime+" for "+howLong+" hours");
	}
}

class Person implements Waking, Sleeping //isA
{
	String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	public void wakeUp(int whatTime) {
		System.out.println(name+" is waking up..at "+whatTime);
	}
	public void sleep(int whatTime, int howLong) {
		System.out.println(name+" is sleeping at "+whatTime+" for "+howLong+" hours");
	}
}
/* 60 
 * 		D	H	 Y	   A		N				A		M
 * 		|   |	 |     |		|				|		|
 *   detox hand Yoga Atma	 Navigated		  Atma		main
 *   		written  Sadhana Visualization    Vikas		Priorities
 *   		affirm
 * 
 */
