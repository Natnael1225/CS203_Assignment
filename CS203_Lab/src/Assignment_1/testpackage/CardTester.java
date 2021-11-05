package testpackage;

import myutil.MealCard;

public class CardTester {

	public static void main(String[] args) {
		// TO  test the meal card class
		
		
		MealCard card = new MealCard(10);

		MealCard card2 = new MealCard(50);

		System.out.println("Your current balance is: $"+card.getPoints());
		System.out.println("Your buying point is: $"+card.buyPoint(10));
		card.makePurchase(-7);
		System.out.println("After buying points your balance is: $"+card.getPoints());
		
	
	System.out.println("Your current balance is: $"+card2.getPoints());	
	System.out.println("After buying points your balance is: $"+card2.buyPoint(20));//add points 
	card2.makePurchase(85);//subtract point
	System.out.println("Your balance is: $"+card2.getPoints());// current balance

	}

}
