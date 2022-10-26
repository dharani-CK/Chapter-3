/*
This program randomly generates an integer between 1 and 12.
And displays the English month names January, February, . . . , December for the numbers 1, 2, . . . , 12, accordingly.
*/


public class NumbersToMonths
{
	public static void main(String[] args) {
		
		//generate random numbers between 1 and 12 inclusively
		int monthNumber = (int)((Math.random() * 12) + 1);
		
		//using "switch" statement to assign the name of the months to the month number
		switch(monthNumber){
		    case 1:
		        System.out.println(monthNumber + " - January.");
		        break;
		    case 2:
		        System.out.println(monthNumber + " - February.");
		        break;
		   case 3:
		        System.out.println(monthNumber + " - March.");
		        break;
		   case 4:
		        System.out.println(monthNumber + " - April.");
		        break;
		   case 5:
		        System.out.println(monthNumber + " - May.");
		        break;
		   case 6:
		        System.out.println(monthNumber + " - June.");
		        break;
		   case 7:
		        System.out.println(monthNumber + " - July.");
		        break;
		   case 8:
		        System.out.println(monthNumber + " - August.");
		        break;
		   case 9:
		        System.out.println(monthNumber + " - September.");
		        break;
		   case 10:
		        System.out.println(monthNumber + " - October.");
		        break;
		   case 11:
		        System.out.println(monthNumber + " - November.");
		        break;
		   case 12:
		        System.out.println(monthNumber + " - December.");
		        break;
		} //end switch statement
		
	}
}

SAMPLE OUTPUT:
11 - November.
