/*
ax+by+c=0
dx+ey+f=0
This program computes and displays the solutions of a 2x2 linear equation.
This program promts the user to enter a, b, c, d, e, and f and displays the result. 
If ad - bc is 0, it reports that “The equation has no solution.”
*/

import java.util.Scanner; //importing a scanner class

public class LinearEquationCalculator
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); //creating a new scanner class object
		
		//prompt the user to enter the coeffients of the linear equation
		System.out.print("Enter a, b, c, d, e and f: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		//create and compute the variables and solutions for the equation
		double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
		double y = ((a * f) - (e * c)) / ((a * d) - (b * c));
		
		//check whether the equation has solutions or not and display the solutions
		if((a * d) - (b * c) == 0){
		    System.out.println("The equation has no solution");
		}
		else{
		    System.out.println("x is " + x + ", y is " + y + ".");
		}
		
	}
}
