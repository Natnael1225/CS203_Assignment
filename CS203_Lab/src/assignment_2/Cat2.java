package assignment_2;

public class Cat2 {
//TO check whether the overloading methods are valid or not
	
	/**
	 *    A -> Both are valid constructor
	 * @param age
	 */
	public Cat2(int age) {//Valid constructor int data type
		
	}
	public Cat2(double wgt) {//Valid constructor double data type
		
	}
	/**
	 *   D -> All the constructors are valid 
	 *   has same Signature name
	 *   but d/t parameter (input data)
	 * @param name
	 */
public Cat2(String name) {//Valid constructor double data type
		
	}
public Cat2(String name,double wgt ) {//Valid constructor String and double data type
	
}

//public Cat2(double wgt);
	
//}

}
class Dog{
	
	/**
	 *   B ->  InValid constructor
	 * B/c both of them has same signature name and
	 *input data(Parameter) but d/t variable so gives error
	 * @param name
	 * @param wgt
	 */
	
	public Dog(String name,double wgt ) {
		
	}
	
//public Dog(String name,double height ) {
	
	//	}

/**
 *   C -> Both are Valid Constructor
 *   With Same Signature but different data type position
 * @param name
 * @param wgt
 */
//public Dog(String name,double wgt ) {
		
//	}
	
public Dog(double wgt, String name ) {
		
	}	
	
}