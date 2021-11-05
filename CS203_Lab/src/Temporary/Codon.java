package Temporary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Codon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a strand that only contains letters A,T,C,G for codons");
		 String dna = input.nextLine();
		 dna = dna.toUpperCase();
		 while(!dna.equals("")) {  
			
		List<String> codons = new ArrayList<>();
		
		for (int i = 2; i < dna.length(); i+=3) {
            codons.add(dna.substring(i - 2, i + 1));
        }
        for (String m : codons) {
            System.out.println(m);
        }
        System.out.println("Enter a strand  to continue, and press space to exit");
        dna = input.nextLine();
    }
		 System.out.println("Program Exist!, You have a great day!");
		 }
		 }	

	


