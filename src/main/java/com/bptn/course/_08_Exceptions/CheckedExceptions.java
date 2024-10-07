package com.bptn.course._08_Exceptions;


//Java Program to Illustrate Checked Exceptions
//Where FileNotFoundException occurred

//Importing I/O classes
import java.io.*;

//Main class
class CheckedExceptions {

 // Main driver method
 public static void main(String[] args) throws IOException 
 {

     // Reading file from path in local directory
     FileReader file = new FileReader("C:\\Users\\yonat\\OneDrive\\Desktop\\testnotepad.txt");
     
     // Creating object as one of ways of taking input
     BufferedReader fileInput = new BufferedReader(file);

     // Printing first 3 lines of file "\"C:\\Users\\yonat\\OneDrive\\Desktop\\testnotepad.txt\""
     for (int counter = 0; counter < 3; counter++)
         System.out.println(fileInput.readLine());

     // Closing file connections
     // using close() method
     fileInput.close();
 }
}