//****************************************************
//Programmer:  Karson Mathews
//Polymorphism
//Homework:    Subcontractor
//Date:        11/30/21
//Description: Class subcontractor inherits Staff class and 
//			   doesn't hold any project Hours so return 0 in
//		       calcHours method.

//******************************************************

package PolymorphismHW;

public class Subcontractor extends Staff {

	//Constructor
	public Subcontractor(String n, String s, String e) {
		super(n, s, e);
	}
	
	//Method calcHours
	public double calcHours() {
		return 0;
	}
}
