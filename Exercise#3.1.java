/* 
This program prompts the user to enter values for a, b, and c and displays the result based on the discriminant. 
If the discriminant is positive, display two roots. 
If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots.”
*/

import java.util.Scanner; //importing a scanner class

public class QuadraticEquation
{
	public static void main(String[] args) {
    
	    Scanner input = new Scanner(System.in); //creating a new scanner class object
	    
	    //prompt the user to enter a, b and c as (ax^2 + bx + c = 0)
	    System.out.print("Enter a, b, c: ");
	    double a = input.nextDouble();
	    double b = input.nextDouble();
	    double c = input.nextDouble();
		  
		  //calculating the roots of the quadratic equation
		  double discriminant = ((b * b) - (4 * a * c)); //assigning the value for discriminant
		  double d = Math.pow(discriminant, 0.5); //square root of (b^2-4ac)
		  double root1 = ((-1 * b) + d) / (2 * a);
		  double root2 = ((-1 * b) - d) / (2 * a);
		
		  //checking whether the equation has real roots or not
		  if(discriminant > 0){
		      System.out.println("The equation has two roots " + root1 + " and " + root2 + ".");
		  }
		  else if(discriminant == 0){
		      System.out.println("The equation has one root " + root1 + ".");
		  }
		  else if(discriminant < 0){
		      System.out.println("The equation has no real roots");
		  }
		
    }
}
