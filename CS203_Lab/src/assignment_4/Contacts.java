package assignment_4;

import java.util.*;


public class Contacts {
	
private String  firstName;
private String  lastName;
private List<PhoneNumber> phoneNumbers =new ArrayList<>();
private List<EmailAddress> emailAddresses;
private List<Address> addresses ;
private String notes;



public Contacts(){
	this.firstName = "Lily";
	this.lastName = " Haile";
	phoneNumbers = new ArrayList<PhoneNumber>(); //  this gives us create arrayList with size 0 lists
	emailAddresses = new ArrayList<>();
	addresses = new ArrayList<>();
	notes = " no notes";
}
public Contacts(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
	phoneNumbers = new ArrayList<>();
	emailAddresses =new ArrayList<>();
	addresses = new ArrayList<>();
	notes = "no notes";
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
