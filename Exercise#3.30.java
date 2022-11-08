/*
This program prompts the user to enter the time zone and then displays the time in 12-hour format.

SAMPLE RUN:
Enter the time zone offset to GMT: −5
The current time is 4:50:34 AM
*/

import java.util.Scanner; // importing scanner class

public class CurrentTime
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	  // prompt the user to enter the time zone 
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		// obtain the total milli seconds since midnight, January 1, 1970
		long totalMilliSeconds = System.currentTimeMillis();
		
		// obtain the total seconds since midnight, January 1, 1970
		long totalSeconds = totalMilliSeconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		currentHour += offset;
		
		
		// convert the 24 hour format to 12 hour format
		// display the time
		if (currentHour <= 12) {
		    System.out.println("The current time is " + currentHour + 
		                       ":" + currentMinute + ":" + currentSecond + " AM");
		}
		else{
		    currentHour = currentHour % 12;
		    System.out.println("The current time is " + currentHour + 
		                       ":" + currentMinute + ":" + currentSecond + " PM");
		}
		
		
		
	}
}
