package assignment_2;

public class Fraction {
	
 private double fractionNumber;
 
 
 public Fraction( int base , double decimal) {
	 
	 this.fractionNumber = base +(decimal/10);
 }
 
public static int compare(Fraction f1, Fraction f2) {
	if(f1.fractionNumber < f2.fractionNumber) {
		return  -1;
}
	else 
		if(f1.fractionNumber == f2.fractionNumber) {
			return  0;
		}
		else return 1;
	
}
public int compare(Fraction frac) {
	Fraction fr = new Fraction(10,20);
	if(fr.fractionNumber < frac.fractionNumber) {
		return -1;
	}else 
		if(fr.fractionNumber == frac.fractionNumber) {
			return 0;
		}
		else  return 1;
	
}
}
