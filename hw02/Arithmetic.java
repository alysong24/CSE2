//Alyson Givre
//Homework 2

public class Arithmetic {
    //add main method
    public static void main (String [] args) {
    
        int nSocks = 3; //number of pairs of socks
        double sockCost$ = 2.58; //price per sock
        int nGlasses = 6; //number of glasses
        double glassCost$ = 2.29; //price per glass
        int nEnvelopes = 1; //number of boxes of envelopes
        double envelopeCost$ = 3.25; // price per box of envelope
        double taxPercent = 0.06; //tax percentage
        
        //total price of socks
        double totalSocks = nSocks * sockCost$;
        //print total sock price
        System.out.println("The total cost of the socks is $" +
            totalSocks);
        //total price of glasses
        double totalGlasses = nGlasses * glassCost$; 
        //print price of total glasses
        System.out.println("The total cost of the glasses is $" +
            totalGlasses);
        //total price of envelopes
        double totalEnvelopes = nEnvelopes * envelopeCost$; 
        //print price of total envelopes
        System.out.println("The total cost of the envelopes is $" +
            totalEnvelopes);
        //total price of all items
        double totalPrice = totalSocks + totalGlasses + totalEnvelopes;
        //print total price without tax
        System.out.println("The total cost before tax is $" + 
            totalPrice );
        
        // total tax on all items
        double totalTax = taxPercent * totalPrice;
        //change total tax to correct format
        totalTax = totalTax * 100;
        int totalTaxInt = (int) totalTax;
        double correctTotalTax = (double) totalTaxInt / 100.00;
        //print total tax
        System.out.println("The total tax is $" + correctTotalTax);
        
        //calculate total with tax
        double totalWithTax = totalPrice + correctTotalTax;
        //print total with tax
        System.out.println("The total with tax is $" + 
            totalWithTax); 
            
    } //end of main method
    
} //end class