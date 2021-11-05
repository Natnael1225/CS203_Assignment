package assignmentold_4;

import java.util.ArrayList;
import java.util.List;

public class Contacts {
	
   private String fname;
	private List<PhoneNumber> phoneNumbers= new ArrayList<>();
	private List<EmailAddress> emailAddresses = new ArrayList<>();
	private List<Addresses> addresses = new ArrayList<>();
	private String additionalInfo;	
	
	
public Contacts(String fname, List<PhoneNumber> phoneNumbers, List<EmailAddress> emailAddresses,
			List<Addresses> addresses, String additionalInfo) {
		
		this.fname = fname;
		this.phoneNumbers = phoneNumbers;
		this.emailAddresses = emailAddresses;
		this.addresses = addresses;
		this.additionalInfo = additionalInfo;
	}

public Contacts(String fname) {
	this.fname= fname;;
}
public Contacts() {
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}


public List<PhoneNumber> getPhoneNumbers() {
	return phoneNumbers;
}

public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
	this.phoneNumbers = phoneNumbers;
}

public List<EmailAddress> getEmailAddresses() {
	return emailAddresses;
}

public void setEmailAddresses(List<EmailAddress> emailAddresses) {
	this.emailAddresses = emailAddresses;
}

public List<Addresses> getAddresses() {
	return addresses;
}

public void setAddresses(List<Addresses> addresses) {
	this.addresses = addresses;
}

public String getAdditionalInfo() {
	return additionalInfo;
}

public void setAdditionalInfo(String additionalInfo) {
	this.additionalInfo = additionalInfo;
}

@Override
public String toString() {
	return " FirstName: "+ fname ; //+" PhoneNumber: "+ phoneNumbers+" EmailAddress: "+ emailAddresses+ addresses; 
	
}
}
