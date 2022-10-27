/*
Game: scissor, rock, paper) Write a program that plays the popular scissor–rock–paper game. 
(A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.) 
The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws.
*/

import java.util.Scanner; // importing scanner class

public class RockPaperScissor {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// generate random numbers between 0 to 2 inclusively
		int game = (int)(Math.random() * 3);
		
		// prompt the user to enter rock, paper or scissor
		System.out.print("scissor (0), rock (1), paper (2): ");
		int userInput = input.nextInt();
		
		// play the rock, paper, scissor game with the computer
		System.out.print("The computer is ");
		switch(game)
		{
			case 0: System.out.print("scissor. "); 
			        break;
			case 1: System.out.print("rock. "); 
			        break;
			case 2: System.out.print("paper. ");
		}
		
		System.out.print("You are ");
		switch(userInput){
		    case 0: System.out.print("scissor. "); 
		            break;
		    case 1: System.out.print("rock. ");
		            break;
		    case 2: System.out.print("paper. ");
		}
		
		if(userInput == game){
		    System.out.print("It is a draw");
		}
		else {
			boolean win = (userInput == 0 && game == 2) ||
							  (userInput == 1 && game == 0) || 
							  (userInput == 2 && game == 1);
			if (win)
				System.out.println("You won");
			else
				System.out.println("You lose");
		}
    
	}
}
