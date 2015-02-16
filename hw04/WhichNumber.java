//Alyson Givre
//Homework 4
//Problem 1

/* This program asks the user to think of a number between 1 and 10
and then attempts to guess what the number is */

import java.util.Scanner; //import scanner

public class WhichNumber {
    
    public static void main(String[] args) {
        
        //declare and construct scanner
        Scanner scan = new Scanner(System.in);
        
        //print directions
        System.out.println("Think of a number between 1 and 10 inclusive."); 
        
        //ask if number is even    
        System.out.print("Is your number even? ");
            String one = scan.nextLine();
        
        //initialize yes and no so that y/Y and n/N are acceotable answers    
        String yes = new String ("y");
        String yes2 = new String ("Y");
        String no = new String ("n");
        String no2 = new String ("N");
            
        if ( one.equals(yes) || one.equals(yes2) ) {
            //ask if divisible by 3
            System.out.print("Is it divisible by 3? ");
                String two = scan.nextLine();
                
            //if it's divisible by 3
            if ( two.equals(yes) || two.equals(yes2) ) {
                //ask if the number is 6
                System.out.print("Is your number 6? ");
                    String nineteen = scan.nextLine();
                //if number is 6
                if ( nineteen.equals(yes) || nineteen.equals(yes2) ) {
                    //print yay
                    System.out.println("Yay!");
                }
                //if number is not 6
                else if ( nineteen.equals(no) || nineteen.equals(no2) ) {
                    //print that user made a mistake
                    System.out.println("You made a mistake. Please" +
                    " try again.");
                }
                //if invalid input
                else {
                    //print that input is not valid
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            
            //if not divisble by 3
            else if ( two.equals(no) || two.equals(no2) ) {
                //ask if divisble by 4
                System.out.print("Is it divisble by 4? ");
                    String three = scan.nextLine();
                  
                //if number is divisible by 4   
                if ( three.equals(yes) || three.equals(yes2) ) {
                    //ask if # divided by 4 is greater than 1
                    System.out.print("Is the number divided by 4 greater than 1? ");
                        String four = scan.nextLine();
                        
                        //if it is greater than 1
                        if ( four.equals(yes) || four.equals(yes2) ) {
                            //ask if the number is 8
                            System.out.print("Is your number 8? ");
                                String eleven = scan.nextLine();
                            //if number is 8
                            if ( eleven.equals(yes) || eleven.equals(yes2) ) {
                                //print yay
                                System.out.println("Yay!");
                            }
                            //if number is not 8
                            else if ( eleven.equals(no) || eleven.equals(no2) ) {
                                //print that user made a mistake
                                System.out.println("You made a mistake. Please" +
                                " try again.");
                            }
                            //if invalid input
                            else {
                                //print that input is not valid
                                System.out.println("Sorry, that is not a valid input.");
                            }
                        }
                        //if it's not greater than 1
                        else if ( four.equals(no) || four.equals(no2) ) {
                            //ask if the number is 4
                            System.out.print("Is your number 4? ");
                                String ten = scan.nextLine();
                            //if number is 4
                            if ( ten.equals(yes) || ten.equals(yes2) ) {
                                //print yay
                                System.out.println("Yay!");
                            }
                            //if number is not 4
                            else if ( ten.equals(no) || ten.equals(no2) ) {
                                //print that user made a mistake
                                System.out.println("You made a mistake. Please" +
                                " try again.");
                            }
                            //if invalid input
                            else {
                                //print that input is not valid
                                System.out.println("Sorry, that is not a valid input.");
                            }
                        }
                        //if invalid input
                        else {
                            //print that input is not valid
                            System.out.println("Sorry, that is not a valid input.");  
                        }
                }
                //if number is not divisible by 4
                else if ( three.equals(no) || three.equals(no2) ) {
                    //ask if # is divisible by 5
                    System.out.print("Is it divisible by 5? ");
                        String five = scan.nextLine();
                        
                    //if number is divisible by 5
                    if ( five.equals(yes) || five.equals(yes2) ) {
                        //ask if the number is 10
                        System.out.print("Is your number 10? ");
                            String twelve = scan.nextLine();
                        //if number is 10
                        if ( twelve.equals(yes) || twelve.equals(yes2) ) {
                            //print yay
                            System.out.println("Yay!");
                        }
                        //if number is not 10
                        else if ( twelve.equals(no) || twelve.equals(no2) ) {
                            //print that user made a mistake
                            System.out.println("You made a mistake. Please" +
                            " try again.");
                        }
                        //if invalid input
                        else {
                            //print that input is not valid
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    //if not divisible by 5
                    else if ( five.equals(no) || five.equals(no2) ) {
                        //ask if number is 2
                        System.out.print("Is you number 2? ");
                            String thirteen = scan.nextLine();
                        //if number is 2
                        if ( thirteen.equals(yes) || thirteen.equals(yes2) ) {
                            //print yay
                            System.out.println("Yay!");
                        }
                        //if number is not 2
                        else if ( thirteen.equals(no) || thirteen.equals(no2) ) {
                            //print that user made a mistake
                            System.out.println("You made a mistake. Please" +
                            " try again.");
                        }
                        //if invalid input
                        else {
                            //print that input is not valid
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    //if invalid input
                    else {
                        //print that input is not valid
                        System.out.println("Sorry, that is not a valid input."); 
                    }
                }
                //if invalid input
                else {
                    //print that input is not valid
                    System.out.println("Sorry, that is not a valid input.");    
                }
                
            }
            
            //if not a valid input
            else {
                //print that input is not valid
                System.out.println("Sorry, that is not a valid input.");
            }
            
        }
        
        else if ( one.equals(no) || one.equals(no2) ) {
            //ask if divisible by 3
            System.out.print("Is it divisible by 3? ");
                String six = scan.nextLine();
            
            //if it is divisble by 3
            if ( six.equals(yes) || six.equals(yes2) ) {
                //ask if when divided by 3, result is greater than 1
                System.out.print("When divided by 3, is the result greater" +
                " than 1? ");
                    String seven = scan.nextLine();
                //if it is, number is 9
                if ( seven.equals(yes) || seven.equals(yes2) ) {
                    //ask if number is 9
                    System.out.print("Is your number 9? ");
                        String fourteen = scan.nextLine();
                    //if number is 9
                    if ( fourteen.equals(yes) || fourteen.equals(yes2) ) {
                        //print yay
                        System.out.println("Yay!");
                    }
                    //if number is not 9
                    else if ( fourteen.equals(no) || fourteen.equals(no2) ) {
                        //print that user made a mistake
                        System.out.println("You made a mistake. Please" +
                        " try again.");
                    }
                    //if invalid input
                    else {
                        //print that input is not valid
                        System.out.println("Sorry, that is not a valid input.");
                    }
                }
                //if not, number is 3
                else if ( seven.equals (no) || seven.equals(no2) ) {
                    //ask if the number is 3
                    System.out.print("Is your number 3? ");
                        String fifteen = scan.nextLine();
                    //if number is 3
                    if ( fifteen.equals(yes) || fifteen.equals(yes2) ) {
                        //print yay
                        System.out.println("Yay!");
                    }
                    //if number is not 3
                    else if ( fifteen.equals(no) || fifteen.equals(no2) ) {
                        //print that user made a mistake
                        System.out.println("You made a mistake. Please" +
                        " try again.");
                    }
                    //if invalid input
                    else {
                        //print that input is not valid
                        System.out.println("Sorry, that is not a valid input.");
                    }
                }
                //if invalid input
                else {
                    //print that input is not valid
                    System.out.println("Sorry, that is not a valid input.");
                }
            }
            //if it's not divisible by 3
            else if ( six.equals(no) || six.equals(no2) ) {
                //ask if greater than 6
                System.out.print("Is it greater than 6? ");
                    String eight = scan.nextLine();
                //if it is, the number is 7
                if ( eight.equals(yes) || eight.equals(yes2) ) {
                    //ask if the number is 7
                    System.out.print("Is your number 7? ");
                        String sixteen = scan.nextLine();
                    //if number is 7
                    if ( sixteen.equals(yes) || sixteen.equals(yes2) ) {
                        //print yay
                        System.out.println("Yay!");
                    }
                    //if number is not 7
                    else if ( sixteen.equals(no) || sixteen.equals(no2) ) {
                        //print that user made a mistake
                        System.out.println("You made a mistake. Please" +
                        " try again.");
                    }
                    //if invalid input
                    else {
                        //print that input is not valid
                        System.out.println("Sorry, that is not a valid input.");
                    }
                }
                //if it's not greater than 6
                else if ( eight.equals(no) || eight.equals(no2) ) {
                    //ask if less than 3
                    System.out.print("Is it less than 3? ");
                        String nine = scan.nextLine();
                    //if it is , the number is 1
                    if ( nine.equals(yes) || nine.equals(yes2) ) {
                        //ask if the number is 1
                        System.out.print("Is your number 1? ");
                            String seventeen = scan.nextLine();
                        //if number is 1
                        if ( seventeen.equals(yes) || seventeen.equals(yes2) ) {
                            //print yay
                            System.out.println("Yay!");
                        }
                        //if number is not 1
                        else if ( seventeen.equals(no) || seventeen.equals(no2) ) {
                            //print that user made a mistake
                            System.out.println("You made a mistake. Please" +
                            " try again.");
                        }
                        //if invalid input
                        else {
                            //print that input is not valid
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    //if not, the number is 5
                    else if ( nine.equals(no) || nine.equals(no2) ) {
                        //ask if the number is 5
                        System.out.print("Is the number 5? ");
                            String eighteen = scan.nextLine();
                        //if number is 5
                        if ( eighteen.equals(yes) || eighteen.equals(yes2) ) {
                            //print yay
                            System.out.println("Yay!");
                        }
                        //if number is not 5
                        else if ( eighteen.equals(no) || eighteen.equals(no2) ) {
                            //print that user made a mistake
                            System.out.println("You made a mistake. Please" +
                            " try again.");
                        }
                        //if invalid input
                        else {
                            //print that input is not valid
                            System.out.println("Sorry, that is not a valid input.");
                        }
                    }
                    //if invalid input
                    else {
                        //print that input is not valid
                        System.out.println("Sorry, that is not a valid input.");
                    }
                }
                //if invalid input
                else {
                    //print that input is not valid
                    System.out.println("Sorry, that is not a valid input.");
                }
                
            }
            //if invalid input
            else {
                //print that input is not valid
                System.out.println("Sorry, that is not a valid input.");
            }
            
        }

        //if not a valid input
        else {
            //print that input is not valid
            System.out.println("Sorry, that is not a valid input.");
        }
        
        
    } //end main method
    
} //end class