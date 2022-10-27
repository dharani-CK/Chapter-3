/*
Write a program that reads three edges for a triangle and computes the perimeter if the input is valid. 
Otherwise, display that the input is invalid. The input is valid if the sum of every pair of two edges is greater than the remaining edge.
*/

import java.util.Scanner; // importing a scanner class

public class PerimeterOfTriangle
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		  // prompt the user to enter the sides of a triangle
	    System.out.print("Enter the sides of a triangle: ");
	    double side1 = input.nextDouble();
	    double side2 = input.nextDouble();
	    double side3 = input.nextDouble();
	    
	    //compute the perimeter for a valid triangle
	    double perimeter = side1 + side2 + side3;
	    
	    // check if the triangle is valid and calculate the perimeter
	    if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
	        System.out.println("The triangle is valid and the perimeter is " + perimeter + "m.");
	    }
	    else{
	        System.out.println("The triangle is not valid");
	    }
	}
}

SAMPLE OUTPUT:
Enter the sides of a triangle: 3 4 5
The triangle is valid and the perimeter is 12.0m.
