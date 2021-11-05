package assignment_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {
	

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		 Random rand = new Random();
	List<String>fortunes = new ArrayList<>();
	fortunes.add("Happiness is programming");
	fortunes.add(" Patience is virtue");
	fortunes.add( "Satisfaction follows hard work");
	fortunes.add("Do more practice for better Programmer");
	fortunes.add("Luck is believing you're Lucky");
	fortunes.add("Fortune favours the prepared mind");
	fortunes.add(" Oh, I am fortunes fool!");
	fortunes.add("You will get 4.0 GPA this semester");
	fortunes.add("You will Gradute from MIU");
	fortunes.add("You are happy always");
	fortunes.add("Graet Day! error free codes");
	
		int  luck = rand.nextInt(12);
		System.out.println("Your Fortune is: "+ fortunes.get(luck));
	 System.out.println("Good By, You have a nice Day");
	}
	

}
