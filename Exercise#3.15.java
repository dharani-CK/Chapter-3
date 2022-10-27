/*
Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three￾digit integer. 
The program prompts the user to enter a three-digit integer and determines whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
*/

import java.util.Scanner; // importing scanner class
public class Lottery
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// generate a random number for lottery
		int lottery = (int)(Math.random() * 1000);
		
		// get digits from lottery
		int l1 = (lottery / 100);
		int l2 = ((lottery % 100) / 10);
	  int l3 = (lottery % 10);
		
		// prompt the user a guess number
		System.out.print("The lottery number is three-digit. Enter your guess: ");
	  int guess = input.nextInt();
	    
	   // get digits from guess
	   int g1 = (guess / 100);
	   int g2 = ((guess % 100) / 10);
	   int g3 = (guess % 10);
	    
	   //compare the lottery numbers with the guess
	    if(guess == lottery){
	        System.out.println("Exact match: you won $10,000");
	    }
	    else if(g1 == l1 && g3 == l2 && g2 == l3 ||
        g2 == l1 && g1 == l2 && g3 == l3 ||
        g2 == l1 && g3 == l2 && g1 == l3 ||
        g3 == l1 && g1 == l2 && g2 == l3 ||
        g3 == l1 && g2 == l2 && g1 == l3){
	        System.out.println("Match all digits: You won $3,000");
	    }
	    else if(g1 == l1 || g1 == l2 || g1 == l3 ||
        g2 == l1 || g2 == l2 || g2 == l3 ||
        g3 == l1 || g3 == l2 || g3 == l3){
	        System.out.println("Match one digit: You won $1,000");
	    }
	    else{
	        System.out.println("No match!");
	    }
	}
}
