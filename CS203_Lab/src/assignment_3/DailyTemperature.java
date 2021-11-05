package assignment_3;

import java.util.Random;
import java.util.Scanner;

public class DailyTemperature {
/**
 * Finding hottest and coldest  temperature  days of the year
 * reating with method and with random filling the 365 days with random number find min and max temperature.
 * @param args
 */
	public static int[] HotCold() {
		
		Scanner input = new Scanner(System.in);
		int [] temp = new int[3];
		
		 for(int i=0;i< temp.length; i++) {
			 System.out.println("Enter the temperature for the day: "+ (i+1));
			 temp[i] = input.nextInt();
		 }
		 int cold = temp[0];
		 int hot = temp[0];
		 
		 for(int i=0;i< temp.length; i++) {
			 if(temp[i] < cold) {
				 cold= temp[i];
			 }
			 else if(temp[i] > hot) {
				 hot =temp[i];
			 }
			
		 }
		 
	      return  new int[] { hot, cold};
//		 System.out.println("The coldest days of the year: " + cold);
//	     System.out.println("The hottest days of the year: " + hot);
	}
	public static void main(String[] args) {
		
		int [] vale = HotCold();
		 for(int a=0; a<vale.length; a++) {
			 System.out.println("The Temperature days of the year is : "+vale[a]);
		 }
		
		System.out.println("--------------------------------------------------------");
		Random randi = new Random();
		
//        int [] temperature = new int[365];
//        
//        for(int i=0;i< temperature.length; i++) {
//        	temperature[i] = randi.nextInt(70) +5;
//        	System.out.println(temperature[i] + "\t");
//        }
////        
//        int coldest =  temperature[0];//Integer.MAX_VALUE;
//        int hottest = temperature[0];//Integer.MIN_VALUE;
//        for(int i=0;i< temperature.length; i++) {
//        	if(temperature[i] < coldest)
//        	 coldest = temperature[i];
//        	else if(temperature[i] > hottest)
//        		hottest = temperature[i];
//        }
//        
//        System.out.println("The coldest days of the year: " + coldest);
//        System.out.println("The hottest days of the year: " + hottest);
	}

}
