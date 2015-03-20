import java.util.Scanner;

public class test {
    //main method
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("There are three 3 treasure box in front of you! Enter the box number you want to open!");
        String input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    } //end main method
    
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