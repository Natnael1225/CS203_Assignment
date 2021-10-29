package assignment_3;

public class FindSmallest_Largest {

	public static void main(String[] args) {
		
		// TO find the smallest and largest element
		
	int[] nums = {1,4,-9,33,19,78,5};
	
	 int smallest = nums[0]; 
	 int largest = nums[0]; 
	 
	 for(int i=0;i<nums.length;i++) {
		 
		 if(nums[i]< smallest)
			 smallest = nums[i];
		 
		 else if(nums[i] > largest)
			 largest = nums[i];
	 }
System.out.println("The largest element is:" + largest);
System.out.println("The smallest element is:" + smallest);
	}
	

}
