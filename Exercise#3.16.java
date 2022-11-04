/*
This program displays a random coordinate in a rectangle. 
The rectangle is centered at (0, 0) with width 100 and height 200.
*/

public class RandomPoint
{
	public static void main(String[] args) 
  {    
	    // generate random numbers
	    int x = (int)((Math.random() * (50 + 50)) -50);
	    int y = (int)((Math.random() * (100 + 100)) - 100);
	    
	    //display the coordinates
	    System.out.println("The random point is (" + x + ", " + y + ")");	   
		
	}
}
