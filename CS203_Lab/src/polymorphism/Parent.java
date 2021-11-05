package polymorphism;

class Parent {
	
	void myMethod() {
		System.out.println("super class");
	}
}
	 class Derived extends Parent {

		void myMethod() {
			System.out.println("derived class");
		}

	

    public static void main(String[] args) {
    	/**
    	 * The answer is C --> Compilation error
    	 *This is invalid creation object, gives us Error. 
    	 * We can't create from Derived class
    	 *  b/c derived class a sub class of Parent class.
    	 *we are allowed to create object from Parent class. 
    	 */
    	//Derived object = new Parent();
    	
    	
//    	Parent object = new Derived();
//    	object.myMethod();  // derived class
	
}
    }