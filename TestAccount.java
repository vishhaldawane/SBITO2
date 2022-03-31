import java.time.LocalDateTime;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

public class TestAccount {

	@Test
	public void testStatement() {
		
		ArrayList<Statement> bankStatement =new ArrayList<Statement>();
		
		Statement st1 = new Statement(LocalDateTime.now(), "Debit",5000);
		Statement st2 = new Statement(LocalDateTime.now(), "Credit",6000);
		Statement st3 = new Statement(LocalDateTime.now(), "ATM Withdrawal",7000);
		Statement st4 = new Statement(LocalDateTime.now(), "ATM Depisut",8000);
		
		bankStatement.add(st1);
		bankStatement.add(st2);
		bankStatement.add(st3);
		bankStatement.add(st4);
		
		for (Statement statement : bankStatement) {
			System.out.println("st : "+statement);	
		}
		
		
		
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		AccountRepository accRepo = new AccountRepository();// 5 objects in the repo
		
		AccountService accService = new AccountService(accRepo);
		AccountController accControl = new AccountController(accService);
		
		AngularForm	angForm = new AngularForm(accControl);
		
		float bal1 = angForm.getBalanceEnquiry(101);
		System.out.println("Balance of 101 "+bal1);

		angForm.withdraw(101, 5000);
		angForm.depsoit(101,7000);
		angForm.withdraw(101, 3000);
		angForm.depsoit(101,17000);
		angForm.withdraw(101, 8000);
		angForm.depsoit(101,9000);
		
		angForm.printMiniStatement(101);
		
		float bal2 = angForm.getBalanceEnquiry(101);
		System.out.println("Balance of 101 "+bal2);
		
		accService.fundTransferService(101, 102, 7000);
		angForm.printMiniStatement(101);
		System.out.println("===============================================");
		angForm.printMiniStatement(102);
		
		
				
	}

}
// service1 : withdraw
// service2 : deposit
// service3 : fetch balance
// service4 : transfer funds from one account to another account
// service5 : print the statement of all the transactions

class Statement
{
	static int count=10023; // in real time, fetch it form the DB - sequence 
	
	
	int transactionNumber;
	LocalDateTime  transactionDateTime;
	String transactionType;
	float transactionAmount;
	
