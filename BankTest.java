import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.time.LocalDate;


public class BankTest {

	public static void main(String[] args) {

		Button b1 = new Button("OK");
		Button b2 = new Button("CANCEL");
		
		TextField t = new TextField(20);
		TextArea ta = new TextArea(5,20);
		
		FlowLayout fl = new FlowLayout();
		
		Frame f = new Frame();
		
		f.setLayout(fl);
		
		f.add(t);
		f.add(ta);
		f.add(b1);
		f.add(b2);
		
		f.setLocation(100,400);
		f.setSize(500,800);
		f.setVisible(true);
		/*LocalDate   sampleDate = LocalDate.of(2022, 3, 25);
		
		System.out.println("date is "+sampleDate);
		System.out.println("year   "+sampleDate.getYear());
		System.out.println("Month  "+sampleDate.getMonth());
		System.out.println("Day    "+sampleDate.getDayOfMonth());
		*/
		
		
		
		BankAccount baObj1 = new BankAccount();
		BankAccount baObj2 = new BankAccount();
		BankAccount baObj3 = new BankAccount();
		BankAccount baObj4 = new BankAccount();
		BankAccount baObj5 = new BankAccount();
		
		baObj1.setBankAccount(101, "Shashi Bamne", 90000.0f, LocalDate.of(2019, 1, 10), LocalDate.of(2000, 6, 10));
		baObj1.printBankAccount();
		
		baObj1.withdraw(95000);
		baObj1.printBankAccount();
		
		//baObj1.calculateSimpleInterest();
		baObj1.deposit(50001);
		baObj1.printBankAccount();

		baObj1.changeAccountHolderName("SHASHI BAMNE");

		baObj1.printBankAccount();
		
		
		/*baObj2.setBankAccount(102, "Mayur Wankhede", 95000.0f,20);
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


// ACCESSOR  VS MUTATOR

class BankAccount
{
	//DATA-MEMBER / fields  SECTION
	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	private LocalDate accountOpeningDate;
	private LocalDate accountHolderBirthdate;
	private int age;
	
	//MEMBER-FUNCTIONS / methods SECTION
	
	void setBankAccount(int x, String y, float z, LocalDate aod, LocalDate dob) {
		System.out.println("Setting the bank account details....");
		accountNumber = x;
		accountHolderName = y;
		accountBalance= z;
		accountOpeningDate = aod;
		accountHolderBirthdate = dob;
		
		LocalDate todaysDate = LocalDate.now();
		
		age = todaysDate.getYear() - dob.getYear();
	}
	
	void printBankAccount() {
		System.out.println("Bank Account Number  : "+accountNumber);
		System.out.println("Bank Holder Name     : "+accountHolderName);
		System.out.println("Bank Account Balance : Rs."+accountBalance+"/-");
		System.out.println("Account Opening Date : "+accountOpeningDate);
		System.out.println("Account Holder DOB   : "+accountHolderBirthdate);
		System.out.println("Bank Holder's Age    : "+age+" years");
		float si = calculateSimpleInterest();
		System.out.println("Bank SI              : "+si);
		
				
		System.out.println("---------------------");
	}
	
	float withdraw(float amountToWithdraw) {
		System.out.println("withdrawing...."+amountToWithdraw);
		if(amountToWithdraw > accountBalance) {
			System.out.println("Insufficient funds...!!!!");
		}
		else {
			accountBalance = accountBalance - amountToWithdraw;
		}
		
		return accountBalance;
	}
	float deposit(float amountToDeposit) {
		System.out.println("Depositing...."+amountToDeposit);
	
		if(amountToDeposit > 50000) {
			System.out.println("please specify the source of the income...");
		}
		else {
			accountBalance = accountBalance + amountToDeposit;
		}
		return accountBalance;
	}
	
	private float calculateSimpleInterest() {
		System.out.println("Calculating simple interest....");
		float si = accountBalance * 1 * 2.5f / 100;
		return si;
	}

	void changeAccountHolderName(String newName) {
		System.out.println("changing the account holder's name to "+newName);
		accountHolderName = newName;
	}
	
}






