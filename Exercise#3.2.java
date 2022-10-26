/*
This program generates three random numbers and prompts the user to enter the sum of these three random integers.
Then, it checks whether the input is same as the sum and tells the user
*/

import java.util.Scanner; //importing a new scanner class

public class AdditionQuiz
{
	public static void main(String[] args) {
    
	    Scanner input = new Scanner(System.in); //creating a new scanner class object
	    
	    //generating three random numbers
	    int number1 = (int)(Math.random() * 10);
	    int number2 = (int)(Math.random() * 10);
	    int number3 = (int)(Math.random() * 10);
	    
	    //creating a new variable to add the three random numbers
	    int sum = number1 + number2 + number3; 
		
		  //prompt the user to enter the sum of the numbers
		  System.out.print("Enter " + number1 + " + " +  number2 + " + " + number3 + ": ");
		  int answer = input.nextInt();
		
		  //check if answer = user's input
		  if(answer == sum){
		      System.out.println("That is correct. Keep it up!");
		  }
		  else{
		      System.out.println("The answer is " + sum + ". Better luck next time!");
		   }
    }
}

