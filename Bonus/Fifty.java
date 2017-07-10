public class Fifty
{
    //dice rolling game.
    //all doubles except 3s and 6s score 5 points
    // 6s score a whopping 25 points
    // 3s wipe out your score
    //first player to 50 points wins.

    public static void main (String args[])
    {
	new Fifty ();
    }


    public Fifty ()
    { //set up variables
	int total1, total2;
	String name1 = IBIO.inputString ("Enter player one's name: ");
	String name2 = IBIO.inputString ("Enter player two's name: ");
	char continu = 'y';

	//play again loop
	while (continu == 'y')
	{ //reset socres
	    total1 = 0;
	    total2 = 0;
	    //one game loop, until someone wins
	    while (total1 < 50 && total2 < 50)
	    { //one turn, then the other turn if player1 doesn't win
		total1 = turn (total1, name1);
		if (total1 < 50)
		    total2 = turn (total2, name2);
	    }
	    //once out of loop, someone won
	    winner (total1, name1, total2, name2);
	    continu = IBIO.inputChar ("Do you want to play again? (y/n) ");
	}

    }


    public int turn (int total, String name)
    { //Pre: total is less than 50
	//Post: a player's turn has occurred and their new score is returned
	System.out.println ("******************************");
	System.out.println ("It is now " + name + "'s turn. ");
	System.out.println (name + " has " + total + " points so far.");

	//roll the two dice
	int roll1 = rollDice ();
	drawDice (roll1);
	int roll2 = rollDice ();
	drawDice (roll2);

	//increment score
	if (roll1 == roll2 && roll1 == 6)
	{
	    System.out.println (name + ", You got double 6! You get 25 points!!!!");
	    total += 25;
	}
	else if (roll1 == roll2 && roll1 == 3)
	{
	    System.out.println (name + ", You got double 3! You lose all your points!!!!");
	    total = 0;
	}
	else if (roll1 == roll2)
	{
	    System.out.println (name + ", You got doubles! You get 5 points.");
	    total += 5;
	}
	else
	    System.out.println (name + ", You did not get doubles. No points.");

	//Print out new score
	System.out.println (name + " now has " + total + " points.");
	char wait = IBIO.inputChar ("\nPress enter to continue.\n");
	return total;
    }


    public void winner (int total1, String name1, int total2, String name2)
    { //Pre: one of total1 or total2 is at 50 points
	//Post: prints the name of the winner on the screen
	if (total1 > total2)
	    System.out.println (name1 + ", you have won!!");
	else
	    System.out.println (name2 + ", you have won!!");
	System.out.println ("\n\n C O N G R A T U L A T I O N S !!!\n\n");
    }


    public int rollDice ()
    { //Pre: none
	//Post: returns a random number between 1 and 6
	return (int) ((Math.random () * 6) + 1);
    }


    public void drawDice (int num)
    { //Pre: num is between 1 and 6
	//Post: draws a picture of the dice that matches num on the screen
	System.out.println ("\n.......");
	//top dots
	if (num == 6 || num == 4 || num == 5)
	    System.out.println (". * * .");
	else if (num == 2 || num == 3)
	    System.out.println (". * .");
	else
	    System.out.println (". .");
	//middle dots
	if (num == 1 || num == 5 || num == 3)
	    System.out.println (". * . The dice rolled: " + num);
	else if (num == 6)
	    System.out.println (". * * . The dice rolled: " + num);
	else
	    System.out.println (". . The dice rolled: " + num);
	//bottom dots
	if (num == 6 || num == 4 || num == 5)
	    System.out.println (". * * .");
	else if (num == 2 || num == 3)
	    System.out.println (". * .");
	else
	    System.out.println (". .");
	System.out.println (".......\n");

    }
}
