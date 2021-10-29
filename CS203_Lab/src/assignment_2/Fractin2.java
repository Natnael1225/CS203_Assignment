package assignment_2;

public class Fractin2 {
	
	double fraction;

	public Fractin2(double fraction) {
		this.fraction = fraction;
	}
	public static void main(String[] args) {
		// TO compare method from Exerice 6
		
	}

public  int compare(Fraction frac) { 
	Fraction f1 = new Fraction( 5.4);
	if(f1.num<frac.num)  return -1;
	
	else
		if(f1.num > frac.num) return 1;
		else return 0;
}
}
