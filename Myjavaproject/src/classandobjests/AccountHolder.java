package classandobjests;

public class AccountHolder {
	String firstName;/// first given the varible
	String lastName;
	int age;
	float accountBalance;
	boolean eligibleForCreditCard;
	
	
	public void testEligibilityForCreditCard() { //creat a method/function to check eligibility
		if(age>25 && accountBalance>=20000) {
			eligibleForCreditCard=true;
			
		}
			
	}
	
}
