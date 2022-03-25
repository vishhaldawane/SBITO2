import java.time.LocalDate;

abstract class BankAccount
{
	//DATA-MEMBER / fields  SECTION
	private int accountNumber;
	private String accountHolderName;
	private float accountBalance;
	private LocalDate accountOpeningDate;
	private LocalDate accountHolderBirthdate;
	private int age;
	
	//MEMBER-FUNCTIONS / methods SECTION

	public BankAccount(int accountNumber, String accountHolderName, float accountBalance, LocalDate accountOpeningDate, LocalDate accountHolderBirthdate) {
		
		System.out.println("Setting the bank account details....");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance= accountBalance;
		this.accountOpeningDate = accountOpeningDate;
		this.accountHolderBirthdate = accountHolderBirthdate;
		
		LocalDate todaysDate = LocalDate.now();
		
		this.age = todaysDate.getYear() - accountHolderBirthdate.getYear();
	}
	
	

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", accountOpeningDate=" + accountOpeningDate
				+ ", accountHolderBirthdate=" + accountHolderBirthdate + ", age=" + age + "]";
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
	//BankAccount() { }
}
