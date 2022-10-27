import java.util.Scanner; // importing the scanner class

public class AdditionQuiz {
	public static void main(String[] args) {
    
		Scanner input = new Scanner(System.in); // creating a new scanner class object
		
		//generate two random numbers less than 100
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		
		//add number1 and number2
		int result = number1 + number2;
		
		//display the question
		System.out.print("What is " + number1 + " + " + number2 + "? ");
		int answer = input.nextInt();
		
		//check whether the answer is right or wrong
	    if(answer == result){
	        System.out.println("You are correct. Keep it up!");
	    }
	    else{
	        System.out.println("You are wrong. Try again!");
	    }
	}
}

SAMPLE OUTPUT:
What is 47 + 87? 45(enter)->
You are wrong. Try again!
