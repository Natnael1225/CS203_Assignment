package assignment_2;

import myutil.MealCard;
import myutil.Student;

public class MealCardTest {

	public static void main(String[] args) {
		// TO  test the meal card class
		
		Student std1 = new Student("Lily", "Tsegai", 125, "1000 N 4th");
		MealCard card = new MealCard(10, std1);

		Student std2 = new Student("mercy", "Haile", 120, "1000 S 4th");
		MealCard card2 = new MealCard(20, std2);

		System.out.println(card.addPoint(60));
		System.out.println(card.purchaseFood(20));
		System.out.println(card.getStudent().getFname() +" "+card.getStudent().getLname());

	System.out.println(card2.addPoint(20));//add points 
	System.out.println(card2.purchaseFood(10));//subtract point
	System.out.println(card2.getBalance());// current balance

	System.out.println(card2.getStudent().getFname() +" "+card2.getStudent().getLname());
	}

}
