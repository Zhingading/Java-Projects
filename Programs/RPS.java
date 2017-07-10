public class RPS
{
    public static void main (String args[])
    {
	new RPS ();
    }


    /* On this program, you are working with a team....
       The responsibility of the other person on the team
	   was to code the constructor.
       Your job is to code the other methods.
       Follow the comments.
       You are not allowed to edit the constructor.
    */

    public RPS ()
    {
	int cPoint = 0;
	int uPoint = 0;
	int game = 1;
	char playAgain = 'y';
	System.out.println ("-----Rock, Paper, Scissors------\n");
	while (playAgain == 'y')
	{
	    char user = userChoice ();
	    System.out.println ("You have selected " + user);
	    char comp = compChoice ();
	    System.out.println ("The computer has selected " + comp);
	    char win = winner (comp, user);
	    if (win == 'c')
	    {
		cPoint++;
		System.out.println ("\nThe computer wins!");
	    }
	    else if (win == 'u')
	    {
		uPoint++;
		System.out.println ("\nYou win!");
	    }
	    else
		System.out.println ("\nThere is a tie!");
	    System.out.println ("Points: You: " + uPoint + " Computer: " + cPoint);
	    playAgain = IBIO.inputChar ("\nPlay again? (y/n) ");
	    System.out.println ("");
	}
	System.out.println ("Goodbye!");
    }


    public boolean isValid (String c)
    {
	/* All valid data:
	       Rock, ROCK, rock, r, R
	       Paper, PAPER, paper, p, P
	       Scissors, SCISSORS, scissors, s, S
	   return true if valid, false otherwise
	*/
	if (c.equals ("s") || c.equals ("S") || c.equals ("Scissors") || c.equals ("SCISSORS") || c.equals ("scissors") || c.equals ("Paper") || c.equals ("paper") || c.equals ("PAPER") || c.equals ("P") || c.equals ("p") || c.equals ("ROCK") || c.equals ("rock") || c.equals ("Rock") || c.equals ("R") || c.equals ("r"))
	    return true;
	else
	    return false;
    }


    public char userChoice ()
    { //returns r, p or s, based on the user's choice

	//print options: rock, paper, scissors
	System.out.println ("Rock, Paper or Scissors?");
	//ask for user's choice. will need to store in String
	String choice = IBIO.inputString ("Choose either rock, paper or scissors: ");

	//Loop: if invalid input, ask again
	while (!isValid (choice))
	{
	    System.out.println ("Invalid choice! Please input again.");
	    choice = IBIO.inputString ("Choose either rock, paper or scissors: ");

	}
	//stopping condition is the isValid method!!
	//something like: while(!isValid(choice))

	//If: to standardize values
	//if you've got one of Rock, ROCK, rock, r, R, then return 'r'.
	//else if you've got one of Paper, PAPER, paper, p, P, then return 'p'.
	//else return 's';
	if (choice.equals ("rock") || choice.equals ("Rock") || choice.equals ("r") || choice.equals ("R") || choice.equals ("ROCK"))
	    return 'r';
	else if (choice.equals ("s") || choice.equals ("S") || choice.equals ("Scissors") || choice.equals ("SCISSORS") || choice.equals ("scissors"))
	    return 's';
	else
	    return 'p';
    }


    public char compChoice ()
    { //make a random number between 1 and 3
	//if the number is 1, return r; 2 return s; 3 return p
	int num = (int) (Math.random () * 3) + 1;
	if (num == 1)
	    return 'r';
	else if (num == 2)
	    return 's';
	else
	    return 'p';
    }


    public char winner (char comp, char user)
    { //comp and user both hold one of r, s, p
	if (comp == user)
	    return 'b';
	else if ((comp == 'r') && (user == 'p'))
	    return 'u';
	else if ((comp == 'p') && (user == 'r'))
	    return 'c';
	else if ((comp == 's') && (user == 'p'))
	    return 'c';
	else if ((comp == 'p') && (user == 's'))
	    return 'u';
	else if ((comp == 's') && (user == 'r'))
	    return 'u';
	else
	    return 'c';
	//returns c for computer, u for user and b for both

    }
}

