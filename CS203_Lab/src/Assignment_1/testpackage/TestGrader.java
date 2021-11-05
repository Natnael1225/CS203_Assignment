package testpackage;

import myutil.GradingProgram;

public class TestGrader {
	
	public static void main(String[] args) {
		
		
		GradingProgram student1= new GradingProgram(9,9,9,95,95);
		
		double s= student1.calculateOverallGrade();
		System.out.println("Your overll result is: "+s);
		String result =	student1.printGradeReport();
		System.out.println(result);
	}

}
