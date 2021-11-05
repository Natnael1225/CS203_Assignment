package assignment_3;

import java.util.Arrays;

public class EqualityArrays {

	public static boolean equalArrays(int[] arr, int[] arr2) {
		if(arr==arr2) {
			return true;
		}
		if(arr.length != arr2.length) {
			return false;
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] !=arr2[i])
				return false;
		}
	
		return true;
	}
	public static void main(String[] args) {
		// TO check the two arrays are equal

		int[] arr1 = { 1, 3, 5, 6, 6, 7 };
		int[] arr2 = { 1, 2, 5, 6, 6 ,7 };
		int[] arr3 = { 1, 3, 5,  7 };
		boolean ans = equalArrays(arr1,arr2);
		System.out.println(ans);
		
		boolean isEqual = true;
		
		if(arr1.length == arr2.length) {
		
		for(int i=0;i<arr2.length;i++) {
			if(arr1[i] != arr2[i]) {
				isEqual = false;
		}
		}
		}else {
			isEqual = false;
		}
		if(isEqual ) {
		System.out.println("The two arrays are equal");
		}else {
		System.out.println("The two arrays are not equal");
		}
//		if (Arrays.equals(arr1, arr2)) {
//			
//			System.out.println("The two arrays are equal");
//		} else {
//
//			System.out.println("The two arrays are not equal");
//		}
//		
//if (Arrays.equals(arr1, arr3)) {
//			
//			System.out.println("The two arrays are equal");
//		} else {
//
//			System.out.println("The two arrays are not equal");
//		}

	}

}
