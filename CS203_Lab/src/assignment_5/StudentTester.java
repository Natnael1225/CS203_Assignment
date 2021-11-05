package assignment_5;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTester {

	public static void main(String[] args) {
		
		
		Student std1 = new Student("Tsegai",4526);
		Student std2 = new Student("Mercy",2366);
		Student std3 = new Student("Arkan",89626);
		Student std4 = new Student("Fili",49202);
		Student std5 = new Student("Abel",1356);
		Student std6 = new Student("John",9526);
		
		
		ArrayList<Student> students = new ArrayList<>();
		
		students.add(std1);
		students.add(std2);
		students.add(std3);
		students.add(std4);
		students.add(std5);
		students.add(std6);
		
		Collections.sort(students);
	for(Student answer: students) {
		System.out.println("After Sorting by "+answer);
	}
	//System.out.println("After Sorting by LastName:"+students);	
		
		

	}

}
