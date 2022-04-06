package strategy1;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="bankaccount1")
@DiscriminatorValue("BA")
public class BankAccount extends BillingDetails {

	private String bankName;
	private String ifscCode;
	
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	
	
	
	
	
}

/*class Test
{
	public static void main(String[] args) {
		Person p = new Person();
		p.setAge(20);
	}
}

// creation		vs		accesss

class Person
{
	private int age;
	
	void setAge(int a) {
		if(a < 0 ) {
			throw new RuntimeException("age cannot be in negative....");
		}
		else if(a > 120 ) {
			throw new RuntimeException("age cannot exceeed 120...");
		} 
		else
			age = a;
	}
}

class Student extends Person
{
	
	private int roll;
	
	void show() {
		age=1000;
		setAge(1000);
	}
}
*/