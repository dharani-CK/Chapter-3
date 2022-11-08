/*
Write a program that prompts the user to enter 
the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the 
user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert 
from Chinese RMB to U.S. dollars. Prompt the user to enter the amount in U.S. 
dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively. 

Here are the sample runs:
Enter the exchange rate from dollars to RMB: 6.81
Enter 0 to convert dollars to RMB and 1 vice versa: 0
Enter the dollar amount: 100
$100.0 is 681.0 yuan
*/

import java.util.Scanner; // importing scanner class

public class CurrencyExchange
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // prompt the user to enter the exchange rate 
	    System.out.print("Enter the exchange rate from dollars to RMB: ");
	    double exchangeRate = input.nextDouble();
	    
	    // prompt the user to enter either 1 or 0 for the conversion between dollars and RMB
	    System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	    int conversion = input.nextInt();
	    
	    double Amount;
	    
	    // prompt the user to enter the amount
	    // convert the dollars into RMB and vice versa
	    if (conversion == 0){
	        System.out.print("Enter the dollar amount: ");
	        double dollarAmount = input.nextDouble();
	        Amount = exchangeRate * dollarAmount;
	        System.out.println("$" + dollarAmount + " is " + Amount + " yuan");
	    }
	    else if (conversion == 1){
	        System.out.print("Enter the RMB amount: ");
	        double rmbAmount = input.nextDouble();
	        Amount = rmbAmount / exchangeRate;
	        System.out.println(rmbAmount + " yuan is $" + Amount);
	    }
	    else{
	        System.out.println("Incorrect Input");
	    }
		
		
		
	}
}
