//****************************************************
//Programmer:  Karson Mathews
//Polymorphism
//Homework:    Staff
//Date:        11/30/21
//Description: Abstract class implementing our interface hours.
//			   Here our construct assigns all three variables
//		       the employees have in common. It also contains
//			   a toString method returning a description we
//			   will use in our other classes.	   
//******************************************************

package PolymorphismHW;

public abstract class Staff implements Hours {
	//Variables
	protected String name;
	protected String specialty;
	protected String email;
	
	//Constructor
	public Staff(String n, String s, String e) {
		name = n;
		specialty = s;
		email = e;
	}
	
	//Method calcHours()
	public double calcHours() {
		return 0;
	}
	
	//Method toString returning a description of the staff member
	public String toString() {
		String result = "Name: "+name+"\n"+"Specialty: "+specialty+"\n"+"Eamil: "+email;
		return result;
	}
}
