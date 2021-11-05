package assignmentold_4;

import java.util.List;

public class Person extends Contacts {
	
	private String lname;
	
	public Person(String fname, List<PhoneNumber> phoneNumbers, List<EmailAddress> emailAddresses,
			List<Addresses> addresses, String additionalInfo ) {
		super(fname,phoneNumbers,emailAddresses,addresses,additionalInfo);
		  
	}

	public Person(String fname,String lname) {
		super(fname);
		this.lname = lname;
	}

	@Override
	public String toString() {
		return " LastName: "+ lname +super.toString() ;
	}
}
