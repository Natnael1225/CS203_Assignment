package assignment_3;

public class FindSmallest_Largest {
	// TO find the smallest and largest element
	
	
	public static int[] MaxMin(int[] nums) {
	
	 int smallest = nums[0]; 
	 int largest = nums[0]; 
	 
	 for(int i=0;i<nums.length;i++) {
		 
		 if(nums[i]< smallest) {
			 smallest = nums[i];
		 }
		 else if(nums[i] > largest) {
			 largest = nums[i];
	 }
	 }
	   return new int[] { largest, smallest};
}
	
public static void main(String[] args) {
	int[] arr = {1,4,-9,33,19,78,5};
	int[] answer = MaxMin(arr);
	
	for(int i=0;i<answer.length;i++) {
		System.out.println("The elements are: "+answer[i]);
	}
	
}
}
