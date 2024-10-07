package com.bptn.couse._07_PluralForm;

import java.util.Scanner;

public class PluralForm {
	    public static void main(String[] args) {
	    	   //Scanner input for integer
	    	   System.out.println("Enter Integer:");
	    	   Scanner scanner = new Scanner(System.in);
	    	   int integer = scanner.nextInt();
	    	   
	    	    //Scanner input for string
	    	   System.out.println("Enter String:");
	    	   Scanner pluralNoun = new Scanner(System.in);
	    	   String noun = pluralNoun.nextLine();
	 

	    	   //Applies the respective condition for all integers above 1 (denoting pluralism) ; otherwise returns the entered integer and apples, as-is
	    	   //*Cognizant of ordering of conditions, since some of rules collapse under the otherwise
	    	   while (integer >= 0){
	    	        if (noun.endsWith("fe")) {
	    	           System.out.println(integer + " " + noun.replaceFirst("fe", "ves"));
	    	           break;
	    	        } else if (noun.endsWith("ay")) {
	    	           System.out.println(integer + " " + noun.concat("s"));
	    	           break;
	    	        } else if (noun.endsWith("oy")) {
	    	           System.out.println(integer + " " + noun.concat("s"));
	    	           break;
	    	        } else if (noun.endsWith("ey")) {
	    	           System.out.println(integer + " " + noun.concat("s"));
	    	           break;
	    	        } else if (noun.endsWith("uy")) {
	    	           System.out.println(integer + " " + noun.concat("s"));
	    	           break;
	    	        } else if (noun.endsWith("sh")) {
	    	           System.out.println(integer + " " + noun.concat("es"));
	    	           break;
	    	        } else if (noun.endsWith("ch")) {
	    	           System.out.println(integer + " " + noun.concat("es"));
	    	           break;
	    	        } else if (noun.endsWith("us")) {
	    	           System.out.println(integer + " " + noun.replaceFirst("us","i"));
	    	           break;
	    	        } else if (noun.endsWith("y")) {
	    	           System.out.println(integer + " " + noun.replaceFirst("y","ies"));
	    	           break;
	    	        } else if (integer == 1) {
	    	          System.out.println(integer + " " + noun);
	    	          break;
	    	        } else {
	    	         System.out.println(integer + " " + noun.concat("s"));
	    	         break;
	    	        }
	    	               
	    	    
	    	        }
	    	         scanner.close();
	    	    }
	    	}