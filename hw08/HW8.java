//Alyson Givre
//Homework 8

//This program is an adventure game

import java.util.Scanner; //import scanner

public class HW8 {
    //main method
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    } //end main method
    
    //giant method
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    } //end giant method
    
    //cave method
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    } //end cave method
    
    //box method
    public static void box() {
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    } //end box method
    
    //first getInput method
    public static String getInput(Scanner scan, String string) {
        //save string values
        String C = string.substring(0,1);
        String c = string.substring(1);
        //check user input
        String input = scan.nextLine();
        //check if user wants to continue
        if(input.equals(c) | input.equals(C)) {
            //return statement
            return input;
        }
        //if user does not want to continue
        else {
            //print statement
            System.out.println("Yea right LOSER!");
            //end program
            System.exit(0);
            //return statement
            return input;
        }
    } //end first getInput method
    
    //second getInput method
    public static String getInput(Scanner scan, String string, int trial) {
        //save string values
        String A = string.substring(0,1);
        String a = string.substring(1,2);
        String E = string.substring(2,3);
        String e = string.substring(3);
        
        //initialize variables
        int hits = 0;
        int random1 = -1;
        int random2 = -1;
        
        //get user input
        String input = scan.nextLine();
        
        //if input is not valid
        if(!input.equals(A) & !input.equals(a) & !input.equals(E) & 
            !input.equals(e)) {
            //print statement
            System.out.println("Yea right LOSER!");
            //end program
            System.exit(0);
            //return statement
            return input;    
        }
        //if input is valid
        else {
            while(hits < trial) {
                //if input is a
                if(input.equals(A) | input.equals(a)) {
                    //generate number
                    random1 = (int)(Math.random() * 2);
                    //if random1 equals 1
                    if(random1 == 1) {
                        //print statement
                        System.out.println("Critical hit!");
                        //increase hit count
                        hits++;
                    }
                    //if random1 equals 0
                    else {
                        //print statement
                        System.out.println("Gosh! How can you miss it!");
                    }
                }
                //if input is e
                else if(input.equals(E) | input.equals(e)) {
                    //generate random number
                    random2 = (int)(Math.random() * 11);
                    //if random2 equals 10
                    if(random2 == trial) {
                        //print statement
                        System.out.println("Escape successful!");
                        //return statement
                        return input;
                    }
                    //if random2 doesn't equal 10
                    else {
                        //print statement
                        System.out.print("Escape unsuccessful. ");
                    }
                }
                //if input is invalid
                else {
                    //print statement
                    System.out.println("Yea right LOSER!");
                    //end program
                    System.exit(0);
                    //return statement
                    return input;
                }
                
                //if hits does not equal 10
                if(hits != 10) {
                    //print statement
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    //get input
                    input = scan.nextLine();
                }
            }
            //return statement
            return input;
        }    
  
    } //end second getInput method
    
    //third getInput method
    public static String getInput(Scanner scan) {
        //set string value to return
        String string = "c";
        //if input is not an int
        if(!scan.hasNextInt()){
            //print statement
            System.out.println("A Wrong Number! You get nothing!" + 
                "Better restart the game LOL");
            //end program
            System.exit(0);
            //return statement
            return string;
        }
        //save input
        int input = scan.nextInt();
        //switch statement
        switch(input) {
            //if 1 is chosen
            case 1 : {
                //print statement
                System.out.print("It is $1000! ");
                //return statement
                return string;
            }
            //if 2 is chosen
            case 2 : {
                //print statement
                System.out.print("It is a 4.0 GPA! ");
                //return statement
                return string;
            }
            //if 3 is chosen
            case 3 : {
                //print statement
                System.out.print("It is a new computer! ");
                //return statement
                return string;
            }
            //default case
            default : {
                //print statement
                System.out.println("A Wrong Number! You get nothing!" + 
                    "Better restart the game LOL");
                //end program
                System.exit(0);
                //return statement
                return string;
            }
        }
    } //end third getInput method
 
} //end class