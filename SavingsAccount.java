import java.time.LocalDate;

public class SavingsAccount extends BankAccount {

	float rateOfInterest;
	
	
	public SavingsAccount(int accountNumber, String accountHolderName, float accountBalance,
			LocalDate accountOpeningDate, LocalDate accountHolderBirthdate) {
		super(accountNumber, accountHolderName, accountBalance, accountOpeningDate, accountHolderBirthdate);
		// TODO Auto-generated constructor stub
	}


	public SavingsAccount(int accountNumber, String accountHolderName, float accountBalance,
			LocalDate accountOpeningDate, LocalDate accountHolderBirthdate, float rateOfInterest) {
		super(accountNumber, accountHolderName, accountBalance, accountOpeningDate, accountHolderBirthdate);
		this.rateOfInterest = rateOfInterest;
	}
	void printSavingsAccount() {
		super.printBankAccount();
		System.out.println("rate of interest : "+rateOfInterest);
				
		System.out.println("---------------------");
	}

}
