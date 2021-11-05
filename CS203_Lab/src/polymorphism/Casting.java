package polymorphism;

//Parent class
public class Casting {

	String name;
/**
* Up-casting:is the type casting of a child object
*to a parent object, can be done implicitly.and gives us
*the flexibility to access the parent class members,not
* 
*Down-casting: is type casting of a parent object to 
*a child object. Down-casting cannot be implicit.
*/
	 
    // A method which prints the
    // signature of the parent class
	void myMethod() {
		System.out.println("super class");
	}
}
//Child class
	 class Child extends Casting {
		 
		// Overriding the parent method
		    // to print the signature of the child class
		void myMethod() {
			System.out.println("derived class");
		}
	 
	public static void main(String[] args) {

		//Up-Casting
		Casting p = new   Child();
		p.name=" programming";
         p.myMethod();
         System.out.println(p.name);
         
        //Down-Casting
         Child d = ( Child)p;
         d.name =" java";
         d.myMethod();
         System.out.println(d.name);
         //This gives us compile time error.
         //Derived d1 = new  Casting()

	}

}
