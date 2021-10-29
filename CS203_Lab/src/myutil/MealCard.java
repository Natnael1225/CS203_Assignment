package myutil;

public class MealCard {

	private double balance;
	private Student student;

	
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

	public boolean purchaseFood(int point) {
		if (point > balance)
			return false; // Meaning less balance
		balance -= point;
		return true;
	}

	public double addPoint(int point) {

		return balance += point;
	}

}
	


