package banking;

import java.util.Scanner;
/**
 * Represents a bank for managing customers and their bank accounts.
 * @author hokki
 *
 */
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creates new instance of Bank class
		Bank bank = new Bank();
		
		//calls the run method in the bank class
		bank.run();
	}
	/**
	 * Runs the programme by intializing and managing, bank accounts and customers
	 */
	public void run() {
		System.out.println("Welcome to the Bank! What is your name?");
		
		//create scanner to get user input
		Scanner scanner = new Scanner(System.in);
		
		//bet the next token (word)
		String name = scanner.next();
		
		System.out.println("Hello " + name +"! We are creating checking for you.");
		
		Customer customer = new Customer(name);
		
		System.out.println("What is your address?");
		
		String address = scanner.next();
		
		customer.setAddress(address);
		
		BankAccount checkingAccount = new BankAccount("checking", customer);
		
		BankAccount savingsAccount = new BankAccount("savings", customer);
		System.out.println();
		System.out.println("Customer info: ");
		System.out.println(checkingAccount.getCustomerInfo());
		
		//get and print account info for checking account
		System.out.println("Checking account: ");
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println("Savings account: ");
		System.out.println(savingsAccount.getAccountInfo());
		
		//deposits
		//into checking
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking account?");
		double amount = scanner.nextDouble();//get next token
		checkingAccount.deposit(amount);//deposit into checking account
		
		System.out.println();
		System.out.println("Amount (decimal) to deposit into your checking account?");
		amount = scanner.nextDouble();//get next token
		savingsAccount.deposit(amount);
		
		System.out.println();
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		
		//withdraws
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your checking account?");
		amount = scanner.nextDouble();//get next token
		try {
			checkingAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println();
		System.out.println("Amount (decimal) to withdraw from your savings account?");
		amount = scanner.nextDouble();//get next token
		try {
			savingsAccount.withdraw(amount);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(checkingAccount.getAccountInfo());
		System.out.println(savingsAccount.getAccountInfo());
		scanner.close();
	}
}
