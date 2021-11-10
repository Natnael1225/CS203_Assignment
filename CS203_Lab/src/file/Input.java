package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Input {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\lwamt\\Desktop\\Github\\CS203_Assignment\\CS203_Lab\\src\\file/girlnames.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			System.out.println(scan);
		}
		System.out.println("Enter popular girls name");
		String  girls = input();
		System.out.println("Enter popular boys name");
		String  boys = input();
		//System.out.println("Your name is: "+ name +" , and your age is"+ age+"Years old.");
		
		String []  	names= {girls, boys};
		
		for(String s : names) {
			System.out.println(s);
		}
		
	}

	static String input() {
		String  in = input.nextLine();
		
			return in;
		} 
}
