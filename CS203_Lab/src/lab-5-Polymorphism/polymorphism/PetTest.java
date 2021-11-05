package polymorphism;

import java.util.ArrayList;

public class PetTest {
	public static void main(String[] args) {
		
	
	Pet p1 = new Pet("cat", 'c');
	Pet p2 = new Pet("dog", 'd');
	Pet p3 = new Pet("sheep", 's');
	Pet p4 = new Pet("goat", 'g');
	Pet p5 = new Pet("camel", 'c');
	Pet p6 = new Pet("lion", 'l');
	
	ArrayList <Pet> pets = new ArrayList<>();
	
	 pets.add(p1);
	 pets.add(p2); 
	 pets.add(p3); 
	 pets.add(p4); 
	 pets.add(p5); 
	 pets.add(p6); 
	 
	 for(Pet pet : pets) {
		 System.out.println(pet);
	 }
	
}
}
