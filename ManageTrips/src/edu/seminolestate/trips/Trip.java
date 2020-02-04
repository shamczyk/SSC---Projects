// name: Sonia Hamczyk
// instructor: Villmow
// course: COP 2800
// date: 14 JAN 2020
// purpose: Chapter 9 Project

package edu.seminolestate.trips;

import java.time.LocalDate;

/**
 * @author sonia.hamczyk
 *
 */
public class Trip {

	/*
	 * Create private instance variables for the following:
		a) a String for the starting location of the trip
		b) a String for the ending location of the trip
		c) a LocalDate for the date of the trip (see the notes in Canvas for more information on the LocalDate class)
		d) a double for the number of miles in the trip.
	 */
	
	private String 		startingLocation;
	private String 		endingLocation;
	private LocalDate 	tripStartDate;
	private double		tripMiles;
	
	public static final String DEFAULT_STARTING_LOCATION = "Sanford, FL.";
	public static final String DEFAULT_ENDING_LOCATION = "no ending location";
	public static final LocalDate DEFAULT_TRIP_START_DATE = LocalDate.now();
	public static final double DEFAULT_TRIP_MILES = 0;
	public Trip(String newStartingLocation, String newEndingLocation, LocalDate newTripStartDate, double newTripMiles) 
	
	{
		
			this.startingLocation = DEFAULT_STARTING_LOCATION;
			this.endingLocation = DEFAULT_ENDING_LOCATION;
			this.tripStartDate = DEFAULT_TRIP_START_DATE;
			
			/*'this' is used in place of the actual name of the class*/
			
			this.setStartingLocation(newStartingLocation);
			this.setEndingLocation(newEndingLocation);
			this.setTripStartDate(newTripStartDate);
			this.setTripMiles(newTripMiles);
		}// constructor with parameter for EACH instance class variable
	
	/*
	 * a constructor that has no parameters; use the this reference and 
	 * default values to call the first constructor. The default values are:
       		i) "Sanford, FL." for the starting location
      		ii) "no ending location" for the ending location
      		iii) the current date for the trip start date
      		iv) null for the trip miles
	 */
	
	public Trip(){
		this(DEFAULT_STARTING_LOCATION, DEFAULT_ENDING_LOCATION, DEFAULT_TRIP_START_DATE, DEFAULT_TRIP_MILES);
	}// constructor with DEFAULTS

	/**
	 * @param startingLocation
	 * @param endingLocation
	 */
	public Trip(String NewStartingLocation, String NewEndingLocation) {
		this(NewStartingLocation, NewEndingLocation, DEFAULT_TRIP_START_DATE, DEFAULT_TRIP_MILES);
	}
	
	public void updateTripMiles(double miles){
		this.tripMiles += miles;
	}
	
	//mutator (setter) methods and accessor (getter) methods
		public String getStartingLocation() {
			return startingLocation;
		}
		public void setStartingLocation(String newStartingLocation) {
			if (newStartingLocation != null && newStartingLocation.length() > 0)
				this.startingLocation = newStartingLocation;
		}
		public String getEndingLocation() {
			return endingLocation;
		}
		public void setEndingLocation(String newEndingLocation) {
			if (newEndingLocation != null && newEndingLocation.length() > 0)
				this.endingLocation = newEndingLocation;
		}
		public LocalDate getTripStartDate() {
			return tripStartDate;
		}

		public void setTripStartDate(LocalDate newTripStartDate) {
			if (newTripStartDate != null)
				this.tripStartDate = newTripStartDate;
		}
		
		/*
		 * Overload the method to set the start date. The original method 
		 * should have one parameter of type LocalDate that is used to update 
		 * the start date. The overloaded method should have three int 
		 * parameters for year, month, and day. Use this data to create a 
		 * LocalDate object and update the start date class variable.
		 */ 
		public void setStartDate(int month, int day, int year) {
			this.tripStartDate = LocalDate.of(year, month, day);
		}// update the start date variable
		

		/**
		 * @return the tripMiles
		 */
		public double getTripMiles() {
			return tripMiles;
		}

		/**
		 * @param tripMiles the tripMiles to set
		 */
		public void setTripMiles(double tripMiles) {
			this.tripMiles = tripMiles;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Trip [startingLocation=" + startingLocation + ", endingLocation=" + endingLocation
					+ ", tripStartDate=" + tripStartDate + ", tripMiles=" + tripMiles + "]";
		}// end of toString
		

}// end of Trip Class
