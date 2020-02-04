// name: Sonia Hamczyk
// instructor: Villmow
// course: COP 2800
// date: 14 JAN 2020
// purpose: Chapter 9 Project

package edu.seminolestate.trips;

import java.time.LocalDate;
import java.time.Month;

import edu.seminolestate.trips.Trip;

/**
 * @author sonia.hamczyk
 *
 */
public class ManageTrips {

	/*
	 * Instantiate a Trip object using the constructor with parameters 
	 * for starting location, ending location, trip date, and miles. Specify 
	 * the values by using constant values of your choice. You must use a valid 
	 * LocalDate object for the start date. Make this object so it represents 
	 * some date other than the current date (i.e. now). Use a number greater than 0 for the miles. 
	 * Do not get this data from the user. Just hard code it. 
	 */
	public static void main(String[] args) {
		LocalDate easter = LocalDate.of(2019, Month.APRIL, 20);
		Trip t1 = new Trip(" Denver, CO", " San Diego, CA", easter, 59.0);
		//Display the values of the first object by calling the toString method in the Trip class.
		System.out.println("Trip 1\n" + t1.toString());
		
		//Instantiate a second Trip object using the no argument constructor.
		Trip t2 = new Trip();
		//Display the values of the second object by calling the toString method in the Trip class. 
		System.out.println("\nTrip 2\n" + t2.toString());
		
		/*
		 * Instantiate a third Trip object using the constructor that has 
		 * arguments for starting location and ending location. Specify the 
		 * location values by using constant values of your choice. Use  
		 * different locations than used in the first object. 
		 */
		Trip t3 = new Trip(" Pittsburgh, PA", " Raleigh, NC");
		//Display the values of the third object by calling the toString 
		//method in the Trip class.
		System.out.println("\nTrip 3\n" + t3.toString());
		
		t1.updateTripMiles(95.00);
		
		/*
		 * Change the trip date for the first object. Call the overloaded 
		 * setTripDate method by passing 3 int arguments representing the 
		 * month, day, and year of the new trip date.
		 */
		t1.setStartDate(06, 22, 2019);
		
		System.out.println("\nTrip 1 after updating trip miles and start date\n" + t1.toString());
				

	}// end of main method

}// end of ManageTrips class
