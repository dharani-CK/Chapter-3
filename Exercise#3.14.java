/* 
This program ets the user guess whether the flip of a coin results in heads or tails. 
The program randomly generates an integer 0 or 1, which represents head or tail. 
The program prompts the user to enter a guess, and reports whether the guess is correct or incorrect.
*/

import java.util.Scanner; // importing scanner class

public class HeadsOrTails {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// generate a random number; either 0 or 1
		int number = (int)(Math.random() * 2);
		
		// prompt the user their guess
		System.out.print("Enter your guess(0 for heads and 1 for tails): ");
		int guess = input.nextInt();
		
		
		// check whether the user guessed it right
		if(guess == number){
		    if(number == 0){
		       System.out.println("You guessed it right. It's heads!");
        }
		    else if(number == 1){
		        System.out.println("You guessed it right. It's tails!");
		    }
		}
    
		else if(guess != number){
		    if(number == 0){
		    System.out.println("Your guess is wrong. It's heads!");
		    }
		    else if(number == 1){
		        System.out.println("Your guess is wrong. It's tails!");
		    }
    }
    
	}
}

SAMPLE OUTPUT:
Enter your guess(0 for heads and 1 for tails): 1(enter->)
Your guess is wrong. It's heads!
