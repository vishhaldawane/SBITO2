package strategy1;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="billingdetails1")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="billing_type")
public abstract class BillingDetails {

	@Id
	@GeneratedValue
	private int id;
	private String owner;
	private String accountNumber;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String number) {
		this.accountNumber = number;
	}
	
	
	
}
