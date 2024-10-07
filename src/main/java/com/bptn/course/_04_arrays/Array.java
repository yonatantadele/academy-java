package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		
		//Declare and initliaze an array with 6 values 
		
		int[] myArray = {3,5,7,9,11,13};
		
		//Print the first and second element to the console
		System.out.println("First Element:" + myArray[0]);
		
		System.out.println("Second Element:" + myArray[1]);
		
		//Update the first element to 30
		myArray[0] = 30;
		
		System.out.println("Updated first element:" + myArray[0]);
        
		//Updating the last element of the Array using length property(without the index) and set it to 130
		
		myArray[myArray.length-1] = 130;
		
		System.out.println("Updated last element:" + myArray[myArray.length-1]);

		
		//use for loop to print all the elements of the myArray 
		for (int i=0 ; i<myArray.length ; i++) {
			System.out.println(myArray[i]); 
		}
		
		//Enhanced for-loop (for-each loop)
		for (int element: myArray) {
			System.out.println(element);
		
			int count = 1;
			while (count <= 10) {
			    count *= 2;
			}
			count = count - 10;
		//how to print
		}
	}
}
