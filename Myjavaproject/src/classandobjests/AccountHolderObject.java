package classandobjests;

public class AccountHolderObject {

	public static void main(String[] args) {
		AccountHolder tom=new AccountHolder(); // second//object created for account holder
		AccountHolder  henry =new AccountHolder ();//object creat
		AccountHolder sara =new AccountHolder ();//object creat
		
		tom.firstName="Tom"; //third: provided the variable
		tom.lastName="Smith";
		tom.age=21;
		tom.accountBalance=10000;
		
		tom.testEligibilityForCreditCard(); // fifth: call method/function
		System.out.println("Is Tom eligible for Credit Card :" + tom.eligibleForCreditCard);
		
		
		henry.firstName="Henry";
		henry.lastName="Hill";
		henry.age=28;
		henry.accountBalance=20000;
		
		henry.testEligibilityForCreditCard();
		System.out.println("Is henry eligible for Credit Card :" + henry.eligibleForCreditCard);
		
		
		sara.firstName="Sara";
		sara.lastName="Hill";
		sara.age=22;
		sara.accountBalance=20000;
		
		sara.testEligibilityForCreditCard();
		System.out.println("Is henry eligible for Credit Card :" + sara.eligibleForCreditCard);
		
		
		
		
		
	}

}
