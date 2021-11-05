package Temporary;

public class Fraction3 {
	
	double num1;
	double num2;
	double ans;

	
	public Fraction3(double num1, double num2) {
	this.num1 = num1;
	this.num2 = num2;
	ans = this.num1/this.num2;
	}

	
	public static void main(String[] args) {
		Fraction3 fraction = new Fraction3( 10, 15 );
		Fraction3 fraction2 = new Fraction3(10,15);
		
		int  result =compare(fraction, fraction2);
		System.out.println(result);
		  
	}
 public	static int compare(Fraction3 f1, Fraction3 f2) {
		if(f1.ans == f2.ans)  return 0;
		
		else
			if(f1.ans < f2.ans) return -1;
		
			else return 1;
	}
	}

	