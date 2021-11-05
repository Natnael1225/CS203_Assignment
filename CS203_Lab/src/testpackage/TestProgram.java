package testpackage;

import myutil.Person;

public class TestProgram {
	
	public static void main(String[] args) {
		
		
       Person p = new Person();
		
		System.out.println( p.getName());
		
		p.setName("Lily");
		System.out.println( p.getName());
	}

}
