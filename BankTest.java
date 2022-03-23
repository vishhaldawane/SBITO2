import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.time.LocalDate;
import java.time.LocalDateTime;



public class BankTest {

	public static void main(String[] args) {
		
		
		MovieTicket movieTicket1 = new MovieTicket();
		movieTicket1.setTicketNumber(123);
		movieTicket1.setMovieName("Pushpa");
		movieTicket1.setTicketCost(200);
		movieTicket1.setSeatNumber(2);
		movieTicket1.setMovieDateTime(LocalDateTime.of(2022,3,23,12,30));
		movieTicket1.setMovieName("Pushpa");
		
		System.out.println("movie ticket is "+movieTicket1);
	
		
		//"Customer" purchased a "MovieTicket" by spending money from
		//his/her "BankAccount"
	/*	
	
		BankAccount baObj2 = new BankAccount();
		BankAccount baObj3 = new BankAccount();
		BankAccount baObj4 = new BankAccount();
		BankAccount baObj5 = new BankAccount();
		
		baObj1.setBankAccount(101, "Shashi Bamne", 90000.0f, LocalDate.of(2019, 1, 10), LocalDate.of(2000, 6, 10));
		baObj2.setBankAccount(102, "Mayur Wankhede", 92000.0f, LocalDate.of(2019, 1, 12), LocalDate.of(2000, 6, 12));
		baObj3.setBankAccount(103, "Jyotsna Kasukurthi", 94000.0f, LocalDate.of(2018, 6, 20), LocalDate.of(2001, 3, 30));
		baObj4.setBankAccount(104, "Poornima Athre", 95000.0f, LocalDate.of(2015, 5, 25), LocalDate.of(2002, 9, 20));
		baObj5.setBankAccount(105, "Sagar Burade", 96000.0f, LocalDate.of(2017, 3, 30), LocalDate.of(2003, 2, 10));
		
		int x=100;
		System.out.println("x is "+x); // String.valueOf(x) ->"100" ->concat()
		
		System.out.println("baObj1 is "+baObj1); // Object-> toString()
		System.out.println("baObj2 is "+baObj2);
		System.out.println("baObj3 is "+baObj3);
		System.out.println("baObj4 is "+baObj4);
		System.out.println("baObj5 is "+baObj5);
		*/
//		baObj1.printBankAccount();
//		baObj2.printBankAccount();
//		baObj3.printBankAccount();
//		baObj4.printBankAccount();
//		baObj5.printBankAccount();
		
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
	
	
	
	void setBankAccount(int accountNumber, String accountHolderName, float accountBalance, LocalDate accountOpeningDate, LocalDate accountHolderBirthdate) {
		
		System.out.println("Setting the bank account details....");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance= accountBalance;
		this.accountOpeningDate = accountOpeningDate;
		this.accountHolderBirthdate = accountHolderBirthdate;
		
		LocalDate todaysDate = LocalDate.now();
		
		this.age = todaysDate.getYear() - accountHolderBirthdate.getYear();
	}
	
	public BankAccount(int accountNumber, String accountHolderName, float accountBalance, LocalDate accountOpeningDate,
			LocalDate accountHolderBirthdate, int age) {
		super();
		System.out.println("BankAccoutnt(....) ctor.......");

		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.accountOpeningDate = accountOpeningDate;
		this.accountHolderBirthdate = accountHolderBirthdate;
		this.age = age;
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

class SavingsAccount extends BankAccount
{
	float rateOfInterest;

	public SavingsAccount(int accountNumber, String accountHolderName, float accountBalance,
			LocalDate accountOpeningDate, LocalDate accountHolderBirthdate, int age, float rateOfInterest) {
		super(accountNumber, accountHolderName, accountBalance, accountOpeningDate, accountHolderBirthdate, age);
		this.rateOfInterest = rateOfInterest;
	}
	
	
}


class MovieTicket
{
	private int ticketNumber;
	private String movieName;
	private float ticketCost;
	private int seatNumber;
	private LocalDateTime movieDateTime;

	public void setMovieTicket(int ticketNumber, String movieName, float ticketCost, int seatNumber,
			LocalDateTime movieDateTime) {
		this.ticketNumber = ticketNumber;
		this.movieName = movieName;
		this.ticketCost = ticketCost;
		this.seatNumber = seatNumber;
		this.movieDateTime = movieDateTime;
	}

	@Override
	public String toString() {
		return "MovieTicket [ticketNumber=" + ticketNumber + ", movieName=" + movieName + ", ticketCost=" + ticketCost
				+ ", seatNumber=" + seatNumber + ", movieDateTime=" + movieDateTime + "]";
	}

	public int getTicketNumber() {
		return ticketNumber;
	}

	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public float getTicketCost() {
		return ticketCost;
	}

	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public LocalDateTime getMovieDateTime() {
		return movieDateTime;
	}

	public void setMovieDateTime(LocalDateTime movieDateTime) {
		this.movieDateTime = movieDateTime;
	}
	
	
	
	
}




