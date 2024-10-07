package com.bptn.course._04_arrays;

public class FindOddPosInArray {

	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50};
		
		System.out.println("At odd indexes, the elements are: ");
		
		
		//Approach 1
		for(int i=0 ; i < numbers.length ; i++) {
			
			if(i%2!=1) {
				System.out.println(numbers[i]);
			}
		}
	}

}
