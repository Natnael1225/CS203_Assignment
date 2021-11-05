package myutil;


public class MealCard {

	private int points;
	
	
	public MealCard() {
		this.points =100;
	}


	public MealCard(int points) {
		this.points = points;
		
	}
	public int getPoints() {
		return points;
	}

	public void makePurchase( int itemPrice) {
	if(itemPrice < 0) {
		System.out.println("Your itemPrice, should't negative number");	
	}
	else if(this.points < itemPrice) {	
		System.out.println("You are not allowed to purchase food,Please buy points"); // Meaning less balance
	}else {
		points -= itemPrice;
	}
	}
	public int buyPoint(int amount) {

		return this.points +=amount;
	}

}
	


