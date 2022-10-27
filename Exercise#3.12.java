/*
This program prompts the user to enter a three-digit integer and checks if that number is a plaindrome.
Then, displays the results.
                          Enter a three-digit integer: 121
                          121 is a palindrome
                          
                          Enter a three-digit integer: 123
                          123 is not a palindrome
*/

import java.util.Scanner; // importing the scanner class

public class PalindromeChecker {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter a three digit integer
		System.out.print("Enter a three-digit integer: ");
		int number = input.nextInt();
		
		// extract the digits from the entered number
		int digit1 = number / 100; 
		int digit3 = number % 10;
		
		// for a three-digit palindrome the 1st and 3rd digit should be equal
		// check if the number is palindrome
		if(digit1 == digit3){
		    System.out.println(number + " is a palindrome.");
		}
		else{
		    System.out.println(number + " is not a palindrome.");
		}
		
	}
}

SAMPLE OUTPUT:
Enter a three-digit integer: 121(enter->)
121 is a palindrome.
