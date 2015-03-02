//Alyson Givre
//Homework 6
//Program 3

/*This program generates a random number and then prints that number of "*"s
characters if the number is even or "&"s if the number is odd */

public class MakeSymbols {
    
    public static void main(String[] args) {
        
        //generate random number
        int x = (int)(Math.random() * 100);
        //check if number is even
        if (x % 2 == 0) {
            //print x and output pattern
            System.out.println("Random number generated: " + x);
            System.out.print("The output pattern: ");
            //print x "*"s using a do-while loop
            do {
                //decrease x by one
                x--;
                //print *
                System.out.print("*");
            } while(x > 0); //keep looping until x equals 0
            //print a line break
            System.out.print("\n");
        }
        //if x is odd
        else {
            //print x and output pattern
            System.out.println("Random number generated: " + x);
            System.out.print("The output pattern: ");
            //print x "&"s using a do-while loop
            do {
                //decrease x by one
                x--;
                //print &
                System.out.print("&");
            } while(x > 0); //keep looping until x equals 0
            //print a line break
            System.out.print("\n");
        }
        
    } //end main method
    
} //end class