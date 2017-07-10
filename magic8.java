public class magic8
{
    public static void main (String args[])
    {
	new magic8 ();
    }


    public magic8 ()
    {

	System.out.println ("  __  __             _         ___    ____        _ _ ");
	System.out.println (" |  \\/  |           (_)       / _ \\  |  _ \\      | | |");
	System.out.println (" |  \\ / |  __   __ _ _  ___  | (_) | | |_) | __ _| | |");
	System.out.println (" | |\\/| |/ _` |/ _` | |/ __|  > _ <  |  _ < / _` | | |");
	System.out.println (" | |  | | (_| | (_| | | (__  | (_) | | |_) | (_| | | |");
	System.out.println (" |_|  |_|\\__,_|\\__, |_|\\___|  \\___/  |____/ \\__,_|_|_|");
	System.out.println ("               __/ |                                 ");
	System.out.println ("              |___/");

	int j = 1;
	while (j > 0)
	{
	    System.out.println ("");
	    System.out.println ("");
	    int question = IBIO.inputInt ("Enter a yes or no question: ");
	    System.out.println ("");
	    System.out.println ("The magic 8 ball says: ");

	    int num = (int) (Math.random () * 16) + 1;
	    if (num == 1)
		System.out.println ("Outlook not so good");
	    else if (num == 2)
		System.out.println ("Don't count on it");
	    else if (num == 3)
		System.out.println ("My sources say no");
	    else if (num == 4)
		System.out.println ("Without a doubt");
	    else if (num == 5)
		System.out.println ("Reply hazy, try again.");
	    else if (num == 6)
		System.out.println ("It is certain");
	    else if (num == 7)
		System.out.println ("My reply is no");
	    else if (num == 8)
		System.out.println ("As I see it, yes");
	    else if (num == 9)
		System.out.println ("Most Likely");
	    else if (num == 10)
		System.out.println ("You may rely on it");
	    else if (num == 11)
		System.out.println ("Cannot predict now");
	    else if (num == 12)
		    System.out.println ("Outlook good");
	    else if (num == 13)
		System.out.println ("Better not tell you now");
	    else if (num == 14)
		System.out.println ("Very doubtful");
	    else if (num == 15)
		System.out.println ("Yes definitely");
	    else
		System.out.println ("Concentrate and ask again");

	    System.out.println ("You've asked " + j + " question(s) so far.");

	}
	j++;
    }
}
