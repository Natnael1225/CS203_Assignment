package assignment_4;

import java.util.*;


public class AddressBookTester {
	

	public static void main(String[] args) {
		
		AddressBookManager address = new AddressBookManager();
		Contacts con1 = new Contacts("Lily", "Haile");
		
		PhoneNumber p2 = new PhoneNumber(0, 64586942);
		PhoneNumber p1 = new PhoneNumber();
		con1.getPhoneNumbers().add(p2);
		
           //System.out.println(con1);
		
		
		//con1.getPhoneNumbers().add(p1);
		//ArrayList<PhoneNumber> phone= new ArrayList<>();
				//phone.add(p1); phone.add(p2);
		//EmailAddress email1 = new EmailAddress(0, "Lily@gmail.com");
		
		//con1.getEmailAddresses().add(email1);
		
		
           

		

		EmailAddress email1 = new EmailAddress(0, "Lily@gmail.com");
		EmailAddress email2 = new EmailAddress(1, "Ltsegi@Yahoo.com");
		ArrayList<EmailAddress> email = new ArrayList<>();
		// email.add(email1); email.add(email2);

		Address address1 = new Address(1, "3812 Winfield", "Charlotte", "NC", 28236);
		Address address2 = new Address(0, "3812 Winfield", "Charlotte", "NC", 28236);
		List<Address> addres = new ArrayList<>();
//	 address.add(address1);
//	 address.add(address2);
//	
	 //ArrayList<AddressBookManager> addressBook = new ArrayList<>();
	 
	 
	 
	 
	 
	 
	
	
	
	}	
}
