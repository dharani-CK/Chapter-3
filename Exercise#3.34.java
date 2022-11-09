/*
Exercise 3.32 shows how to test whether a 
point is on an unbounded line. Revise Exercise 3.32 to test whether a point is on 
a line segment. Write a program that prompts the user to enter the three points for 
p0, p1, and p2 and displays whether p2 is on the line segment from p0 to p1. Here 
are some sample runs:

Enter three points for p0, p1, and p2: 1 1 2.5 2.5 1.5 1.5
(1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.5, 2.5)

Enter three points for p0, p1, and p2: 1 1 2 2 3.5 3.5
(3.5, 3.5) is not on the line segment from (1.0, 1.0) to (2.0, 2.0)

*/

import java.util.Scanner; // importing scanner class

public class PointOnLineSegment
{
	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // prompt the user to enter three points
	    System.out.print("Enter three points for p0, p1, and p2: ");
		  double x0 = input.nextDouble();
		  double y0 = input.nextDouble();
		  double x1 = input.nextDouble();
		  double y1 = input.nextDouble();
		  double x2 = input.nextDouble();
		  double y2 = input.nextDouble();
		
		  // check if the point (x2, y2) is on the line made by (x0, y0) and (x1, y1)
		  boolean condition = !(((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) > 0 ||
			                         ((x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0)) < 0 ||
			                         (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
		
		  // check the position of p2 with respect to p0 and p1
		  System.out.println("(" + x2 + ", " + y2 + ") is " + (condition ? "" : "not ") + 
		                         "on the line segment from " + "(" + x0 + ", " + y0 + ") to " +
		                             "(" + x1 + ", " + y1 + ")");
	}
}
