
public class DataTypesTest {

	//   -128  ......0 ........127


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte playerNumber=10;
		System.out.println("player number    : "+playerNumber);
		System.out.println("byte's min value : "+Byte.MIN_VALUE);
		System.out.println("byte's max value : "+Byte.MAX_VALUE);
		System.out.println("size of byte is  : "+Byte.SIZE+" bits");
		System.out.println("----------------------------");
	
		short rollNumber=12312;
		System.out.println("roll number       : "+rollNumber);
		System.out.println("short min value   : "+Short.MIN_VALUE);
		System.out.println("short's max value : "+Short.MAX_VALUE);
		System.out.println("size of short is  : "+Short.SIZE+" bits");
		System.out.println("----------------------------");

		int socialSecurityNumber=123123132;
		System.out.println("ss number           : "+socialSecurityNumber);
		System.out.println("Integer's min value : "+Integer.MIN_VALUE);
		System.out.println("Integer's max value : "+Integer.MAX_VALUE);
		System.out.println("size of int is      : "+Integer.SIZE+" bits");
		System.out.println("----------------------------");

		long globalAccountNumber=99999999999l;
		System.out.println("ga number           : "+globalAccountNumber);
		System.out.println("Long's min value    : "+Long.MIN_VALUE);
		System.out.println("Long's max value    : "+Long.MAX_VALUE);
		System.out.println("size of long is     : "+Long.SIZE+" bits");
		System.out.println("----------------------------");

		float interestRate=3.5f;
		System.out.println("interest rate        : "+interestRate);
		System.out.println("Float's min value    : "+Float.MIN_VALUE);
		System.out.println("Float's max value    : "+Float.MAX_VALUE);
		System.out.println("size of float is     : "+Float.SIZE+" bits");
		System.out.println("----------------------------");

		double molecularDistance=0.000125f;
		System.out.println("molecularDistance     : "+molecularDistance);
		System.out.println("Double's min value    : "+Double.MIN_VALUE);
		System.out.println("Double's max value    : "+Double.MAX_VALUE);
		System.out.println("size of double is     : "+Double.SIZE+" bits");
		System.out.println("----------------------------");
		
		char ch='A';
		System.out.println("ch is                 : "+ch);
		System.out.println("Character's min value : "+Character.MIN_VALUE);
		System.out.println("Character's max value : "+Character.MAX_VALUE);
		System.out.println("size of char is       : "+Character.SIZE+" bits");
		System.out.println("----------------------------");
		
		boolean isCertifiedInJava=true;
		System.out.println("isCertifiedInJava     : "+isCertifiedInJava);
		
		if(isCertifiedInJava) 
			System.out.println("Wow!!! You are Java Certified...");
		else	
			System.out.println("You can become Java Certified...");
		
		System.out.println("----------------------------");
		
		String message ="I love Java Programming Language";
		System.out.println("message : "+message);
		System.out.println("message : "+message.toUpperCase());
		System.out.println("message : "+message.toLowerCase());
		
	}

}
