/*
This program prompts the user to enter a point (x, y) and checks whether the point is within the circle centered at (0, 0) with radius 10. 
For example, (4, 5) is inside the circle and (9, 9) is outside the circle.
*/

import java.util.Scanner; // importing a scanner class

public class PointInACircle {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// create variables to store the coordiantes of the center of the circle and radius
		double x = 0;
	  double y = 0;
		double radius = 10;
		
		// prompt the user to enter a point with coordinates
		System.out.print("Enter a point with two coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// compute the distance between the center and entered coordiantes
		double d = ((x1 - x) * (x1 - x)) + ((y1 - y) * (y1 - y));
		double distance = Math.pow(d, 0.5);
		
		// determine the position of the point
		if(distance == radius){
		    System.out.println("Point (" + x1 + ", " + y1 + ") is on the circle.");
		}
		else if(distance > radius){
		    System.out.println("Point (" + x1 + ", " + y1 + ") outside the circle.");
		}
		else if(distance < radius){
		    System.out.println("Point (" + x1 + ", " + y1 + ") is in the circle.");
		}
		else{
		    System.out.println("Error!");
		}
		
	}
}


SAMPLE OUTPUT:
Enter a point with two coordinates: 9 9
Point (9.0, 9.0) outside the circle.
