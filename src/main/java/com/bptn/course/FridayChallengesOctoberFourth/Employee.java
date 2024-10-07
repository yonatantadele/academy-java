package com.bptn.course.FridayChallengesOctoberFourth;

class Employee {
	   // Instance variable to store salary
	      private double salary;
	      
	   
	   // Constructor to set instance variables(salary and hoursPerDay) value 
	      public Employee (double salary, int hoursPerDay){
	        setSalary(salary);
	        setHoursPerDay(hoursPerDay);
	      }
	      

	      
	   // Set method to update salary
	      public void setSalary(double salary){
	        if (salary < 500){
	          this.salary = salary + 10;
	        } else {
	          this.salary = salary ;
	        }
	      }
	  

	   // Set method to update hoursPerDay
	      public void setHoursPerDay(int hoursPerDay){
	        if (hoursPerDay > 6){
	          this.salary += 5;
	        }
	      }
	        
	     
	   // Get method to return salary
	     public double getSalary(){
	        return salary;
	      }
	      }


