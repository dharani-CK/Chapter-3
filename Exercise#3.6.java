/* This program lets a user enter weight, feet, and inches and calculates the BMI
Also, it tells whether the person is underweight, normal or obese according to the BMI.
*/

import java.util.Scanner; //importing a scanner class

public class BMI{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in); //creating a new scanner class object
        
        final double KILOGRAMS_PER_POUND = 0.45359237; // Constant
        final double METERS_PER_INCH = 0.0254;  // Constant
        final double FEET_PER_INCH = 0.0833333; // Constant
 
        // Prompt the user to enter weight in pounds
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompt the user to enter feet
        System.out.print("Enter feet: ");
        double feet = input.nextDouble();

        //prompt the user to enter inches
        System.out.print("Enter inches: ");
        double inches = input.nextDouble();
        
        //converting inches into feet
        double feetToInches = feet / FEET_PER_INCH;

        // Compute BMI
        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = (inches + feetToInches) * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // Display result
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5){
             System.out.println("Underweight");
        }
        else if (bmi < 25){
             System.out.println("Normal");
        }
        else if (bmi < 30){
             System.out.println("Overweight");
        }
        else{
             System.out.println("Obese");
        }
		
	}
}

SAMPLE OUTPUT:
Enter weight in pounds: 140
Enter feet: 5
Enter inches: 10
BMI is 20.08768850098171
Normal
