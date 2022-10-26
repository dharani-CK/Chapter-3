/*
This program prompts the user to enter an integer for today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). 
Also prompt the user to enter the number of days after today for a future day and display the future day of the week.
*/

import java.util.Scanner; //importing a scanner class

public class FutureDays{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //creating a new scanner class object

        //prompt the user to enter today's day
        System.out.printf("Enter today's day: ");
        int today = input.nextInt();
        
        //prompt the user to enter the elapsed days
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsedDays = input.nextInt();

        int futureDay = (today + elapsedDays) % 7;
        String dayOfWeek = "";

        switch(today){
            case 0: dayOfWeek = "Sunday";
                    break;
            case 1: dayOfWeek = "Monday";
                    break; 
            case 2: dayOfWeek = "Tuesday";
                    break;
            case 3: dayOfWeek = "Wednesday";
                    break;
            case 4: dayOfWeek = "Thursday";
                   break;
            case 5: dayOfWeek = "Friday";
                    break;
            case 6: dayOfWeek = "Saturday";
                    break;
        }

        if (futureDay == 0){
            System.out.printf("Todays is %s and the future day is Sunday", dayOfWeek);
        }
      else if(futureDay == 1){
            System.out.printf("Todays is %s and the future day is Monday", dayOfWeek);
        }
      else if(futureDay == 2){
            System.out.printf("Todays is %s and the future day is Tuesday", dayOfWeek);
        }
      else if(futureDay == 3){
            System.out.printf("Todays is %s and the future day is Wednesday", dayOfWeek);
        }
      else if(futureDay == 4){
            System.out.printf("Todays is %s and the future day is Thursday", dayOfWeek);
        }
      else if(futureDay == 5){
            System.out.printf("Todays is %s and the future day is Friday", dayOfWeek);
        }
      else if(futureDay == 6){
            System.out.printf("Todays is %s and the future day is Saturday", dayOfWeek);
        }
    }
}
