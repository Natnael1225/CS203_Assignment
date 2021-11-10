package input_output;

import java.util.Scanner;

public class Program {
	
	
	static	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {

		System.out.println("Enter your name");
		String  name = input();
		System.out.println("Enter your age");
		int age = Integer.parseInt(input());
		System.out.println("Your anme is: "+ name +" , and your age is"+ age+"Years old.");
			
		
		
	}

	static String input() {
	String  in = input.nextLine();
	
		return in;
	}
}
