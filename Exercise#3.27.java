/*
This program prompts the user to enter a point with x- and y-coordinates and determines whether the point is inside the triangle. 
*/


import java.util.Scanner; // importing a scanner class

public class PointInATriangle
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter the coordinates
		System.out.print("Enter the point's x- and y-coordinates :");
		double x = input.nextDouble();
		double y = input.nextDouble();
		
		// get the intersecting point to determine its position
		double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);
		
		// display the results
		System.out.println("The point " + ((x > intersectx || y > intersecty) ? "is not " : "is " ) + "in the triangle");
		    
		
	}
}
