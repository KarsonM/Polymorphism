//****************************************************
//Programmer:  Karson Mathews
//Polymorphism
//Homework:    Engineer
//Date:        11/30/21
//Description: Class Engineer inherits Staff class and also 
//			   assigns a socialSecNum variable. It contains calcHours()
//		       and a toString() method to return a description
//			   using Staff's toString and also adding on.
//******************************************************

package PolymorphismHW;

public class Engineer extends Staff{
	//Variables
	protected String socialSecNum;
	protected double projHours=1000;
	
	//Constructor using Staff's
	public Engineer(String n, String s, String e, String ss) {
		super(n, s, e);
		socialSecNum = ss;
	}
	
	//Method calcHours for Engineers is projHours=1000*2
	public double calcHours() {
		double hours = projHours*2.0;
		return hours;
	}
	
	//toString method adding on to Staff's toString method and returning result
	@Override
	public String toString() {
		String result =super.toString()+"\n"+"Social Security Number: "+socialSecNum+"\n"+"Engineer";
		return result;
	}

}
