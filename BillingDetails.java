package strategy2;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity(name="billingdetails2")
@Inheritance(strategy = InheritanceType.JOINED)
public class BillingDetails {

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
