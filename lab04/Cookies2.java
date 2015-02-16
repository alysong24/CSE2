import java.util.Scanner; //import scanner


public class Cookies2 {
    
    public static void main (String [] args) {
        
        //declare and construct scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user to enter the number of people
        System.out.print("Enter the number of people: ");
        
        //check if # of people is an integer
        if (myScanner.hasNextInt()) {
            int nPeople = myScanner.nextInt();
            
            //check if # of people is greater than 0
            if (nPeople > 0) {
                
                //ask for number of cookies
                System.out.print("Enter the number of cookies you" +
                " are planning to buy: ");
                
                //check if # of cookies is an int    
                if(myScanner.hasNextInt()) {
                    int nCookies = myScanner.nextInt();
                    //check if # is greater than 0
                    if (nCookies > 0) {
                        
                        //ask for # each
                        System.out.print("How many do you want each" +
                        " person to get? ");
                            int nEach = myScanner.nextInt();
                            
                        //check if number is positive
                        if (nEach >= 0) {
                            
                            //divide evenly case
                            if ( (double) ( nCookies / (nPeople * nEach) ) == 1.0 
                            || nEach == 0 ) {
                                //print that they will divide evenly
                                System.out.println("You have enough cookies " +
                                "for each person and the amount will divide" +
                                " evenly.");
                            }
                            
                            //not divide evenly case
                            else if ( (double) ( nCookies / (nPeople * nEach) ) 
                            != 1.0 && nCookies > (nPeople * nEach)) {
                                //print that they won't divide evenly
                                System.out.println("you have enough, but they" +
                                " will not divide evenly.");
                            }
                            
                            //not enough case
                            else {
                                //calculate how many more needed
                                int nMore = (nEach * nPeople) - nCookies;
                                //print how many more
                                System.out.println("You will not have enough " +
                                "cookies. You need to but at least " + nMore +
                                " more.");
                            }
                            
                        }
                        
                        //if not positive
                        else {
                            //print that # was not > 0
                            System.out.println("You did not enter an " +
                            "int > 0.");
                            //terminate program
                            return;
                        }
                        
                    }
                    
                    //if not greater than 0
                    else {
                        //print that # is not greater than 0
                        System.out.println("You did not enter an int" +
                        " > 0.");
                        //terminate program
                        return;
                    }
                }
                    
                //if # of cookies is not an int
                else {
                    //print that # is not an int
                    System.out.println("You did not enter an int.");
                    //terminate program
                    return;
                }
                
            }
            
            //if # of people is not greater than 0
            else {
                System.out.println("You did not enter an int > 0.");
                //terminate program
                return;
            }
            
            
        }
        
        //if # of people is not an integer
        else {
            //print that # is not an integer
            System.out.println("You did not enter an int.");
            //terminate program
            return;
        }
        
        
    } //end main method
    
} //end class