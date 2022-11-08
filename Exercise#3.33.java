/*
Financial: compare costs) Suppose you shop for rice in two different packages. 
You would like to write a program to compare the cost. The program prompts the 
user to enter the weight and price of each package and displays the one with the 
better price. Here is a sample run:

Enter weight and price for package 1: 50 24.59
Enter weight and price for package 2: 25 11.99
Package 2 has a better price.
*/

import java.util.Scanner; // importing scanner class

public class CompareCost
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // enter the weight and price of package 1
	    System.out.print("Enter weight and price for package 1: ");
	    double weight1 = input.nextDouble();
	    double price1 = input.nextDouble();
		
		  // enter the weight and price of package 2
	    System.out.print("Enter weight and price for package 2: ");
	    double weight2 = input.nextDouble();
	    double price2 = input.nextDouble();
	    
      // create a variable to store the value of price per weight for the packages
	    double price_Weight1 = price1 / weight1;
		  double price_Weight2 = price2 / weight2;
		
		  // check for the better rice bag
		  if (price_Weight1 < price_Weight2){
		      System.out.println("Package 1 has a better price");
		  }
		  else if (price_Weight2 < price_Weight1){
		      System.out.println("Package 2 has a better price");
		  }
		  else if (price_Weight1 == price_Weight2){
		      System.out.println("Two packages have the same price.");
		}
		
	}
}
