import java.time.LocalDate;

public class FixedDepositAccount extends SavingsAccount {

	LocalDate maturityDate;
	float maturityAmount;
	
	public FixedDepositAccount(int accountNumber, String accountHolderName, float accountBalance,
			LocalDate accountOpeningDate, LocalDate accountHolderBirthdate) {
		super(accountNumber, accountHolderName, accountBalance, accountOpeningDate, accountHolderBirthdate);
		// TODO Auto-generated constructor stub
	}

	public FixedDepositAccount(int accountNumber, String accountHolderName, float accountBalance,
			LocalDate accountOpeningDate, LocalDate accountHolderBirthdate, float rateOfInterest) {
		super(accountNumber, accountHolderName, accountBalance, accountOpeningDate, accountHolderBirthdate,
				rateOfInterest);
		// TODO Auto-generated constructor stub
	}

	public FixedDepositAccount(int accountNumber, String accountHolderName, float accountBalance,
			LocalDate accountOpeningDate, LocalDate accountHolderBirthdate, float rate, LocalDate maturityDate,
			float maturityAmount) {
		super(accountNumber, accountHolderName, accountBalance, accountOpeningDate, accountHolderBirthdate, rate);
		this.maturityDate = maturityDate;
		this.maturityAmount = maturityAmount;
	}

	public LocalDate getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(LocalDate maturityDate) {
		this.maturityDate = maturityDate;
	}

	public float getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(float maturityAmount) {
		this.maturityAmount = maturityAmount;
	}
	void printFixedDepositAccount() {
		
		super.printSavingsAccount();
		System.out.println("maturity date   : "+maturityDate);
		System.out.println("maturity amount : "+maturityAmount);
				
		System.out.println("---------------------");
	}
}
