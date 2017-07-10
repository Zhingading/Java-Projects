public class muffins
{
    public static void main (String args[])
    {
	new muffins ();
    }


    public muffins ()
    {
	System.out.println ("Welcome to Zhao's Zesty Muffins!");
	System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println ("If you like muffins, we have the best!");
	System.out.println ("");
	int j = 1;
	while (j > 0)
	{
	    System.out.println ("You've visited the shop '" + j + "' times");
	    int numbermuffin = IBIO.inputInt ("How many muffins would you like today? ");
	    int cost = 0;

	    if ((numbermuffin >= 1) && (numbermuffin <= 9))

		cost = 5;

	    else if ((numbermuffin >= 10) && (numbermuffin <= 19))

		cost = 3;

	    else if ((numbermuffin >= 20) && (numbermuffin <= 39))

		cost = 2;

	    else if ((numbermuffin >= 40))

		cost = 1;

	    else

		System.out.println ("You don't want any muffins? That's too bad.");
	    System.out.println ("");


	    int total = (cost * numbermuffin);
	    System.out.println (+numbermuffin + " muffins it is!");
	    System.out.println ("");
	    System.out.println ("The cost per muffin will be $" + cost);
	    System.out.println ("And your total adds up to $" + total);
	    System.out.println ("Thanks for visiting!");
	    System.out.println ("**********************");
	    System.out.println ("");


	    j++;
	}
    }
}


