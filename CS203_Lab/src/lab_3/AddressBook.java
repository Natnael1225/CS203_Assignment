package lab_3;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
   List<Contact > personalContacts;
	 	
   List<Contact> businessContacts;


	public AddressBook() {
		personalContacts = new ArrayList<Contact>();
	    businessContacts = new ArrayList<Contact>();
	}


	public List<Contact> getPersonalContacts() {
		return personalContacts;
	}
	
	public List<Contact> getBusinessContacts() {
		return businessContacts;
	}

	public void AddPersonalContact(Contact person) {
		 personalContacts.add(person) ;
		 
	 }
	 public void AddBusinessContacts(Contact bussiness) {
		 businessContacts.add(bussiness) ;
		 
	 }
	 public void deletePersonalContact(Contact person) {
		 personalContacts.remove(person);
		 
	 }
	public void deleteBusinessContact(Contact bussiness) {
		businessContacts.remove(bussiness);
		}


	@Override
	public String toString() {
		return "PersonalContacts=" + personalContacts + ", businessContacts=" + businessContacts + "]";
	}
	

	
}
