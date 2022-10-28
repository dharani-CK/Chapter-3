/*
This program prompts the user to enter an integer and determines whether it is divisible by 5 and 6, whether it is 
divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both.
*/

import java.util.Scanner; // importing a scanner class

public class Divisibilty
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter an integer
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		// check the divisibility of the number
		boolean x = ((number % 5 == 0) && (number % 6 == 0));
		boolean y = ((number % 5 == 0) || (number % 6 == 0));
		boolean z = ((number % 5 == 0) ^ (number % 6 == 0));
		
		// display the results
		System.out.println("Is " + number + " divisible by 5 and 6? " + x);
		System.out.println("Is " + number + " divisible by 5 or 6? " + y);
		System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + y);
		    
		
	}
}

SAMPLE RUN:
Enter an integer: 10 enter->
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true
