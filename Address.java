
public class Address {
	
	private String street;
	private String city;
	private String zip;
	private String state;
	
	public Address(String st, String ct, String stt, String zip) {
		
		this.street = st;
		this.city = ct;
		this.zip = zip;
		this.state = stt;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public String toString() {
		return street + ", " + city + ", "+ state + ", " + zip;
	}
	
	

}
