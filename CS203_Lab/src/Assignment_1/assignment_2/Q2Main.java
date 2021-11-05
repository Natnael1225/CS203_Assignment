package assignment_2;



public class Q2Main {

	public static void main(String[] args) {
		// Give the out put from result one
 Cat myCat = new Cat("winky", new Breed("Mix",10.5), 9.5);

    System.out.println(myCat.getWeight()); //Out-put -> 9.5
    System.out.println(myCat.getBreed().getWeight());//Out-put -> 10.5
	
	
	}

}
