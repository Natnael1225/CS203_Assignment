package assignment_2;

public class Fraction {
	
	double num;

	
	public Fraction(double num) {
	this.num = num;

	
	}

	public static void main(String[] args) {
		Fraction f1 = new Fraction( 5.4);
		Fraction f2 = new Fraction(4.5);
		
		 
	}
 public	static int compare(Fraction f1, Fraction f2) {
		if(f1.num == f2.num)  return 0;
		
		else
			if(f1.num < f1.num) return -1;
			else return 1;
	}
	}

	