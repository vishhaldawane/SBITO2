package strategy2;

import org.junit.jupiter.api.Test;

import dao.BaseDAO;
import dao.BaseDAOImpl;

public class StragetyTwoTest {

	BaseDAO baseDao = new BaseDAOImpl();
	
	
	@Test
	public void testAddBankAccountDetails()	{
		BankAccount baObj = new BankAccount();
		baObj.setOwner("Jack");
		baObj.setAccountNumber("123123123123");;
		baObj.setBankName("ICICI");
		baObj.setIfscCode("ICICI123");
		baseDao.persist(baObj);
	}
	
	@Test
	public void testAddCreditCardDetails()	{
		CreditCard ccObj = new CreditCard();
		ccObj.setOwner("Jane");
		ccObj.setAccountNumber("623623623623");;
		ccObj.setCardType("Coral Card");
		ccObj.setExpiryMonth("Jan");
		ccObj.setExpiryYear("2024");
		baseDao.persist(ccObj);
	}
}
