import java.util.Scanner;

public class ScannerAwareness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);
		
		System.out.println("Enter empno : ");
		int x = scan1.nextInt(); //100 <-|
		
		System.out.println("Enter name    : ");
		String y = scan2.nextLine(); //new york
		
		System.out.println("Enter age   : ");
		int z = scan3.nextInt();
		
		System.out.println("x "+x+"...ok");
		System.out.println("y "+y+"...ok");
		System.out.println("z "+z+"...ok");
		
		
		
	}

}

/*


	
*/