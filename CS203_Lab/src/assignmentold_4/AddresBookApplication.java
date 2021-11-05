package assignmentold_4;

import java.util.ArrayList;
import java.util.List;

public class AddresBookApplication {

	public static void main(String[] args) {
		
		PhoneNumber p1= new PhoneNumber("645-235-7896","Mobile");
		PhoneNumber p2=new PhoneNumber("644-235-7896","Home");
		  List<PhoneNumber> phone= new ArrayList<>();
		  phone.add(p1);
		  phone.add(p2);
		  
		EmailAddress email1 = new EmailAddress("Gmail","Lily@gmail.com");
		EmailAddress email2 = new EmailAddress("yahooMail","Ltsegi@Yahoo.com");
		 List<EmailAddress> email= new ArrayList<>();
		 email.add(email1);     email.add(email2);
		
		Addresses address1 = new Addresses("3812 Winfield","Charlotte","NC",28236);
		Addresses address2 = new Addresses("3812 Winfield","Charlotte","NC",28236);
		 List<Addresses> address = new ArrayList<>();
		 address.add(address1);
		 address.add(address2);
		 
		
		Contacts contact1 = new  Contacts ("Lily",phone,email,address, " Comments");
		Contacts contact2 = new  Contacts ("Lily",phone,email,address, " Comments");
		 List<Contacts > bussines = new ArrayList<>();
		 bussines.add(contact1);
		 bussines.add(contact2);
		
		AddresBookApplicationManager manager = new AddresBookApplicationManager(bussines);
		
		Bussiness bussiness = new Bussiness("TeleMarket");
		Bussiness bussiness2 = new Bussiness("OnlineShopping");
		Bussiness bussiness3 = new Bussiness("Electronics");
		Bussiness bussiness4 = new Bussiness("StarBuks");
		Bussiness bussiness5 = new Bussiness("Beverages");
		Bussiness bussiness6 = new Bussiness("ShoeFactory");
		
         manager.addBussiness(bussiness);
         manager.addBussiness(bussiness2);
         manager.addBussiness(bussiness3);
         manager.addBussiness(bussiness4);
         manager.addBussiness(bussiness5);
         manager.addBussiness(bussiness6);
 		
 		 manager.BusinessSorted();
 		 
 		 System.out.println();
 		Person personx = new Person("Luwam","Tsegai");
 		Person persony = new Person("Luwam","Tsegai");
 		List<Person> add = new ArrayList<>();
 		
 		
 		 Person person1 = new Person("Luwam","Tsegai");
         Person person2 = new   Person("Mercy"," Haile");
         Person person3 = new   Person("Filli", "Mercy");
         Person person4 = new   Person("Arkan", "Asenna");
 		manager.addPerson(person1);
 		manager.addPerson(person2);
 		manager.addPerson(person3);
 		manager.addPerson(person4);
       
 		manager.personOny();
 		System.out.println();
	
		manager.editPersonName("Hanna", person1);
		System.out.print("After edit the person1 name is: ");
		manager.personOny();
		System.out.println();
		
		manager.removePerson(person2);
		
		manager.personOny();
		
		Bussiness bussiness7 = new Bussiness("Online Education");
        manager.removeBusiness(bussiness);
		
        
        
		//Person person1 = new Person("Luwam","Tsegai");
		

		
		
		

	}

}
