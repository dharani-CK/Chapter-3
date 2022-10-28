/* 
This program prompts the user to enter four points and displays the intersecting point. 
*/

import java.util.Scanner; // importing a scanner class

public class IntersectingPoint
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter the coordinates
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		// Calculate the intersecting point
		// Get a, b, c, d, e, f of the equations
		double a = y1 - y2;
		double b = -1 * (x1 - x2);
		double c = y3 - y4;
		double d = -1 * (x3 - x4);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		// calculate for the intersecting point
		double x = (e * d - b * f) / (a * d - b *c);
		double y = (a * f - e * c) / (a * d - b * c);
		
		//display the results
		if(a * d - b * c == 0){
		    System.out.println("The two lines are parallel");
		}
		else{
		    System.out.println("The intersecting point is at (" + x + ", " + y + ")");
		}
		
	}
