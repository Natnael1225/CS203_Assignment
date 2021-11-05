package Temporary;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FortuneUpdated {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		 Random rand = new Random();
	List<String>fortuneList = new ArrayList<>();
	fortuneList.add("Happiness is programming");
	fortuneList.add(" Patience is virtue");
	fortuneList.add( "Satisfaction follows hard work");
	fortuneList.add("Do more practice for better Programmer");
	fortuneList.add("Luck is believing you're Lucky");
	fortuneList.add("Fortune favours the prepared mind");
	fortuneList.add(" Oh, I am fortunes fool!");
	fortuneList.add("You will get 4.0 GPA this semester");
	fortuneList.add("You will Gradute from MIU");
	fortuneList.add("You are happy always");
	fortuneList.add("Graet Day! error free codes");
	
	System.out.println("Would you like to see you fortune, enter Y/N");
	 char choice = input.next().charAt(0);
	 while(choice =='Y' || choice =='y') {
		
		int  luck = rand.nextInt(12);
		System.out.println("Your Fortune is: "+ fortuneList.get(luck));
		
		System.out.println("Would you like to continue, Enter Y/N");
		  choice = input.next().charAt(0);
	 }
	
	 System.out.println("Good By, You have a nice Day");
	}
	

}
