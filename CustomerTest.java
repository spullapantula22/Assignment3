
public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer[] cust = new Customer[3];
		
		Address[] add = new Address[3];
		
		add[0] = new Address("11 Imaginary St", "Chicago", "IL", "60007");
		add[1] = new Address("103 Non-Existent Blvd", "Iowa City", "IA", "52242");
		add[2] = new Address("371 Fakery Dr", "Madison", "WI", "53558");
		
		cust[0] = new Customer("John", "Peterson", "123-45-0000");
		cust[0].setBillingAddress(add[0]);
		
		cust[1] = new Customer("Laura", "Kelly", "987-65-4321");
		cust[1].setBillingAddress(add[1]);
		
		cust[2] = new Customer("Jeniffer", "Park", "111-11-1111");
		cust[2].setBillingAddress(add[2]);
	
		for(int i = 0; i < cust.length; i++) {
			
			Address city = cust[i].getBillingAddress();
			
			if(city.getCity() == "Chicago") {
				
				System.out.println(cust[i].toString());
			}
		}

	}

}
