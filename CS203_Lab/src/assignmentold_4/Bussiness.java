package assignmentold_4;

import java.util.List;

public class Bussiness extends Contacts {
	
	
	public  Bussiness(String fname, List<PhoneNumber> phoneNumbers, List<EmailAddress> emailAddresses,
			List<Addresses> addresses, String additionalInfo, String lname) {
		super(fname,phoneNumbers,emailAddresses,addresses,additionalInfo);
	}
	
	public  Bussiness(String fname) {
		super(fname);
	}
	
	@Override
	public String toString() {
		return super.toString() ;
	}

}
