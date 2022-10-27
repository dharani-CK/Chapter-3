/* 
This program prompts the user to enter the weight of the package and displays the shipping cost. 
If the weight is negative or zero, display a message “Invalid input.” 
If the weight is greater than 20, display a message “The package cannot be shipped.”
*/

import java.util.Scanner; // importing scanner class

public class CostOfShipping {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// prompt the user to enter the weight of the package
		System.out.print("Enter the weight of the package: ");
		double weight = input.nextDouble();
		
		// check the cost to deliver the package
		if(weight > 0 && weight <= 1){
		    System.out.println("The cost to ship your package is $3.5");
		}
		else if(weight > 1 && weight <= 3){
		    System.out.println("The cost to ship your package is $5.5");
		}
		else if(weight > 3 && weight <= 10){
		    System.out.println("The cost to ship your package is $8.5");
		}
		else if(weight > 10 && weight <= 20){
		    System.out.println("The cost to ship your package is $10.5");
		}
		else if(weight <= 0){
		    System.out.println("Invalid input");
		}
		else if(weight > 20){
		    System.out.println("The package cannot be shipped");
		}
    
	}
}
