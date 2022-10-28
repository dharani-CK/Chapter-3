/* 
This program simulates picking a card from a deck of 52 cards. 
Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
*/

public class PickACard
{
  public static void main (String[]args)
  {

    Scanner input = new Scanner (System.in);	// creating a scanner class object

    // generate 1-13 random numbers for the rank cards
    int rankCards = (int) ((Math.random () * 13) + 1);

    // generate 4 random numbers for the suit cards
    int suitCards = (int) ((Math.random () * 4) + 1);

    // display the card
      System.out.print ("The card you picked is ");

    switch(rankCards){ // pick rank cards
			case 1: 
			    System.out.print("Ace"); 
			    break;
			case 2: 
			    System.out.print(rankCards); 
			    break;
			case 3: 
			    System.out.print(rankCards); 
			    break;
			case 4: 
			    System.out.print(rankCards); 
			    break;
			case 5: 
			    System.out.print(rankCards); 
			    break;
			case 6: 
			    System.out.print(rankCards); 
			    break;
			case 7: 
			    System.out.print(rankCards); 
			    break;
			case 8: 
			    System.out.print(rankCards); 
			    break;
			case 9: 
			    System.out.print(rankCards); 
			    break;
			case 10: 
			    System.out.print(rankCards); 
			    break;
			case 11: 
			    System.out.print("Jack"); 
			    break;
			case 12: 
			    System.out.print("Queen"); 
			    break;
			case 13: 
			    System.out.print("King"); 
		} // end switch statement
		
		System.out.print(" of ");
		
		switch(suitCards){ // pick suit cards
		    case 1:
		        System.out.print("Clubs");
		        break;
		   case 2:
		        System.out.print("Diamonds");
		        break;
		   case 3:
		        System.out.print("Hearts");
		        break;
		   case 4:
		        System.out.print("Spades");
		        break;
		} // end switch statement
		
  }
}
