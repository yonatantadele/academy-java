package com.bptn.course._08_NumberGuessingGame;

import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {  
		 Scanner guess = new Scanner(System.in);
		   

		   System.out.println("Guess Number b/w 1-100, inclusive:");
		   int guessNumber = guess.nextInt();
		   int targetNumber = 23;
		   
		   //Iterate to check against the elicted condition9s) below, as long as the number is b/w 1 & 100;
		   while (guessNumber >0) {
		    if (targetNumber == guessNumber){
		       System.out.println("Congratulations! You have guessed the number correctly!");
		       break;
		   } else if (guessNumber < targetNumber) {
		       System.out.println("Too low! Try again");
		       guessNumber = guess.nextInt();
		   } else if (guessNumber > targetNumber && guessNumber < 101) {
		      System.out.println("Too high! Try again");
		      guessNumber = guess.nextInt();
		   } else {
		      System.out.println("Please enter a number between 1 and 100");
		   }
		   }
		   guess.close();
		    }
		    }





