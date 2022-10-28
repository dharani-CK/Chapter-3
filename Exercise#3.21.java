/*
This program prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week using Zeller's formula:
                         h = (q + 26(m+1)/10 + k + k/4 + j/4 +5j) % 7
*/

import java.util.Scanner; // importing a scanner class

public class DayOfTheWeek {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // creating a scanner class object
		
		// prompt the user to enter year
		System.out.print("Enter year (e.g., 2012): ");
		int year = input.nextInt();
		
		
		// prompt the user to enter a month
		System.out.print("Enter a month (1-12): ");
		int month = input.nextInt();
		
		
		// prompt the user to enter the day of month
		System.out.print("Enter the day of the month (1-31): ");
		int dayMonth = input.nextInt();
		
		
		// change the year if the month is January / February
		if(month == 1 || month == 2){   
		    year = year - 1;
		}
		
		// change the number of month if it is either January / February
		if(month == 1){
		    month = 13;
		}
		else if(month == 2){
		    month = 14;
		}
		
		
		// calculate year of the century from the year
		int yearCentury = year % 100;
		int j = year / 100;
		
		
		// compute for the day of the week
		int dayWeek = (dayMonth + (26 * ((month+1)) / 10) + 
		                  yearCentury + (yearCentury / 4) + (j / 4) + (5 * j)) % 7;
		                  
		
		// create switch statement to display day of the week
		switch(dayWeek){
		    case 0:
		        System.out.println("Day of the week is Saturday");
		        break;
		    case 1:
		        System.out.println("Day of the week is Sunday");
		        break;
		    case 2:
		        System.out.println("Day of the week is Monday");
		        break;
		    case 3:
		        System.out.println("Day of the week is Tuesday");
		        break;
		    case 4:
		        System.out.println("Day of the week is Wednesday");
		        break;
		    case 5:
		        System.out.println("Day of the week is Thursday");
		        break;
		    case 6:
		        System.out.println("Day of the week is Friday");
		        break;
		} // end switch statement
		
		
	}
}

SAMPLE OUTPUT:
Enter year (e.g., 2012): 2015 enter->
Enter a month (1-12): 1 enter->
Enter the day of the month (1-31): 25 enter->
Day of the week is Sunday

