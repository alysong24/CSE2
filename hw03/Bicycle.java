//Alyson Givre
//Homework 3
//Problem 1

import java.util.Scanner; //import scanner

public class Bicycle {
    
    public static void main (String [] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner (System.in);
        
        //Prompt user to enter # of seconds
        System.out.println("Enter the number of seconds: ");
            int seconds = scan.nextInt();
        
        //Prompt user to enter # of counts
        System.out.println("Enter the number of counts: ");
            int counts = scan.nextInt();
            
        double wheelDiameter = 27.0;  //sets wheel diameter
  	    double PI = 3.14159; //sets value of pi
  	    double feetPerMile = 5280; //conversion factor of feet per mile
  	    double inchesPerFoot = 12;  //conversion factor of inches per foot
  	    double secondsPerMinute = 60;  //conversion factor of seconds per minute
	    double minutesPerHour = 60; //conversion factor of minutes per hour
	    
	    //calculate total distance
	    double totalDistance = counts * wheelDiameter * PI;
	    //convert distance to miles
	    totalDistance = totalDistance / inchesPerFoot / feetPerMile;
	    
	    //calculate total time
	    double totalTime = seconds / secondsPerMinute;
	    
	    //calculate mph
	    double timeHours = totalTime / minutesPerHour;
	    double avgMph = totalDistance / timeHours; 
        
        //print results
        System.out.println("The distance was " + totalDistance +
            " miles and took " + totalTime + " minutes.");
        System.out.println("The average mph was " + avgMph );
        
        
    } //end main method
    
} //end class