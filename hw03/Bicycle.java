//Alyson Givre
//Homework 3
//Problem 1

/* This program calulates the total distance, time, and average
mph of a bicycle from data entered by the user */

import java.util.Scanner; //import scanner

public class Bicycle {
    
    public static void main (String [] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner (System.in);
        
        //Prompt user to enter # of seconds
        System.out.print("Enter the number of seconds: ");
            int seconds = scan.nextInt();
        
        //Prompt user to enter # of counts
        System.out.print("Enter the number of counts: ");
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
	    //change distance to correct format
	    int totalDistanceInt = (int) totalDistance;
	    int dist1 = (int) (totalDistance * 10) % 10;
	    int dist2 = (int) (totalDistance * 100) % 10;
	    
	   
	    //calculate total time
	    double totalTime = seconds / secondsPerMinute;
	    
	    //calculate mph
	    double timeHours = totalTime / minutesPerHour;
	    double avgMph = totalDistance / timeHours; 
	    //change total distance to correct format
	    int avgMphInt = (int) avgMph;
	    int mph1 = (int) (avgMph * 10) % 10;
	    int mph2 = (int) (avgMph * 100) % 10;
	    
        //print results
        System.out.print("The distance was " + totalDistanceInt);
        System.out.print("." + dist1);
        System.out.print(dist2);
        System.out.print(" miles and took " + totalTime + 
            " minutes.");
        System.out.print("The average mph was " + avgMphInt + "." );
        System.out.print(mph1);
        System.out.print(mph2 + "\n");
        
        
    } //end main method
    
} //end class