	public Statement(LocalDateTime transactionDateTime, String transactionType,
			float transactionAmount) {
		super();
		transactionNumber= ++count;
		this.transactionDateTime = transactionDateTime;
		this.transactionType = transactionType;
		this.transactionAmount = transactionAmount;
	}
	@Override
	public String toString() {
		return "Statement [transactionNumber=" + transactionNumber + ", transactionDateTime=" + transactionDateTime
				+ ", transactionType=" + transactionType + ", transactionAmount=" + transactionAmount + "]";
	}
	public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public LocalDateTime getTransactionDateTime() {
		return transactionDateTime;
	}
	public void setTransactionDateTime(LocalDateTime transactionDateTime) {
		this.transactionDateTime = transactionDateTime;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public float getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(float transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	
	
}

class BankAccount	{
	
	int acno;
	float balance;
	ArrayList<Statement> bankStatement =new ArrayList<Statement>();
	
	BankAccount(int acno, float b) {
		this.acno = acno;
		balance = b;
	}
	void withdraw(float amt) {
		System.out.println(acno+" BankAccount: withdraw: "+amt);
		balance = balance - amt;
	}
	void deposit(float amt) {
		System.out.println(acno+" BankAccount: deposit: "+amt);
		balance = balance + amt;
	}
	public void printMiniStatement() {
		System.out.println("==== MINI STATEMENT ==== of " );
		for (Statement statement : bankStatement) {
			System.out.println("st : "+statement);	
		}
		System.out.println("==== END OF THE STATEMENT ====");
		
	}

	void showBalance() {
		System.out.println(acno+" Balance : "+balance);
	}
	float getBalance() {
		return balance;
	}
}
class AccountRepository	{ // Repo means collection of something - CRUD service 
	
	ArrayList<BankAccount>  bankAccountsList  = new ArrayList<BankAccount>();
	
	BankAccount baObj1 = new BankAccount(101,90000);
	BankAccount baObj2 = new BankAccount(102,10000);
	BankAccount baObj3 = new BankAccount(103,50000);
	BankAccount baObj4 = new BankAccount(104,60000);
	BankAccount baObj5 = new BankAccount(105,80000);
	
	AccountRepository() {
		System.out.println("AccountRepository()...ctor...");
		bankAccountsList.add(baObj1);
		bankAccountsList.add(baObj2);
		bankAccountsList.add(baObj3);
		bankAccountsList.add(baObj4);
		bankAccountsList.add(baObj5);
	}
	void withdraw(int acno, float amt) {
		for (BankAccount bankAccount : bankAccountsList) {
			if(bankAccount.acno == acno) {
					bankAccount.withdraw(amt);
					Statement statement = new Statement(LocalDateTime.now(), "Debit", amt);
					bankAccount.bankStatement.add(statement);
					break;
			}
		}
	}
	void deposit(int acno, float amt) {
		for (BankAccount bankAccount : bankAccountsList) {
			if(bankAccount.acno == acno) {
					bankAccount.deposit(amt);
					Statement statement = new Statement(LocalDateTime.now(), "Credit", amt);
					bankAccount.bankStatement.add(statement);
					break;
			}
		}
	}
	float getBalance(int acno) {
		BankAccount temp=null;
		
		for (BankAccount bankAccount : bankAccountsList) {
			if(bankAccount.acno == acno) {
					temp = bankAccount;
					break;
					
			}
		}
		return temp.getBalance();
	}
	
	ArrayList<Statement> getStatement(int acno) {
		System.out.println("AccountRepository : getStatement");
		BankAccount temp=null;
		for (BankAccount bankAccount : bankAccountsList) {
			if(bankAccount.acno == acno) {
					temp = bankAccount;
					break;
			}
		}
		return temp.bankStatement;
	}
	
}
class InsufficientBalanceException extends RuntimeException 
{
	InsufficientBalanceException(String str) {
		super(str);
	}
}
class IncomeProofException extends RuntimeException 
{
	IncomeProofException(String str) {
		super(str);
	}
}


class AccountService
{
	AccountRepository accRepo;
	
	AccountService(AccountRepository ref) {
		System.out.println("AccountService(AccountRepository)...ctor...");
		accRepo = ref;
	}
	void withdrawService(int acno, float amt) {
		if(accRepo.getBalance(acno) > amt)
			accRepo.withdraw(acno,amt);
		else
			throw new InsufficientBalanceException("Balance is not sufficient to withdraw : "+amt); 
	}
	void depositService(int acno, float amt) {
		if(amt < 50000)
			accRepo.deposit(acno, amt);
		else
			throw new IncomeProofException("Please provide pancard to deposit : "+amt); 
	}
	
	void fundTransferService(int sourceAcno, int targetAcno, float amountToTransfer)
	{
		accRepo.withdraw(sourceAcno, amountToTransfer);
		accRepo.deposit(targetAcno, amountToTransfer);
		
	}
	float getBalanceService(int acno) {
		return accRepo.getBalance(acno);
	}
	ArrayList<Statement> getMiniStatementService(int acno) {
		System.out.println("AccountService : getMiniStatementService");
		return accRepo.getStatement(acno);
	}
}

class AccountController	{
	AccountService accService;
	
	AccountController(AccountService ref) {
		System.out.println("AccountController(AccountService)...ctor...");
		accService = ref;
	}
	void withdraw(int acno, float amt) {
		accService.withdrawService(acno, amt);
	}
	void deposit(int acno, float amt) {
		accService.depositService(acno, amt);
	}
	void transfer(int  ref1, int ref2, float amt) {
		accService.fundTransferService(ref1, ref2, amt);
	}
	
	float getBalance(int acno) {
		return accService.getBalanceService(acno);
	}
	ArrayList<Statement> getStatement(int acno) {
		System.out.println("AccountController: getStatement");
		return accService.getMiniStatementService(acno);
	}
}
class AngularForm	{
	
	AccountController	accCtrl;
	
	AngularForm(AccountController ref) {
		System.out.println("AngularForm(AccountController)...ctor...");
		accCtrl = ref;
	}
	void withdraw(int acno, float amt) {
		accCtrl.withdraw(acno, amt);
	}
	void depsoit(int acno, float amt) {
		accCtrl.deposit(acno, amt);
	}
	void transfer(int acc1, int acc2, float amt) {
		accCtrl.transfer(acc1, acc2, amt);
	}
	float getBalanceEnquiry(int acno) {
		return accCtrl.getBalance(acno);
	}
	void  printMiniStatement(int acno) {
		ArrayList<Statement> bankStatement = accCtrl.getStatement(acno);
		System.out.println("STATEMENT OF ==> "+acno);
		for (Statement statement : bankStatement) {
			System.out.println("st : "+statement);	
		}
				
	}
}
