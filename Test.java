
public class Test {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		BankAccount baObj = new BankAccount(90000);
		AccountRepository accRepo = new AccountRepository(baObj);
		AccountController accControl = new AccountController(accRepo);
		AngularForm	angForm = new AngularForm(accControl);
		angForm.withdraw(50000);
		
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
}
class AccountController	{
	AccountRepository accRepo;
	
	AccountController(AccountRepository	 ref) {
		System.out.println("AccountController(AccountRepository)...ctor...");
		accRepo = ref;
	}
	void withdraw(float amt) {
		accRepo.withdraw(amt);
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
