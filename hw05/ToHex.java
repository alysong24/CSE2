//Alyson Givre
//Homework 5

// This program takes three RGB value inputs and converst them to hexadecimal 

import java.util.Scanner; //import scanner

public class ToHex {
    
    public static void main(String[] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //tell user to enter three values
        System.out.print("Please enter three numbers representing RGB" +
        " values: ");
            
        //check if value entered is an int
        if (scan.hasNextInt()) {
           int red = scan.nextInt();
           
           //check if value is between 0 and 255
           if ( red >= 0 && red <= 255) {
               
               //check if next value is an int 
               if(scan.hasNextInt()) {
                   int green = scan.nextInt();
                   
                    //check if green 0-255
                    if (green >= 0 && green <= 255) {
                        
                        //check if next value is an int
                        if(scan.hasNextInt()) {
                            int blue = scan.nextInt();
                            
                            //check if blue 0-255
                            if (blue >= 0 && blue <= 255){
                                //begin printing result
                                System.out.print("The decimal numbers R:" 
                                + red + ", G:" + green + ", B:" + 
                                blue + ", is represented in hexadecimal" + 
                                "as: ");
        
                                //convert numbers to hex
                                int red1 = red / 16;
                                int red2 = red % 16;
                                int green1 = green / 16;
                                int green2 = green % 16;
                                int blue1 = blue / 16;
                                int blue2 = blue % 16;
        
                                //Initialize strings
                                String redHex;
                                String greenHex;
                                String blueHex;
                                String redHex2;
                                String greenHex2;
                                String blueHex2;
        
        
                                //if first red digit is between 0 and 9
                                if (red1 >= 0 && red1 <= 9) {
                                    //convert first red digit to a string
                                    redHex = Integer.toString(red1);
                                    //print first red digit
                                    System.out.print(redHex);
                                } //end if statement
        
                                //if first red digit is between 10 and 15
                                else {
                                    switch (red1) {
                                        case 10 : {
                                            //save digit to string
                                            redHex = "A";
                                            //print digit
                                            System.out.print(redHex);
                                            break;
                                        }
                                        case 11 : {
                                            //save digit to string
                                            redHex = "B";
                                            //print digit
                                            System.out.print(redHex);
                                            break;
                                        }
                                        case 12 : {
                                            //save digit to string
                                            redHex = "C";
                                            //print digit
                                            System.out.print(redHex);
                                            break;
                                        }
                                        case 13 : {
                                            //save digit to string
                                            redHex = "D";
                                            //print digit
                                            System.out.print(redHex);
                                            break;
                                        }
                                        case 14 : {
                                            //save digit to string
                                            redHex = "E";
                                            //print digit
                                            System.out.print(redHex);
                                            break;
                                        }
                                        case 15 : {
                                            //save digit to string
                                            redHex = "F";
                                            //print digit
                                            System.out.print(redHex);
                                            break;
                                        }
                                        default : {
                                            System.out.println("Error");
                                            break;
                                        }
                                    } //end switch statement
                                } //end else statement
         
                                //if second red digit is between 0 and 9       
                                if (red2 >= 0 && red2 <= 9) {
                                    //convert second red digit to a string
                                    redHex2 = Integer.toString(red2);
                                    //print second red digit
                                    System.out.print(redHex2);
                                } //end if statement
        
                                //if second red digit is between 10 and 15
                                else {
                                    switch (red2) {
                                        case 10 : {
                                            //save digit to string
                                            redHex2 = "A";
                                            //print digit
                                            System.out.print(redHex2);
                                            break;
                                        }
                                        case 11 : {
                                            //save digit to string
                                            redHex2 = "B";
                                            //print digit
                                            System.out.print(redHex2);
                                            break;
                                        }
                                        case 12 : {
                                            redHex2 = "C";
                                            //print digit
                                            System.out.print(redHex2);
                                            break;
                                        }
                                        case 13 : {
                                            //save digit to string
                                            redHex2 = "D";
                                            //print digit
                                            System.out.print(redHex2);
                                            break;
                                        }
                                        case 14 : {
                                            //save digit to string
                                            redHex2 = "E";
                                            //print digit
                                            System.out.print(redHex2);
                                            break;
                                        }
                                        case 15 : {
                                            //save digit to string
                                            redHex2 = "F";
                                            //print digit
                                            System.out.print(redHex2);
                                            break;
                                        }
                                        default : {
                                            System.out.println("Error");
                                            break;
                                        }
                                    } //end switch statement
                                } //end else statement
        
                                //if first green digit is between 0 and 9
                                if (green1 >= 0 && green1 <= 9) {
                                    //convert first green digit to a string
                                    greenHex = Integer.toString(green1);
                                    //print first green digit
                                    System.out.print(greenHex);
                                } //end if statement
        
                                //if first green digit is between 10 and 15
                                else {
                                    switch (green1) {
                                        case 10 : {
                                            //save digit to string
                                            greenHex = "A";
                                            //print digit
                                            System.out.print(greenHex);
                                            break;
                                        }
                                        case 11 : {
                                            //save digit to string
                                            greenHex = "B";
                                            //print digit
                                            System.out.print(greenHex);
                                            break;
                                        }
                                        case 12 : {
                                            //save digit to string
                                            greenHex = "C";
                                            //print digit
                                            System.out.print(greenHex);
                                            break;
                                        }
                                        case 13 : {
                                            //save digit to string
                                            greenHex = "D";
                                            //print digit
                                            System.out.print(greenHex);
                                            break;
                                        }
                                        case 14 : {
                                            //save digit to string
                                            greenHex = "E";
                                            //print digit
                                            System.out.print(greenHex);
                                            break;
                                        }
                                        case 15 : {
                                            //save digit to string
                                            greenHex = "F";
                                            //print digit
                                            System.out.print(greenHex);
                                            break;
                                        }
                                        default : {
                                            System.out.println("Error");
                                            break;
                                        }
                                    } //end switch statement
                                } //end else statement
         
                                //if second green digit is between 0 and 9       
                                if (green2 >= 0 && green2 <= 9) {
                                    //convert second green digit to a string
                                    greenHex2 = Integer.toString(green2);
                                    //print second green digit
                                    System.out.print(greenHex2);
                                } //end if statement
        
                                //if second green digit is between 10 and 15
                                else {
                                    switch (green2) {
                                        case 10 : {
                                            //save digit to string
                                            greenHex2 = "A";
                                            //print digit
                                            System.out.print(greenHex2);
                                            break;
                                        }
                                        case 11 : {
                                            //save digit to string
                                            greenHex2 = "B";
                                            //print digit
                                            System.out.print(greenHex2);
                                            break;
                                        }
                                        case 12 : {
                                            greenHex2 = "C";
                                            //print digit
                                            System.out.print(greenHex2);
                                            break;
                                        }
                                        case 13 : {
                                            //save digit to string
                                            greenHex2 = "D";
                                            //print digit
                                            System.out.print(greenHex2);
                                            break;
                                        }
                                        case 14 : {
                                            //save digit to string
                                            greenHex2 = "E";
                                            //print digit
                                            System.out.print(greenHex2);
                                            break;
                                        }
                                        case 15 : {
                                            //save digit to string
                                            greenHex2 = "F";
                                            //print digit
                                            System.out.print(greenHex2);
                                            break;
                                        }
                                        default : {
                                            System.out.println("Error");
                                            break;
                                        }
                                    } //end switch statement
                                } //end else statement
        
                                //if first blue digit is between 0 and 9
                                if (blue1 >= 0 && blue1 <= 9) {
                                    //convert first blue digit to a string
                                    blueHex = Integer.toString(blue1);
                                    //print first blue digit
                                    System.out.print(blueHex);
                                } //end if statement
        
                                //if first blue digit is between 10 and 15
                                else {
                                    switch (blue1) {
                                        case 10 : {
                                            //save digit to string
                                            blueHex = "A";
                                            //print digit
                                            System.out.print(blueHex);
                                            break;
                                        }
                                        case 11 : {
                                            //save digit to string
                                            blueHex = "B";
                                            //print digit
                                            System.out.print(blueHex);
                                            break;
                                        }
                                        case 12 : {
                                            //save digit to string
                                            blueHex = "C";
                                            //print digit
                                            System.out.print(blueHex);
                                            break;
                                        }
                                        case 13 : {
                                            //save digit to string
                                            blueHex = "D";
                                            //print digit
                                            System.out.print(blueHex);
                                            break;
                                        }
                                        case 14 : {
                                            //save digit to string
                                            blueHex = "E";
                                            //print digit
                                            System.out.print(blueHex);
                                            break;
                                        }
                                        case 15 : {
                                            //save digit to string
                                            blueHex = "F";
                                            //print digit
                                            System.out.print(blueHex);
                                            break;
                                        }
                                        default : {
                                            System.out.println("Error");
                                            break;
                                        }
                                    } //end switch statement
                                } //end else statement
         
                                //if second blue digit is between 0 and 9       
                                if (blue2 >= 0 && blue2 <= 9) {
                                    //convert second green digit to a string
                                    blueHex2 = Integer.toString(blue2);
                                    //print second green digit
                                    System.out.print(blueHex2 + "\n");
                                } //end if statement
        
                                //if second blue digit is between 10 and 15
                                else {
                                    switch (blue2) {
                                        case 10 : {
                                            //save digit to string
                                            blueHex2 = "A";
                                            //print digit
                                            System.out.print(blueHex2 + "\n");
                                            break;
                                        }
                                        case 11 : {
                                            //save digit to string
                                            blueHex2 = "B";
                                            //print digit
                                            System.out.print(blueHex2 + "\n");
                                            break;
                                        }
                                        case 12 : {
                                            blueHex2 = "C";
                                            //print digit
                                            System.out.print(blueHex2 + "\n");
                                            break;
                                        }
                                        case 13 : {
                                            //save digit to string
                                            blueHex2 = "D";
                                            //print digit
                                            System.out.print(blueHex2 + "\n");
                                            break;
                                        }
                                        case 14 : {
                                            //save digit to string
                                            blueHex2 = "E";
                                            //print digit
                                            System.out.print(blueHex2 + "\n");
                                            break;
                                        }
                                        case 15 : {
                                            //save digit to string
                                            blueHex2 = "F";
                                            //print digit
                                            System.out.print(blueHex2 + "\n");
                                            break;
                                        }
                                        default : {
                                            System.out.println("Error");
                                            break;
                                        }
                                    } //end switch statement
                                } //end else statement
                            }//if blue is 0-255
                            
                            //if not 0-255
                            else {
                                //print that value must be between 0 and 255
                                System.out.println("Sorry, you must enter" + 
                                " values between 0-255.");
                                
                            }//end if blue is not 0-255
                        }//end if blue is int
                        
                        //if not an int
                        else {
                            //print that value must be an int
                            System.out.println("Sorry, your input must" + 
                            " consist of integers.");
                        }//end else blue not int
                       
                    } //end if green 0-255
                    //if green not 0-255
                    else {
                        //print that value must be between 0 and 255
                        System.out.println("Sorry, you must enter values" +
                        " between 0-255.");
                    }//end else green not 0-255
                   
               } //end if green int
               
               //if green not int
               else {
                    //print that value must be an int
                    System.out.println("Sorry, your input must consist" +
                    " of integers."); 
               }
           }
           //if not between 0 and 255
           else {
               //print that value must be between 0 and 255
               System.out.println("Sorry, you must enter values between" +
               " 0-255.");
           } //end else red not 0-255
           
        } //end if red int
        
        //if not an int
        else {
            //print that value must be an int
            System.out.println("Sorry, your input must consist of" + 
            " integers.");
        } //end else red not int

    } //end main method
    
} //end class