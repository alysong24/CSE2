// Alyson Givre
// Lab 2

/* This program is a bicycle cyclometer that measures the time 
elapsed in seconds and the number of rotations of the front wheel*/

public class Cyclometer{
    //create main method
    public static void main ( String [] args ) {
        
        int secsTrip1 = 480;  //time of trip one in seconds
       	int secsTrip2 = 3220;  //time of trip two in seconds
		int countsTrip1 = 1561;  //number of rotations in trip one
		int countsTrip2 = 9037; //number of rotations in trip 2
		
		double wheelDiameter = 27.0;  //sets wheel diameter
  	    double PI = 3.14159; //sets value of pi
  	    double feetPerMile = 5280; //conversion factor of feet per mile
  	    double inchesPerFoot = 12;  //conversion factor of inches per foot
  	    double secondsPerMinute = 60;  //conversion factor of seconds per minute
	    double distanceTrip1, distanceTrip2, totalDistance;  
	    //initializes varibles as doubles
	    
	    distanceTrip1 = countsTrip1 * wheelDiameter * PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	    distanceTrip1 = distanceTrip1 / inchesPerFoot / feetPerMile; 
	    // Converts to distance in miles
	    distanceTrip2 = countsTrip2 * wheelDiameter * PI;
	    distanceTrip2 = distanceTrip2 / inchesPerFoot / feetPerMile;
	    totalDistance = distanceTrip1 + distanceTrip2;
	    
	    //print out output data
	    System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute) + " minutes and had "+
       	      countsTrip1 + " counts.");
	   System.out.println( "Trip 2 took " +
       	     (secsTrip2/secondsPerMinute) + " minutes and had " +
       	      countsTrip2 + " counts.");
       	
	    System.out.println("Trip 1 was " + distanceTrip1 + " miles");
	    System.out.println("Trip 2 was " + distanceTrip2 + " miles");
	    System.out.println("The total distance was " + totalDistance + " miles");
        
    } //end of main method
} //end of class