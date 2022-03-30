package emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

//Comparable  | Comparator

class HeightComparator implements Comparator<Girl>
{
	@Override
	public int compare(Girl o1, Girl o2) {
		System.out.println("HeightComparator: "+o1.name+" started comparing height with "+o2.name);
		return Float.compare(o1.height, o2.height);
	}
	
}
class WeightComparator implements Comparator<Girl>
{
	@Override
	public int compare(Girl o1, Girl o2) {
		System.out.println("WeightComparator: "+o1.name+" started comparing weight with "+o2.name);
		return Float.compare(o1.weight, o2.weight);
	}
	
}

class AgeComparator implements Comparator<Girl>
{
	@Override
	public int compare(Girl o1, Girl o2) {
		System.out.println("AgeComparator: "+o1.name+" started comparing age with "+o2.name);
		return Float.compare(o1.age, o2.age);
	}
	
}


public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Girl girl1 = new Girl("Reeta",6,50,23);
		Girl girl2 = new Girl("Geeta",5.5f,55.6f,25);
		Girl girl3 = new Girl("Meeta",4.4f,59.2f,22);
		Girl girl4 = new Girl("Seeta",5.3f,63.2f,21);
		Girl girl5 = new Girl("Neeta",5.2f,55.2f,25);
		
		ArrayList<Girl> collegeFriends = new ArrayList<Girl>();
		//LinkedList<Girl> collegeFriends = new LinkedList<Girl>();
		//HashSet<Girl> collegeFriends = new HashSet<Girl>();
		//TreeSet<Girl> collegeFriends = new TreeSet<Girl>();
		
		System.out.println("Adding 1st object");
		collegeFriends.add(girl1);
		
		System.out.println("Adding 2nd object");
		collegeFriends.add(girl2);
		
		System.out.println("Adding 3rd object");
		collegeFriends.add(girl3);
		
		System.out.println("Adding 4th object");
		collegeFriends.add(girl4);
		
		System.out.println("Adding 5th object");
		collegeFriends.add(girl5);
		
		System.out.println("sorting...");
		
		AgeComparator ageCmp = new AgeComparator();
		
		int choice= 0;
		do
		{
			System.out.println("SORT MENU");
			System.out.println("1. By Height");
			System.out.println("2. By Weight");
			System.out.println("3. By Age");
			System.out.println("4. Exit");
			System.out.println("Enter your choice :");
			Scanner scan = new Scanner(System.in);
			choice = scan.nextInt();
			
			Comparator<Girl> cmp = null;
			switch(choice)
			{
				case 1: cmp = new HeightComparator(); break;
				case 2: cmp = new WeightComparator(); break;
				case 3: cmp = new AgeComparator(); break;
				case 4: break;
			}
			if(cmp!=null) {
				Collections.sort(collegeFriends,cmp);
				System.out.println("sorted...");
			}
			
			
			Iterator<Girl> friendsIterator = collegeFriends.iterator();
			while(friendsIterator.hasNext()) {
				Girl g = friendsIterator.next();
				System.out.println(g);
			}
			
		}while (choice != 4);
			
		//girl2.compareHeight(girl1);
		//girl1.compareWeight(girl3);
		
	}

}

interface LivingBeing
{
	void breathIn();
	void breathOut();
}
abstract class Animal implements LivingBeing
{
	abstract void eat(); 
	abstract void sleep();
	abstract void fear();
	abstract void reproduction();
}
abstract class Mammal extends Animal
{
	abstract void giveBirth();
}
interface Thinking
{
	void think();
}
interface Feeling extends Thinking
{
	void feel();
}

interface Acting
{
	void act();
}
interface Resulting
{
	void produceResult();
}

class Human extends Mammal implements Thinking, Feeling, Acting, Resulting
{

	
	@Override
	public void breathIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void reproduction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void produceResult() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void feel() {
		// TODO Auto-generated method stub
		System.out.println("Human is feeling....");
	}

	@Override
	public void think() {
		// TODO Auto-generated method stub
		System.out.println("Human is thinking....");
	}
	
}
interface Barking
{
	void bark();
}
class Dog extends Mammal implements Barking
{

	@Override
	public void breathIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void breathOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void giveBirth() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void fear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void reproduction() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
	
}
class Person extends Human
{
	
}
class Girl extends Person implements Comparable<Girl>
{
	String name;
	float height;
	float weight;
	int age;
	
	public Girl(String name, float height, float weight, int age) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	
	public int compareTo(Girl x) {
		System.out.println("Comparable: "+name+" started comparing weight with "+x.name);
		/*if(height > x.height) {
			System.out.println(name+" is taller than "+x.name);
			return 1;
		}
		else if (height < x.height) {
			System.out.println(x.name+" is taller than "+name);
			return -1;
		}
		else {
			System.out.println("Both "+name+" and "+x.name+" are of same height");
			return 0;
		}*/
		return Float.compare(weight, x.weight);
	}
	
	
	void compareHeight(Girl x) {
		System.out.println(name+" started comparing height with "+x.name);
		if(height > x.height) {
			System.out.println(name+" is taller than "+x.name);
		}
		else if (height < x.height) {
			System.out.println(x.name+" is taller than "+name);
		}
		else {
			System.out.println("Both "+name+" and "+x.name+" are of same height");
		}
 
	}
	
	void compareWeight(Girl x) {
		System.out.println(name+" started comparing weight with "+x.name);
		if(weight> x.weight) {
			System.out.println(name+" is heavier than "+x.name);
		}
		else if (weight < x.weight) {
			System.out.println(x.name+" is heavier than "+name);
		}
		else {
			System.out.println("Both "+name+" and "+x.name+" are of same weight");
		}
	}
	
	void discuss(Girl x, Girl y) {
		System.out.println(name+","+x.name+" and "+y.name+ " are discussing..Java");
	}

	void talk(Girl x) {
		System.out.println(name+" is talking...with ..."+x.name);
	}


	void selfTalk() {
		System.out.println(name+" is having a self talk......");
	}


	@Override
	public void feel() {
		// TODO Auto-generated method stub
		System.out.println(name+" is feeling...");
		
	}

	@Override
	public void think() { //thought  
		// TODO Auto-generated method stub
		System.out.println(name+" is thinking.....");
	}


	@Override
	public String toString() {
		return "Girl [name=" + name + ", height=" + height + ", weight=" + weight + ", age=" + age + "]";
	}

	
	
}

class Woman extends Girl
{
	
}
class Mother extends Woman
{
	
}
class GrandMother extends Mother
{
	
}