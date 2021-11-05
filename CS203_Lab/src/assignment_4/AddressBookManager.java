package assignment_4;

import java.util.ArrayList;
import java.util.List;

import assignmentold_4.Contacts;

public class AddressBookManager {

	List<Contacts > personalContacts;
	 
	
	List<Contacts > businessContacts;


 public AddressBookManager() {
	 
		personalContacts = new ArrayList<Contacts>();
	    businessContacts = new ArrayList<Contacts>();
	}
public List<Contacts > getPersonalContacts(){
	return  personalContacts;
 }
 
public List<Contacts> getBusinessContacts() {
	return businessContacts;
}

 public void AddPersonalContact(Contacts person) {
	 personalContacts.add(person) ;
 }
 public void AddBusinessContacts(Contacts bussiness) {
	 businessContacts.add(bussiness) ;
 }
 public void deletePersonalContact(Contacts person) {
	 personalContacts.remove(person);
 }
public void deleteBusinessContact(Contacts bussiness) {
	businessContacts.remove(bussiness);
	}
//---------------------------------	 
 }




