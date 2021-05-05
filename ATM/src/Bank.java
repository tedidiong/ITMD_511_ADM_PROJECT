//Bank.java

public class Bank {

	//class level data members
	double balance;
	static double annualInterestRate;
	
	/* class methods */
	
	//constructor method
	public Bank(double bal) {
		
		balance = bal;
	}
	//getters and setters

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	//other methods
	
	public void deposit(double bal) {
		
		balance += bal;   //ADD to existing BALANCE local variable
	}
	
	public void withdraw(double bal) {
		
		/* Check the existing balance!!!
		 * DO NOT allow the balance to go below $50
		 */
		balance -= bal;   //SUBTRACT from existing BALANCE local variable
	}
	
}