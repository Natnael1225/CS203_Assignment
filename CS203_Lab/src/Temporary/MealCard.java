package Temporary;

public class MealCard {

	private double balance;
	private int points;
	private Student student;

	public MealCard() {
		this.points =100;
	}
	private static int INITIAL_BALANCE =100;
	
	public MealCard(Student student) {
	this(INITIAL_BALANCE, student);	
	}
	public MealCard(double point, Student student) {
		this.balance = point;
		this.student = student;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

//	public boolean purchaseFoodCheck(int point) {
//		if (point > balance)
//			return false; // Meaning less balance
//		balance -= point;
//		return true;
//	}
	public void makePurchase( int itemPrice) {
	if(this.points >0) {
	if(this.points > itemPrice)	
		points -= itemPrice;
	else
		System.out.println("You are not allowed to purchase food, add more points"); // Meaning less balance
	}else {
		System.out.println("Points assigned to each food item are a whole number, Please enter valid one");
			
	}
	}
	public void purchaseFood(int PurchasePoint) {
		if(PurchasePoint >0) {
		if (PurchasePoint > balance) 
			System.out.println("You are not allowed to purchase food, add more points"); // Meaning less balance
		balance -= PurchasePoint;
	}else
		System.out.println("Points assigned to each food item are a whole number, Please enter valid one");
		
	}

	public double addPoint(int amount) {

		return this.points +=amount;
	}

}
	


