package myutil;

import java.util.Scanner;

public class CalAgeTest {

	public static void main(String[] args) {
		// TO  the age class
		
		CalAge cal = new CalAge();
		Scanner input = new Scanner(System.in) ;
			
	System.out.println("Please enter your age in years");
	int year = input.nextInt();
	System.out.println("Please enter your age in month");
	int month = input.nextInt();
	//System.out.println("Please enter your age in years");
	//int year = input.nextInt();
	
         double result= cal.yearMonth(year, month);
         System.out.println( "Your age in years and month is: "+result);
	}

}
