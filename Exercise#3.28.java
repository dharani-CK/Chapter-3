/*
This program prompts he user to enter the center x-, y-coordinates, width, and height of two rectangles and 
determines whether the second rectangle is inside the first or overlaps with the first.

SAMPLE RUN:
Enter r1’s center x-, y-coordinates, width, and height: 2.5 4 2.5 43
Enter r2’s center x-, y-coordinates, width, and height: 1.5 5 0.5 3
r2 is inside r1
*/

import java.util.Scanner; // importing scanner class

public class TwoRectangles
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter the first rectangle's center, height and width
		System.out.print("Enter r1’s center x-, y-coordinates, width, and height: ");
		double r1x = input.nextDouble();
		double r1y = input.nextDouble();
		double r1Width = input.nextDouble();
		double r1Height = input.nextDouble();
		
		// prompt the user to enter the second rectangle's center, height and width
		System.out.print("Enter r2’s center x-, y-coordinates, width, and height: ");
		double r2x = input.nextDouble();
		double r2y = input.nextDouble();
		double r2Width = input.nextDouble();
		double r2Height = input.nextDouble();
		
    // chwck the p[osition of r2 with respect to r1 and display the results
		if (((Math.pow(Math.pow(r2y - r1y, 2), .05) + r2Height / 2 <= r1Height / 2) && 
			(Math.pow(Math.pow(r2x - r1x, 2), .05) + r2Width / 2 <= r1Width / 2) &&
			(r1Height / 2 + r2Height / 2 <= r1Height) &&
			(r1Width / 2 + r2Width / 2 <= r1Width))) {
			    System.out.println("r2 is inside r1");
			}
			
		else if ((r1x + r1Width / 2 > r2x - r2Width) ||
					(r1y + r1Height / 2 > r2y - r2Height)){
					    System.out.println("r2 overlaps r1");
					}
		else{
		    System.out.println("r2 does not overlap r1");
		}
		
	}
}
