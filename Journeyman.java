//****************************************************
//Programmer:  Karson Mathews
//Polymorphism
//Homework:    Journeyman
//Date:        11/30/21
//Description: Journeyman class inherits the Engineer class.
//			   It contains the Engineer constructor and also takes
//		       in another variable, level. Contains methods calcHours which
//			   calculates the total project hours by checking the level,
//			   and toString method using the Engineer toString and 
//			   adding a simple String following.
//******************************************************

package PolymorphismHW;

public class Journeyman extends Engineer{
	//Variable
	private int level;

	//Constructor
	public Journeyman(String n, String s, String e, String ss, int l){
		super(n, s, e, ss);
		level = l;
	}
	
	//calcHours method checking level to determine correct calculation to do and returning hours
	public double calcHours() {
		double hours = 0;
		if(level==2) {
			hours = projHours*1.2;
		}
		if(level==3) {
			hours = projHours*1.3;
		}
		 if (level==4) {
			hours = projHours*1.4;
		 }
		return hours;
	}
	
	//toString method using Engineer's toString and adding a String description
@Override
	public String toString() {
		String result =super.toString()+"-Journeyman";
		return result;
	}
}
