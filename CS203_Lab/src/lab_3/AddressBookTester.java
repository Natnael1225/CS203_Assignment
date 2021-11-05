package lab_3;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTester {

	public static void main(String[] args) {
		
		
		AddressBook adressbook = new AddressBook();

		Contact contact1 = new Contact("Lily", "Fish");
		PhoneNumber p1 = new PhoneNumber(0, 64523102);
		EmailAddress email1 = new EmailAddress(0, "Lily@gmail.com");
		Address address1 = new Address(0, "3812 Winfield", "Charlotte", "NC", 28236);
		contact1.getPhoneNumbers().add(p1);
		contact1.getEmailAddresses().add(email1);
		contact1.getAddresses().add(address1);

		Contact contact2 = new Contact("Mehari", "Haile");

		PhoneNumber p2 = new PhoneNumber(0, 70452368);
		EmailAddress email12 = new EmailAddress(0, "Hana@gmail.com");
		Address address2 = new Address(0, "1000 4 th", "Fairfield", "Iowa", 52556);
		contact2.getPhoneNumbers().add(p2);
		contact2.getEmailAddresses().add(email12);
		contact2.getAddresses().add(address2);

		List<Contact> personal = new ArrayList<>();
		personal.add(contact1);
		personal.add(contact2);
//		for (Contact result : personal) {
//			System.out.println(result);
//		}
		adressbook.AddPersonalContact(contact1);
		adressbook.AddPersonalContact(contact2);
		System.out.println(adressbook.getPersonalContacts());
		adressbook.deletePersonalContact(contact1);
		System.out.println(adressbook.getPersonalContacts());
		System.out.println(adressbook.getPersonalContacts());

		// adressbook.deleteBusinessContact(contact2);
		// System.out.println(adressbook);
		System.out.println("--------For Bussiness-------------------------");

		Contact contact3 = new Contact("Liam", null);
		PhoneNumber p3 = new PhoneNumber(1, 64523102);
		EmailAddress email3 = new EmailAddress(1, "Liam@gmail.com");
		Address address3 = new Address(1, "3812 Winfield", "Charlotte", "NC", 28236);
		contact3.getPhoneNumbers().add(p3);
		contact3.getEmailAddresses().add(email3);
		contact3.getAddresses().add(address3);

		Contact contact4 = new Contact("Hana", null);

		PhoneNumber p4 = new PhoneNumber(1, 70452368);
		EmailAddress email14 = new EmailAddress(1, "Hana@gmail.com");
		Address address4 = new Address(1, "1000 4 th", "Fairfield", "Iowa", 52556);
		contact2.getPhoneNumbers().add(p4);
		contact2.getEmailAddresses().add(email14);
		contact2.getAddresses().add(address4);

		adressbook.AddBusinessContacts(contact3);
		adressbook.AddBusinessContacts(contact4);
		System.out.println(adressbook.getBusinessContacts());
		adressbook.deleteBusinessContact(contact3);
		System.out.println(adressbook.getBusinessContacts());

	}

}
