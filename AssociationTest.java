import java.time.LocalDate;

public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BankAccount ba = new BankAccount();
		SavingsAccount saObj = new SavingsAccount(      101, "Shashi Bamne", 90000.0f, LocalDate.of(2019, 1, 10), LocalDate.of(2000, 6, 10),3.5f);
		
		FixedDepositAccount fdObj = new FixedDepositAccount(101, "Shashi Bamne", 90000.0f, LocalDate.of(2019, 1, 10), LocalDate.of(2000, 6, 10),3.5f, LocalDate.of(2025, 1, 10),120000.f);
		
		saObj.printSavingsAccount();
		
		System.out.println("---------------");
		
		fdObj.printFixedDepositAccount();
		
		
		
	}

}
