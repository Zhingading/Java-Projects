public class beetle
{
    public static void main (String args[])
    {
	new beetle ();
    }


    public beetle ()
    {

	int score1 = 0;
	int score2 = 0;
	int turn = 1;
	Instructions ();
	while ((score1 != 6) && (score2 != 6))
	{
	    if (turn == 1)
	    {
		System.out.println ("It is the first player's turn ");
		score1 = Turn (score1);
		turn = 2;
	    }
	    else if (turn == 2)
	    {
		System.out.println ("");
		System.out.println ("It is the second player's turn");
		score2 = Turn (score2);
		turn = 1;
		System.out.println ("");
	    }
	}
	if (score1 == 6)
	    System.out.println ("Player 1 WON!");
	else
	    System.out.println ("Player 2 WON!");

    }


    public void Instructions ()
    {
	//Post: Everyone knows the instructions
	System.out.println ("The goal of the game BEETLE is to be the first to draw the beetle in the correct order. \nIn our game, we will draw a human instead. \nTo be able to draw a body part, you need to roll the correct thing at the correct time. ");
	System.out.println ("");
	System.out.println ("Body = 1");
	System.out.println ("Head = 2");
	System.out.println ("Left Leg = 3");
	System.out.println ("Right Leg = 4");
	System.out.println ("Left Arm = 5");
	System.out.println ("Right Arm= 6");

	System.out.println ("If you don't roll what you're looking for, the part passes on to the other player");
	System.out.println ("");
    }


    public int RollDice ()
    {
	//Post: The dice is rolled and the number 1-6 is returned
	int roll = (int) (Math.random () * 6) + 1;
	return roll;
    }


    public int Turn (int score)
    {
	//Post: the player's new score after their turn is returned
	int roll = RollDice ();
	if (roll == score + 1)
	{
	    System.out.println ("");
	    System.out.println ("Congrats! You rolled a " + roll + "!");
	    DrawBeetle (score + 1);
	    return (score + 1);
	}
	else
	{
	    System.out.println ("");
	    System.out.println ("You rolled a " + roll + " ,too bad");
	    return score;
	}


    }


    public void DrawBeetle (int score)
    {
	//Post: the new beetle/human is drawn on the screen
	System.out.println ("Your score is " + score);
	if (score == 0)
	    System.out.print ("");

	else if (score == 1)
	{
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	}
	else if (score == 2)
	{
	    System.out.println ("    *** ");
	    System.out.println ("   *   *");
	    System.out.println ("    *** ");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	}

	else if (score == 3)
	{
	    System.out.println ("    *** ");
	    System.out.println ("   *   *");
	    System.out.println ("    *** ");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("    **");
	    System.out.println ("   *");
	    System.out.println ("   *");
	    System.out.println ("   *");
	    System.out.println ("  *");

	}

	else if (score == 4)
	{
	    System.out.println ("    *** ");
	    System.out.println ("   *   *");
	    System.out.println ("    *** ");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("     *");
	    System.out.println ("    ***");
	    System.out.println ("   *   *");
	    System.out.println ("   *   *");
	    System.out.println ("   *   *");
	    System.out.println ("  *     *");
	}

	else if (score == 5)
	{
	    System.out.println ("    *** ");
	    System.out.println ("   *   *");
	    System.out.println ("    *** ");
	    System.out.println ("     *");
	    System.out.println ("  ****");
	    System.out.println ("  *  *");
	    System.out.println ("  *  *");
	    System.out.println (" *   *");
	    System.out.println ("     *");
	    System.out.println ("    ***");
	    System.out.println ("   *   *");
	    System.out.println ("   *   *");
	    System.out.println ("   *   *");
	    System.out.println ("  *     *");

	}
	else
	{
	    System.out.println ("    *** ");
	    System.out.println ("   *   *");
	    System.out.println ("    *** ");
	    System.out.println ("     *");
	    System.out.println ("  *******");
	    System.out.println ("  *  *  *");
	    System.out.println ("  *  *  *");
	    System.out.println (" *   *   *");
	    System.out.println ("     *");
	    System.out.println ("    ***");
	    System.out.println ("   *   *");
	    System.out.println ("   *   *");
	    System.out.println ("   *   *");
	    System.out.println ("  *     *");
	}





    }
}


