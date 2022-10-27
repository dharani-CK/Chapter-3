/*
Programming Exercise 2.17 gives a formula to compute the wind-chill temperature. 
The formula is valid for temperatures in the range between -58°F and 41°F and wind speed greater than or equal to 2. 
Write a program that prompts the user to enter a temperature and a wind speed. 
The program displays the wind-chill temperature if the input is valid. 
otherwise, it displays a message indicating whether the temperature and/or wind speed is invalid.
*/

import java.util.Scanner; // importing a scanner class

public class WindChillTemperature
{
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		// prompt the user to enter the temperature
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		double temp = input.nextDouble();
		
		// prompt the user to enter the wind speed
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double windSpeed = input.nextDouble();
		
		// calculate the wind-chill temperature
		double v = Math.pow(windSpeed, 0.16);
		double windChill = 35.74 + (0.6215 * temp) - (35.75 * v) + (0.4275 * temp * v);
		
		// display the results
		if(temp > -58 && temp < 41 && windSpeed >= 2){
		    System.out.println("The wind chill index is " + windChill);
		}
		else{
		    System.out.println("The data entered is invalid.");
		}
	}
}
