package assignment_2;

public class MethodOverLoaded {

	/**
	 * A --> Both are Invalid methods b/c
	 *  they have d/t return type
	 */
	
public void compute(int num) {
		
	}
public int compute(double num) {
	
	return 0;
}

	/**
	 * B --> Both are valid methods d/t parameter but,
	 * same signature name.
	 * first  is parameterized & second is free parameter
	 */
	public void move(double length) {
		
	}
   public void move() {
		
	}

/**
 * C --> Both are InValid methods b/c d/t return type 
 * So it should be same return type
 */
public int adjust(double amount) {
	return 0;
}
public void adjust(double amount, double charge) {
	
}

/**
 * D --> All the methods are InValid methods b/c have different
 *  return type.So it should be same return type
 *  But have same signature name and d/t parameter 
 */

public void doWork() {
	
}
public void doWork(String name) {
	
}
public int doWork(double num) {
return 0;	
}
}
