/*
This program prompts the user to enter a point (x, y) and checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5.
*/

import java.util.Scanner; // importing a scanner class

public class PointInARectangle
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		
		// center of rectangle
		double x = 0;
		double y = 0;
		
		// prompt the user to enter the coordinates
		System.out.print("Enter a point with two coordinates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		// check whether the point is in the rectangle 
		boolean pointRectangle = ((Math.pow(Math.pow(x1, 2), 0.5)) <= 10.0 / 2) && 
		                                ((Math.pow(Math.pow(y1, 2), 0.5)) <= 5.0 / 2);
		
		//display the results
		System.out.println("Point (" + x1 + ", " + y1 + ") " + 
		                      ((pointRectangle) ? "is " : "is not " ) + "in the rectangle");
		
	}
}

SAMPLE RUN:
Enter a point with two coordinates: -4.9 2.49
Point (-4.9, 2.49) is in the rectangle
