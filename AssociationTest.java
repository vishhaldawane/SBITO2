
public class AssociationTest {
	public static void main(String[] args) {
		
		GirCow gc = new GirCow();
		
		Water w = new Water();
		Grass g = new Grass();
		
		gc.eat(g);
		gc.drink(w);
	
		
		Milk a2 = gc.milkACow();
		
		Curd c = a2.coagulate();
		Butter bt = c.churn();
		ClarifiedButter cb = bt.boil();
		
		
		
	}
}

class Animal
{
	
}
class Mammal extends Animal
{
	
}
class Cow extends Mammal
{
	
}

class Horn
{
	
}
class CurvedHorn extends Horn //isA
{
	
}

class Hump 
{
	
}

class GirCow extends Cow //isA
{
	int cowId;
	String cowName;
	CurvedHorn leftHorn = new CurvedHorn(); //hasA
	CurvedHorn rightHorn = new CurvedHorn(); //hasA
	Hump hump = new Hump(); //hasA
	
			//usesA <--pass object
	void eat(Grass g) {
		System.out.println("Cow is eating..."+g);
	}
	
			//usesA	<--passing object
	void drink(Water w) {
		System.out.println("Cow is drinking..."+w);
	}
	
	//producesA <-- returning object
	Milk  milkACow(){
		
		Milk m = new Milk();
		return m;
	}
	
}

class Grass
{
	
}
class Water
{
	
}

class Milk
{
	Curd coagulate() {
		
		Curd c = new Curd();
		return c;
	}
}
class Curd
{
	Butter churn() {
		
		Butter b = new Butter();
		return b;
	}
}

class Butter
{
	ClarifiedButter boil() {
	
		ClarifiedButter cb = new ClarifiedButter();
		return cb;
	}
}
class ClarifiedButter
{
	
}









/*

									   LivingBeing
											|
							-------------------------------
							|							|
							Animal					   Tree
							|							|
			-----------------------				
				|			|	
				Mammal	
				|
		---------------------------
		|		|		|
		Cow		Monkey	Tiger
		|
	 GirCow
		
				
				












*/