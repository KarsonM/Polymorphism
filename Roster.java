//****************************************************
//Programmer:  Karson Mathews
//Polymorphism
//Homework:    Roster
//Date:        11/30/21
//Description: Class Roster uses an arrayList of class Staff
//			   to organize its staff. I simply added in the correct
//		       information depending on the job title. Next, is the
//			   hoursWorked method that outputs the descriptions of
//			   the employees and their total project contract hours.
//******************************************************

package PolymorphismHW;

import java.util.ArrayList;

public class Roster {
	//Creating ArrayList
	private ArrayList<Staff> Staff1;
	
	//Creating the employee roster
	public Roster(){
		Staff1 = new ArrayList<Staff>();
		Staff1.add(new Engineer("Marie", "Software Development", "msamuel@itsolutions.com", "123-45-6789"));
		Staff1.add(new Apprentice("Norm","Networking","nwhalen@itsolutions.com", "333-44-5555", false));
		Staff1.add(new Apprentice("Horace","Developer","hhoran@itsolutions.com", "222-333-4444", true));
		Staff1.add(new Subcontractor("Billy","OS Operator","bb@softwar.com"));
		Staff1.add(new Journeyman("Sandy","IT Developer","ssanders@itsolutions.com", "444-555-6666", 4));
		Staff1.add(new Engineer("Barbara","IoT","bsimth@itsolutions.com", "555-666-7777"));
	}
	
	//hoursWorked method outputs the description of the employees using the toString method and also outputs
	//their total project contract hours
	public void hoursWorked() {
		for(int i=0; i<Staff1.size(); i++) {
				Staff1.get(i).calcHours();
				System.out.println(Staff1.get(i).toString());
				if(Staff1.get(i).calcHours()==0) { //For Subcontractor
					System.out.println("Thanks for SubContracting!");
					System.out.println("----------------------------------------------");
				}
				else { //For everything else
				System.out.println("Project contract hours: "+Staff1.get(i).calcHours());
				System.out.println("----------------------------------------------");
			}
		}		
	}
}
