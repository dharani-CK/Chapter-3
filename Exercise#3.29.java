/*
This program prompts the user to enter the center coordinates and radii of two circles and 
determines whether the second circle is inside the first or overlaps with the first.

SAMPLE RUN:
Enter circle1’s center x-, y-coordinates, and radius: 0.5 5.1 13
Enter circle2’s center x-, y-coordinates, and radius: 1 1.7 4.5
circle2 is inside circle1

*/

import java.util.Scanner; // importing scanner class

public class TwoCircles
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter the first circle's center and radius
		System.out.print("Enter circle1's center x-, y-coordinates, and radius: ");
		double c1x = input.nextDouble();
		double c1y = input.nextDouble();
		double c1Radius = input.nextDouble();
		
		// prompt the user to enter the second circle's center and radius
		System.out.print("Enter circle2's center x-, y-coordinates, and radius: ");
		double c2x = input.nextDouble();
		double c2y = input.nextDouble();
		double c2Radius = input.nextDouble();
		
		double distance = Math.pow((c2x - c1x) * (c2x - c1x) + (c2y - c1y) * (c2y - c1y), 0.5); // distance between the centers of the circle
		
		// check the position of circle 2 with respect to circle 1
		if (distance <= (c1Radius - c2Radius)) {
		    System.out.println("circle2 is inside circle1");
		}
		else if (distance <= (c1Radius + c2Radius)) {
		    System.out.println("circle2 overlaps circle1");
		}
		else {
		    System.out.println("circle2 does not overlap circle1");
		}
    
		
	}
}
