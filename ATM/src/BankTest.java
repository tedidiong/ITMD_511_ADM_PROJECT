import java.util.Scanner;

//BankTest.java
//simulates an ATM machine for deposits, withdrawals and the
//checking of a bank balance

public class BankTest {

	public static void main(String[] args) {
		
		try (//set up program local variables
		Scanner sc = new Scanner(System.in)) {
			double balance=0;
			
			System.out.println("Please enter your initial balance");
			balance = sc.nextDouble();
			
			//set bank object
			Bank bankObj1 = new Bank(balance);

			//set interest rate
			Bank.annualInterestRate = .04;
			
			//get a deposit
			System.out.println("Please enter a deposit");
			balance = sc.nextDouble();
			
			bankObj1.deposit(balance);
			
			//get a deposit
			System.out.println("Please enter a withdraw");
			balance = sc.nextDouble();
			
			bankObj1.withdraw(balance);
			
			// apply monthly interest to balance
			// 1. create method for calculation in Bank.java file
			// 2. Call method below to tack on the monthly interest 
			// amount to the existing bank balance 
			 

			System.out.printf("\nCurrent Balance "
					        + "= $%.2f" , bankObj1.getBalance() );
		}
		System.out.println();  //new line

	}

}