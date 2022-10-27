/* 
This program prompts the user to enter the first nine digits of an ISBN and then calculates the tenth digit using a formula:
                           d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11
If the check-sum(d10) = 10, then the tenth digit will be "X" or else it will be the d10.
*/

import java.util.Scanner; // importing the scanner class

public class IsbnCalculator{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter the first nine integers of an ISBN
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		int nineDigitsOfIsbn = input.nextInt();
		
		// calculate the digits of the ISBN
		int d1 = nineDigitsOfIsbn / 100000000;
		int remainingDigits = nineDigitsOfIsbn % 100000000;
		int d2 = remainingDigits / 10000000;
		remainingDigits %= 10000000;
		int d3 = remainingDigits / 1000000;
		remainingDigits %= 1000000;
		int d4 = remainingDigits / 100000;
		remainingDigits %= 100000;
		int d5 = remainingDigits / 10000;
		remainingDigits %= 10000;
		int d6 = remainingDigits / 1000;
		remainingDigits %= 1000;
		int d7 = remainingDigits / 100;
		remainingDigits %= 100;
		int d8 = remainingDigits / 10;
		remainingDigits %= 10;
		int d9 = remainingDigits;

		
		
		//compute the 10-digit of ISBN
		int d10 = ((d1 * 1) + (d2 * 2) + (d3 * 3) + (d4 * 4) + (d5 * 5) + (d6 * 6) + (d7 * 7) + (d8 * 8) + (d9 * 9))%11;
	    
	    //check if d10 == 10
	    if(d10 == 10){
	        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + "X");
	    }
	    else{
	        System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10);
	    }
	    
	}
}

SAMPLE OUTPUT:
Enter the first 9 digits of an ISBN as integer: 013031997
The ISBN-10 number is 013031997X

