package Temporary;

import myutil.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TO test the person calss

		Person p = new Person();
		
		System.out.println( p.getName());
		
		p.setName("Lily");
		System.out.println( p.getName());
	}

}
