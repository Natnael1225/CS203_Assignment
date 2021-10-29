package assignment_3;

public class Account {

	 
	/**
	 * We can't allowed to set the size in the
	 *  first square bracket, so line 1….[25] should be changed by [ ] , 
	 *   the retun type is int not array int.or ( int []).
	 *   line 2… we are creating a new array with size 15, which has default value of 0.
	 *   line 4….since we are trying to get the indexes before and after I,
	 *    we will have error for index 0, and for the last index
	 *   
	 * @param number
	 * @return
	 */
 public  static void searchAccount( int[] number ) {
		number = new int[5];
		for (int i = 0; i < number.length; i++ )
		number[i] = number[i-1] + number[i+1]; 
		System.out.println(number);

}
 public static void main(String[] args) {
	 int arr[] = {1,3,4,5,3};
	 searchAccount(arr);
}
}
