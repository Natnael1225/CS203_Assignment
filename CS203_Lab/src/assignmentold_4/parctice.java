package assignmentold_4;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.util.Scanner;

public class parctice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Year.now().getValue());// to check the year
		System.out.println(MonthDay.now().getMonthValue()); // to check the month
		
		Scanner sc=new Scanner(System.in); 
	    System.out.println("Enter the year of birth"); 
	    int ybirth=sc.nextInt(); 
	    System.out.println("Enter the month of birth"); 
	    int mbirth=sc.nextInt(); 
	 
	    LocalDate date= LocalDate.now(); 
	 
	    int month=date.getMonthValue(); 
	    int year= date.getYear(); 
	    System.out.println(month);
	   // String newDate=date.format(DateTimeFormatter.ofPattern("MMMM dd,yyyy")); 
	   double age = year-ybirth+((double)(month-mbirth)/12); 
	   age=Math.round((age)*10.0)/10.0; 
	    System.out.println("Your are "+age+" years"); 
	} 
	
	
	}


