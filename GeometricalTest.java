class Geometry
{
	public static void process(GeometricalShape x)
	{
		x.draw();
	}
}
public class GeometricalTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated constructor stub
		GeometricalShape gs ;
		
		Square s= new Square(22);
		s.draw();
		s.calcArea();
		
		Rectangle r = new Rectangle(22, 44);
		r.draw();
		r.calcArea();
		
		gs = s;
		
		gs.draw();
		
		gs = r;
		
		gs.draw();
		
		System.out.println("-------------");
		Geometry.process(r);
		Geometry.process(s);
	
		// ing 75 kg
		//think + feel		+ ACTION + RESULT

		Mammal m = new Mammal();
		Person p = new Person();
		CinemaHall.watchMovie(p);
	}

}

class CinemaHall
{
	static void watchMovie(Human  h)
	{
		
	}
}

class Animal
{
	
}
class Mammal extends Animal {
	
}
class Human extends Mammal {
	
}
class Person extends Human {
	
}

class Student extends Person {
	
}
class Employee extends Student
{
	
}
class Executive extends Employee
{
	
}
class Manager extends Executive  
{
	
}
class Director extends Manager
{
	
}
class Founder extends Director
{
	
}
//abstract method - partial contract of a class

/*
 
 
  
 				Inheritance
 						|
 			-------------------------------
 			|						|
 		Derivation			Implementation
 		
 		X
 		| fee();
 		A						P
 		|fun() { }				| fun();
 		B						Q <-- Must define this fun() here 
 		| foo() { }				| fun() { }
 		C						R
 		  fee() { }
  
 */
abstract class GeometricalShape
{
	abstract void draw(); //code is undefined/declared/partial
	abstract void calcArea();
}

class Square extends GeometricalShape
{
	int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	void draw() {
		System.out.println("drawing Square....");
	}

	@Override
	void calcArea() {
		System.out.println("calcArea of Square...");
		float area = side * side;
		System.out.println("Area of the Square is : "+area);
	}
	
}

class Rectangle extends Square //isA
{
	int side2;

	public Rectangle(int side, int side2) {
		super(side);
		this.side2 = side2;
	}
	void draw() {
		System.out.println("drawing rectangle....");
	}

	@Override
	void calcArea() {
		System.out.println("calcArea of rectangle...");
		float area = side * side2;
		System.out.println("Area of the Rectangle is : "+area);
	}
	
}









