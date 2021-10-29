package assignment_3;

import java.util.Random;

public class DailyTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randi = new Random();
		
        int [] temperature = new int[365];
        
        for(int i=0;i< temperature.length; i++) {
        	temperature[i] = randi.nextInt(70) +5;
        	System.out.println(temperature[i] + "\t");
        }
//        
        int coldest =  temperature[0];//Integer.MAX_VALUE;
        int hottest = temperature[0];//Integer.MIN_VALUE;
        for(int i=0;i< temperature.length; i++) {
        	if(temperature[i] < coldest)
        	 coldest = temperature[i];
        	else if(temperature[i] > hottest)
        		hottest = temperature[i];
        }
        
        System.out.println("The coldest days of the year: " + coldest);
        System.out.println("The hottest days of the year: " + hottest);
	}

}
