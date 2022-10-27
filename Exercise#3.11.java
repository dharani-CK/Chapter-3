/*
This program prompts the user to enter the month and year and displays the number of days in the month. 
For example, if the user entered month 2 and year 2012, the program should display that February 2012 has 29 days. 
If the user entered month 3 and year 2015, the program should display that March 2015 has 31 days.
*/

import java.util.Scanner; // importing the scanner class

public class MonthDays
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter the month
		System.out.print("Enter a month: ");
		int month = input.nextInt();
		
		// prompt the user to enter an year
		System.out.print("Enter an year: ");
		int year = input.nextInt();
		
		int days = 0;
		String monthName = "";
		
		// using a switch statement to determine the days in a month
		switch(month){
		    case 1: 
		        days = 31;
		        monthName = "January";
		        break;
		    case 2: 
		        if(year % 4 == 0){
		            days = 29;
		        }
		        else{
		            days = 28;
		        }
		        monthName = "February";
		        break;
		    case 3: 
		        days = 31;
		        monthName = "March";
		        break;
		    case 4: 
		        days = 30;
		        monthName = "April";
		        break;
		    case 5: 
		        days = 31;
		        monthName = "May";
		        break;
		    case 6: 
		        days = 30;
		        monthName = "June";
		        break;
		    case 7: 
		        days = 31;
		        monthName = "July";
		        break; 
		    case 8: 
		        days = 31;
		        monthName = "August";
		        break;
		    case 9: 
		        days = 30;
		        monthName = "September";
		        break;
		    case 10: 
		        days = 31;
		        monthName = "October";
		        break;
		    case 11: 
		        days = 30;
		        monthName = "November";
		        break;
		    case 12: 
		        days = 31;
		        monthName = "December";
		        break;
		} // end switch
		
		// display the results
		System.out.println(monthName + " " + year + " has " + days + " days.");
		
	}
}

SAMPLE OUTPUT: 
Enter a month: 3
Enter an year: 2015
March 2015 has 31 days.
