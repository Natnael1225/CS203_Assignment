package testpackage;

import myutil.CalAge;

public class AgeTest {

	public static void main(String[] args) {
		
		CalAge cal = new CalAge(2021, 1994);
		
		System.out.println("Your age is: " +  cal.getAge());
	}

}
