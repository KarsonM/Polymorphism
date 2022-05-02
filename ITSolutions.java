//****************************************************
//Programmer:  Karson Mathews
//Polymorphism
//Homework:    ITSolutions
//Date:        11/30/21
//Description: This is the driver program for IT Solutions. 
//			   We use our Roster class to create a new roster object
//		       and call the hoursWorked() method to output the 
//			   information of the employees and their hours.
//******************************************************

package PolymorphismHW;

public class ITSolutions {
	public static void main(String[] args) {
		//Creating new object
		Roster newRoster = new Roster();
		
		//Using new object to call Roster class method, hoursWorked
		newRoster.hoursWorked();
	}
}
