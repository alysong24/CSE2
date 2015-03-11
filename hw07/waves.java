//Alyson Givre
//Homework 7

/* This program asks the user to enter a number between 1 and 30 and then prints
a wave pattern up to that number */

import java.util.Scanner; //import scanner

public class waves {
    
    public static void main(String[] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //initialize number value
        int number = -1;
        
        //ask user to enter number
        System.out.print("Enter a number between 1 and 30: ");
        
        //check if number is an int
        while(!scan.hasNextInt()) {
            //print that input is invalid
            System.out.print("Invalid input. Enter again: ");
            //scan for next input
            scan.next();
        }
        //initialize number value
        number = scan.nextInt();
        //check if number is between 1 and 30
        while(number < 1 | number > 30) {
            //if number is not between 1 and 30
            if (number < 1 | number > 30) {
                //print that input is invalid
                System.out.print("Invalid input. Enter again: ");
            }
            //check if number is an int
            while(!scan.hasNextInt()) {
                //print that input is invalid
                System.out.print("Invalid input. Enter again: ");
                //scan for next input
                scan.next();
            }
            //initialize number value
            number = scan.nextInt();
        }
        
        //print line break
        System.out.println();
        
        //wave pattern using for loops
        System.out.println("FOR LOOP:");
        for(int i = 1; i <= number; i++) {
            //if i equals 1
            if(i == 1) {
                //print i
                System.out.println(i);
                //exit iteration of loop
                continue;
            }
            //if i does not equal 1
            for(int j = 1; j <= i; j++) {
                //if i is even
                if (i % 2 == 0) {
                    //print pattern using loop
                    for(int k = 1; k <= j; k++) {
                        //print i
                        System.out.print(i);
                    }
                    //print a line break
                    System.out.print("\n");
                }
                //if i is odd
                else {
                    //print pattern using loop
                    for(int l = i; l >= j; l--) {
                        //print i
                        System.out.print(i); 
                    }
                    //print a line break
                    System.out.print("\n");
                }
                
            }
            
        }
        //line break
        System.out.println();
        
        //wave pattern using while loops
        System.out.println("WHILE LOOP:");
        //initialize variables
        int a = 1;
        int b = 1;
        int c = 1;
        int counterEven = 1;
        int counterOdd = 2;
        
        while(a <= number) {
            //if a equals 1
            if (a == 1) {
                //print a 
                System.out.println(a);
                //increase a by one
                a++;
                //exit iteration of loop
                continue;
            }
            //if a does not equal 1
            while(b <= a) {
                //if a is even
                if(a % 2 == 0) {
                    //print pattern
                    while (c <= counterEven) {
                       //print a
                       System.out.print(a);
                       //increase c by one
                       c++;
                    }
                    //reset c
                    c = 1;
                    //increase counter by one
                    counterEven++;
                    //increase b by one
                    b++;
                    //print a line break
                    System.out.print("\n");
                }
                //if odd
                else {
                    while(c <= counterOdd) {
                        //print a 
                        System.out.print(a);
                        //decrease c by one
                        c++;
                    }
                    //reset c
                    c = 1;
                    //decrease counter by one
                    counterOdd--;
                    //increase b by one
                    b++;
                    //print a line break
                    System.out.print("\n");
                }
                
            }
            //increase a by one
            a++;
            //reset b, c and counters
            b = 1;
            c = 1;
            counterEven = 1;
            counterOdd = a;
        }
        //print line
        System.out.println();
        
        
        //initilize variables
        int d = 1;
        int e = 1;
        int f = 1;
        int even = 1;
        int odd = 1;
        
        //wave pattern using do-while loops
        System.out.println("DO-WHILE LOOP:");
        do {
            //if d equals 1
            if(d == 1) {
                //print d
                System.out.println(d);
                //increase d by one
                d++;
                //exit iteration of loop
                continue;
            }
            //if d does not equal 1
            do {
                //if d is even
                if(d % 2 == 0) {
                    //print pattern
                    do {
                        //print d
                        System.out.print(d);
                        //increase f by one
                        f++;
                    } while(f <= even);
                    //reset f
                    f = 1;
                    //increase counter by one
                    even++;
                    //increase e by one
                    e++;
                    //print a line break
                    System.out.print("\n");
                    //if d is odd
                }
                //if d is odd
                else {
                    //print pattern
                    do{
                        //print d
                        System.out.print(d);
                        //increase f by one
                        f++;
                    } while(f <= odd);
                    //reset f
                    f = 1;
                    //decrease counter by one
                    odd--;
                    //increase e by one
                    e++;
                    //print a line break
                    System.out.print("\n");
                }
            } while(e <= d);

            //increase d by one
            d++;
            //reset e, f, and counters
            e = 1;
            f = 1;
            even = 1;
            odd = d;
        } while (d <= number);
        
        
    } //end main method
    
} //end class