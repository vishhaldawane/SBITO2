
public class BankTest {

	public static void main(String[] args) {

		BankAccount baObj1 = new BankAccount();
		
		BankAccount baObj2 = new BankAccount();
		baObj2.setBankAccount(102, "Mayur Wankhede", 95000.0f,20);
		
		BankAccount baObj3 = new BankAccount();
		BankAccount baObj4 = new BankAccount();
		BankAccount baObj5 = new BankAccount();
		
		baObj1.setBankAccount(101, "Shashi Bamne", 90000.0f,23);
		baObj1.printBankAccount();
		
		float updatedBalance = baObj1.withdraw(10000);
		System.out.println("Updated balance is "+updatedBalance);
		
		
		updatedBalance = baObj1.withdraw(5000);
		System.out.println("Updated balance is "+updatedBalance);
		
		updatedBalance = baObj1.withdraw(7000);
		System.out.println("Updated balance is "+updatedBalance);
		
		
		updatedBalance = baObj1.deposit(75000);
		System.out.println("Updated balance is "+updatedBalance);
		
		
		float si = baObj1.calculateSimpleInterest();
		System.out.println("Simple interest is "+si);
		
		
		float si1 = baObj2.calculateSimpleInterest();
		System.out.println("Simple interest is "+si1);
		
		
		
		/*
		baObj3.setBankAccount(103, "Jyotsna Kasukurthi", 98000.0f,19);
		baObj4.setBankAccount(104, "Poornima Athre", 99000.0f,18);
		baObj5.setBankAccount(105, "Sagar Burade", 190000.0f,21);
		
		baObj1.printBankAccount();
		baObj2.printBankAccount();
		baObj3.printBankAccount();
		baObj4.printBankAccount();
		baObj5.printBankAccount();
		*/
	}

}


//isA  hasA  usesA  producesA

class BankAccount
{
	//DATA-MEMBER / fields  SECTION
	int accountNumber;
	String accountHolderName;
	float accountBalance;
	int age;
	
	
	//MEMBER-FUNCTIONS / methods SECTION
	
	void setBankAccount(int x, String y, float z, int a) {
		System.out.println("Setting the bank account details....");
		accountNumber = x;
		accountHolderName = y;
		accountBalance= z;
		age = a;
	}
	
	void printBankAccount() {
		System.out.println("Bank Account Number  : "+accountNumber);
		System.out.println("Bank Holder Name     : "+accountHolderName);
		System.out.println("Bank Account Balance : Rs."+accountBalance+"/-");
		System.out.println("Bank Holder's Age    : "+age+" years");
		
		System.out.println("---------------------");
	}
	
	float withdraw(float amountToWithdraw) {
		System.out.println("withdrawing...."+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		return accountBalance;
	}
	float deposit(float amountToDeposit) {
		System.out.println("Depositing...."+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		return accountBalance;
	}
	
	float calculateSimpleInterest() {
		System.out.println("Calculating simple interest....");
		float si = accountBalance * 1 * 2.5f / 100;
		return si;
	}

}






