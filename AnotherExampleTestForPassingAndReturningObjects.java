/*
 * 	Person thePesonObj= new Person('F',"Julie",23);
 * 
 * 		stack						heap
 * 		|							|
 * 
 * 								gender	 name     age
 * 								-------------------------
 * 								|	F	| julie	| 23	|
 * 	main						-------------------------
 * 			 +------------------>100
 *			 |
 * 		+----|--+						METHOD AREA
  		|	100	|						Person()
  		+-------+						toString()
 * Person  x						printPerson()
 *    									setters/getters
 * Train 
 *    travel(Person y)
 *    
 *        100
 *     Person y
 *    
 */				
public class AnotherExampleTestForPassingAndReturningObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person perObj1 = new Person('F',"Julie",23);
		Person perObj2 = new Person('M',"Robert",25);
		
		Train trainObj = new Train();
		Destination dest = trainObj.travel(perObj1, perObj2,"Chennai","Tamilnadu","India",401501);
		System.out.println(dest);
		
		Person perObj3 = new Person('M',"Jack",20);
		Person perObj4 = new Person('M',"Jill",20);
		
		Train trainObj2 = new Train();
		Destination dest1 = trainObj2.travel(perObj3, perObj4,"Ahmedabad","Gujrat","India",501601);
		
		System.out.println(dest1);
		
	}
}
class Destination
{
	String city;
	String state;
	String country;
	int pin;
	public Destination(String city, String state, String country, int pin) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
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
		return "Destination [city=" + city + ", state=" + state + ", country=" + country + ", pin=" + pin + "]";
	}
	
}

class Train 
{
	Destination travel(Person x, Person y ) {
		System.out.println("Wow...im "+x.getName()+" travelling with "+y.getName());
		Destination dest = new Destination("Chennai","Tamilnadu","India",410510);
		return dest;
	}
	Destination travel(Person x, Person y, String ct, String st, String con, int p ) {
		System.out.println("Wow...im "+x.getName()+" travelling with "+y.getName());
		Destination dest = new Destination(ct,st,con,p);
		return dest;
	}
}

class Person
{
	private char gender;
	private String name;
	private int age;
	
	Person() { }
	
	public Person(char gender, String name, int age) {
		super();
		this.gender = gender;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [gender=" + gender + ", name=" + name + ", age=" + age + "]";
	}


	void printPerson() {
		System.out.println("Gender : "+gender);
		System.out.println("Name   : "+name);
		System.out.println("Age    : "+age);
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	
}


//Person perObj2 = perObj1;
//
//System.out.println("hash code of perObj1 "+perObj1.hashCode());
//System.out.println("hash code of perObj2 "+perObj2.hashCode());
//
//perObj1.printPerson();
//perObj2.printPerson();
//
//System.out.println("trying to change the age....");
//perObj1.setAge(33);
//System.out.println("age.is changed......");
//
//perObj1.printPerson();
//perObj2.printPerson();
