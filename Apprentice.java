//****************************************************
//Programmer:  Karson Mathews
//Polymorphism
//Homework:    Apprentice
//Date:        11/30/21
//Description: Class Apprentice inherits class Engineer.
//			   Uses Engineer's constructor and also takes in 
//		       their qualification. Contains method calcHours 
//			   depending on their qualification. Finally, a toString method
//			   using Engineer's and adds a String description.
//******************************************************

package PolymorphismHW;

public class Apprentice extends Engineer{
	//Variable
	private boolean qual;
	
	//Constructor
	public Apprentice(String n, String s, String e, String ss, boolean q) {
		super(n, s, e, ss);
		qual = q;
	}
	
	//Method calcHours, if they are qualified projHours*1.1, else just regular hours (1000)
	public double calcHours() {
		double hours=0.0;
		if(qual==true) 
			hours = projHours*1.1;
		else
			hours = projHours;
		return hours;
	}
	
	//toString method using Engineer's toString method and adding a String description
	public String toString() {
		String result = super.toString()+"-Apprentice";
		return result;
	}

}
