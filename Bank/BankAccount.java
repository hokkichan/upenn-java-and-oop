package banking;

/**
 * representing a checking/savings bank account for a customer
 * @author hokki
 *
 */
public class BankAccount {
	//Type of account
	String accountType;
	
	double balance;
	
	Customer customer;
	
	//constructor
	public BankAccount(String accountType, Customer customer) {
		this.accountType = accountType;
		this.customer = customer;
	}
	
	//methods
	public void deposit(double amount) {
	  this.balance += amount;	
	}
	
	public void withdraw(double amount) throws Exception {
		if (amount > this.balance) {
			throw new Exception("Amount is greater than available balance.");
		}
		this.balance -= amount;
	}
	
	public String getAccountInfo() {
		return this.accountType + ": " + this.balance;
	}
	
	public String getCustomerInfo() {
		return this.customer.getName() + " from " + this.customer.getAddress();
	}
}
