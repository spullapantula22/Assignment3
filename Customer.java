
public class Customer {
	
	private String firstName;
	private String lastName;
	private String socNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String fname, String lname, String snum) {
		
		this.firstName = fname;
		this.lastName = lname;
		this.socNum = snum;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocNum() {
		return socNum;
	}

	public void setSocNum(String socNum) {
		this.socNum = socNum;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	
	public String toString() {
	    return "[" + firstName + ", " + lastName + ", " + "ssn: " + socNum
	    + ", " + this.billingAddress + "]";
	}
	
	

}
