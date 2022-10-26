
import java.util.Scanner; //importing a scanner class

public class CurrencyCalculator{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //creating a new scanner class object
        
        //Receive the amount
        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100; 
        remainingAmount = remainingAmount % 100;
        
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        
        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;


        // Display results
        System.out.println("Your amount " + amount + " consists of");
        
        //dollars
        if(numberOfOneDollars <= 1){
            System.out.println(" " + numberOfOneDollars + " dollar");
        }
        else{
            System.out.println(" " + numberOfOneDollars + " dollars");
        }
        
        //quarters
        System.out.println(" " + numberOfQuarters + " quarters ");
        
        //dimes
        System.out.println(" " + numberOfDimes + " dimes");
        
        //nickels
        System.out.println(" " + numberOfNickels + " nickels"); 
        
        //pennies
        if(numberOfPennies <= 1){
        System.out.println(" " + numberOfPennies + " pennie");
        }
        else{
            System.out.println(" " + numberOfPennies + " pennies");
        }
	}
}
