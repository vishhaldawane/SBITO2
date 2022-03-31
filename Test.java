
public class Test {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		BankAccount baObj = new BankAccount(9000);
		baObj.showBalance();
		
		AccountRepository accRepo = new AccountRepository(baObj);
		AccountService accService = new AccountService(accRepo);
		AccountController accControl = new AccountController(accService);
		
		AngularForm	angForm = new AngularForm(accControl);
		angForm.withdraw(5000);
		baObj.showBalance();
		
		
	}

}
class BankAccount	{
	float balance;
	BankAccount(float b) {
		balance = b;
	}
	void withdraw(float amt) {
		System.out.println("BankAccount(float): withdraw: "+amt);
		balance = balance - amt;
	}
	void showBalance() {
		System.out.println("Balance : "+balance);
	}
	float getBalance() {
		return balance;
	}
}
class AccountRepository	{
	BankAccount baObj;
	
	AccountRepository(BankAccount ref) {
		System.out.println("AccountRepository(BankAccount)...ctor...");
		baObj = ref;
	}
	void withdraw(float amt) {
		baObj.withdraw(amt);
	}
	float getBalance() {
		return baObj.getBalance();
	}
}
class InsufficientBalanceException extends RuntimeException 
{
	InsufficientBalanceException(String str) {
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
	void withdraw(float amt) {
		if(accRepo.getBalance() > amt)
			accRepo.withdraw(amt);
		else
			throw new InsufficientBalanceException("Balance is not sufficient to withdraw : "+amt); 
	}
}

class AccountController	{
	AccountService accService;
	
	AccountController(AccountService ref) {
		System.out.println("AccountController(AccountService)...ctor...");
		accService = ref;
	}
	void withdraw(float amt) {
		accService.withdraw(amt);
	}
}
class AngularForm	{
	
	AccountController	accCtrl;
	
	AngularForm(AccountController ref) {
		System.out.println("AngularForm(AccountController)...ctor...");
		accCtrl = ref;
	}
	void withdraw(float amt) {
		accCtrl.withdraw(amt);
	}
}
