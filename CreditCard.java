package strategy1;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity(name="creditcard1")
@DiscriminatorValue("CC")
public class CreditCard extends BillingDetails {
	
	String cardType;
	String expiryMonth;
	String expiryYear;
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	
	
	
	
}
