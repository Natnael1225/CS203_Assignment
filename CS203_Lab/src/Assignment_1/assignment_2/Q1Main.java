package assignment_2;

public class Q1Main {

	public static void main(String[] args) {
		
		Breed persian = new Breed("Persian",10.0);
		
		//This Cat class is a Valid, 
		Cat chacha = new Cat("Cha Cha", persian,12.0);
		
/**
* In this Cat class in the constructor, it is Breed class
* not a String data type so this gives us an error
*    The result is invalid
*/
		//Cat bombom = new Cat("Bom Bom", "Mix", 10.0)
		
//==================================================================
		/**
		* In this Cat class in the constructor, it is Breed class
		* not Cat Object so this gives us an error
		*    The result is invalid
		*/
		
		//Cat puffpuff = new Cat("Puff Puff", chacha,9.0)
//-------------------------------------------------------------
		
		/**
 * In getWeight method subtract Cat Class from
 *  Breed class, this is valid
		 */
	double diff = chacha.getWeight() - persian.getWeight();
	System.out.println(diff);
	/**
	 * The object puffpuff is invalid so in this case 
	 * the puffpuff object does not initialized the vales correctly
	 * for the object puffpuff. so we give us error
	 */
	//System.out.println(puffpuff.getBreed().getWeight());

	}

}
