package Temporary;

public class Fraction2 {
	
	double fraction;

	public Fraction2(double fraction) {
		this.fraction = fraction;
	}
	
	public double getFraction() {
		return fraction;
	}

	public void setFraction(double fraction) {
		this.fraction = fraction;
	}

	public static void main(String[] args) {
		// TO compare method from Exerice 6
		Fraction2  fraction = new Fraction2 ( 22.4);
		int answer = fraction.compare(fraction);
		System.out.println(answer);
		
	}

public  int compare(Fraction2 frac) { 
	Fraction2  f1 = new Fraction2 ( 33.4);
	if(f1.getFraction() < frac.getFraction())  return -1;
	
	else
		if(f1.getFraction() > frac.getFraction()) return 1;
	
		else return 0;
}
}
