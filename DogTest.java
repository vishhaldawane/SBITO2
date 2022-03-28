import java.io.FileInputStream;

/*
 * 
 * 	stack							heap
 * 		|							|
 * 
 * 										age		  name
 * 										------------------
 * 										|		|		|
 * 										------------------
 * 		+-----------------------------> 100
 * 		|
 * 		100
 * 		dogObjRef1
 */

public class DogTest {

	public static void main(String[] args) {
	
		System.out.println("begin main...");
		
//		String str = "abcdA23BCD";
//        boolean result = str.matches("[a-zA-Z]+");
//        System.out.println("Original String : " + str);
//        System.out.println("Does string contain only Alphabets? : " + result);
//   
		
		
		try
		{
			
		}
		
		
			Dog dogObjRef1;
			try {
				dogObjRef1 = new Dog(-12,"Tommy");
				System.out.println("dog is "+dogObjRef1);
			} catch (DogsAgeExceededException e) {
				System.out.println("Handler1 : exception in dogs age : " +e );
				
			} catch (DogsAgeNegativeException e) {
				System.out.println("Handler2 : exception in dogs age : " +e);
			} catch (DogsNameInvalidException e) {
				System.out.println("Handler3 : exception in dogs name : "+e );
			}
			finally {
				System.out.println("finally executed regardless of the exceptions");
			}
		
		
		
		System.out.println("End main...");
		
	}
}

class DogsAgeExceededException extends Exception
{
	DogsAgeExceededException(String str) {
		super(str);
	}
}
class DogsAgeNegativeException extends Exception
{
	DogsAgeNegativeException (String str) {
		super(str);
	}
}
class DogsNameInvalidException extends Exception
{
	DogsNameInvalidException (String str) {
		super(str);
	}
}
class Dog 
{
	int age;
	String name;
	
	public Dog(int age, String name) throws DogsAgeExceededException, DogsAgeNegativeException, DogsNameInvalidException {
		super();
		System.out.println("Dog()...started....");
		if(age > 14) {
			//System.out.println("Dogs age cannot exceed 14");
			throw new DogsAgeExceededException("Dogs age cannot exceed 14"); //- > JVM --> rethrow it to you -> if u dont have catch block, then it is thrown back to JVM 	
		}
		else if(age < 0 ) {
			//System.out.println("Dogs age cannot exceed 14");
			throw new DogsAgeNegativeException("Dogs age cannot be in negative..."); //- > JVM --> rethrow it to you -> if u dont have catch block, then it is thrown back to JVM 	
		}
		else
			this.age = age;
		
		if(name.matches("[a-zA-Z]+"))
			this.name = name;
		else {
			throw new DogsNameInvalidException("Dog's name must be in alphabets"); //- > JVM --> rethrow it to you -> if u dont have catch block, then it is thrown back to JVM
		}
		
		System.out.println("Dog()...FINSHED....");
	}
	
	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	
	
}
