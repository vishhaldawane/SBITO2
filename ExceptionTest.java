import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("line1");
		System.out.println("line2");
		System.out.println("line3");
		Scanner scan = new Scanner(System.in);
		//try {
			FileInputStream f = new FileInputStream("abc.txt");
	//	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
		//	e.printStackTrace();
		//}
	//	try
	//	{
			System.out.println("Enter value for x : ");
			int x= scan.nextInt(); //blocking for user input
			System.out.println("x "+x);
			
			System.out.println("Enter value for y : ");
			int y= scan.nextInt();
			System.out.println("y "+y);
		
			int z = x  / y;  //BL --> when this line is given to JVM 		System.out.println("z "+z);
			
			String str= null ;
			System.out.println(str.toUpperCase()+" is : "+z);
/*		}
		catch(InputMismatchException e) {
			System.out.println("please enter numbers..."+e);
		}
		catch(ArithmeticException e) {
			System.out.println("dont u know the maths... please enter deno as nonzero : "+e);
		}
		catch(NullPointerException e) {
			System.out.println("string is nulll....."+e);
		}
		catch(RuntimeException e) {
			System.out.println("im here if some other runtime error comes.."+e);
		}
		catch(Exception e ) {
			System.out.println("im here if some checked exceception arised..."+e);
		}
		catch(Throwable t) {
			System.out.println("im here if some fatal error comes...."+t);
		}*/
		System.out.println("line4");
		System.out.println("line5");
		System.out.println("line6");
		
	}
}
