/* 
This program prompts the user to enter three integers and display the integers in non-decreasing order.
*/

import java.util.Scanner; //importing a scanner class

public class NonDecreasingOrder{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //creating a new scanner class object
        
        //prompt the user to enter three integers
        System.out.print("Enter three integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        
        
        // Sort the numbers
        int temp;
		    if (number2 < number1 || number3 < number1){
			    if (number2 < number1){
				    temp = number1;
				    number1 = number2;
				    number2 = temp; 
			    }
			    if (number3 < number1){
				    temp = number1;
				    number1 = number3;
				    number3 = temp;
			    }
		    }
		
		   if (number3 < number2){
			    temp = number2;
			    number2 = number3;
			    number3 = temp;
		    }
		    
		    // Display numbers in non-decreasing order
		    System.out.println("The non-decreasing order:");
		    System.out.println(number1 + " " + number2 + " " + number3);
	}
}
