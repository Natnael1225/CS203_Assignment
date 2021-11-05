package lab_3;

import java.util.ArrayList;
import java.util.List;

public class Contact {
	
	private String  firstName;
	private String  lastName;
	private List<PhoneNumber> phoneNumbers ;
	private List<EmailAddress> emailAddresses;
	private List<Address> addresses ;
	private String notes;
	
	
	public Contact() {

		this.firstName = "Lily";
		this.lastName = "Mehari";
		this.phoneNumbers = new ArrayList<PhoneNumber>();
		this.emailAddresses = new ArrayList<EmailAddress>();
		this.addresses = new ArrayList<Address>();
		this.notes = "No notes";
	}
	
	public Contact(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumbers = new ArrayList<PhoneNumber>();
		this.emailAddresses = new ArrayList<EmailAddress>();
		this.addresses = new ArrayList<Address>();
		this.notes = "No notes";
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

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "firstName:" + firstName + ", lastName:" + lastName + ", phoneNumbers: " + phoneNumbers
				+ ", emailAddresses:" + emailAddresses + ", addresses: " + addresses + ", notes:" + notes ;
	}	
}
