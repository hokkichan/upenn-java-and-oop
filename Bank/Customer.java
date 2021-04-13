package banking;

public class Customer {
	
	//instance vars
	
	String name;
	
	String address;
	
	/**
	 * create a customer with the given name
	 * @param name
	 */
	
	public Customer(String name) {
		this.name = name;
	
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}

}
