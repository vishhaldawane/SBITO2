
public class InterfaceAwareness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SavingsAccount sav = new SavingsAccount();
			/*
			 * 									petty cash
			 * 									a  b   c   d
			 * -------------------------->100
			 * |								abc()	pqr() xyz()
			 * 100
			 * x <--Cash
			 * 
			 * 
			 * 100
			 *  y <--Cash, PettyCash
			 */
			Cash cash = new PettyCash();
						
			Denomination deno = new Currency();
			Balance bal = sav.withdraw(cash, deno);
			
	}

}

interface Balance { }
interface Magician { }
interface Magic { }
interface MagicStick { }
//Magician doMagic(Magic m, MagicStick ms);

interface Cash {
	
	
}
interface Denomination { 
	
	
		
} 
interface Account
{
	Balance withdraw(Cash c, Denomination d);
	Magic deposit(Cash c, Denomination d);
	Snooze omg(Food f, Java l);
}

class BankBalance implements Balance
{
	
}

class PettyCash implements Cash
{
	
}
class LockerCash implements Cash
{
	
}
class Currency implements Denomination
{
	
}

class SavingsAccount implements Account
{
	public Balance withdraw(Cash c, Denomination d)
	{
		Balance bal = new BankBalance();
		return bal;
	}
}