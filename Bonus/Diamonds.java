public class Diamonds
{
    public static void main (String args[])
    {
	new Diamonds ();
    }


    public Diamonds ()
    {
	while (1 == 1)
	{
	    int size = IBIO.inputInt ("How big should the diamond be? ");
	    while ((size < 0) || (size % 2 == 0))
	    {
		size = IBIO.inputInt ("ERROR: enter an odd number. ");
		System.out.println ("");
	    }


	    int top = (size + 1) / 2; //if size is 7, then top is 4
	    int bottom = (size - 1) / 2; //if size is 7, then bottom is 3


	    //print the top half of the diamond include the middle line
	    for (int i = 1 ; i <= top ; i++)
	    {
		//print the space of each line
		int j = 1;
		while (j <= top - i)
		{
		    System.out.print (" ");
		    j++;
		}

		//print the "*" (STARS)
		int k = 1;
		while (k <= (2 * i - 1))
		{
		    System.out.print ("*");
		    k++;
		}

		System.out.println ("");
	    }

	    //print the bottom half of the diamond
	    for (int l = bottom ; l >= 1 ; l--)
	    {
		//print the space of each line
		int j = 1;
		while (j <= bottom - l + 1)
		{
		    System.out.print (" ");
		    j++;
		}

		//print the "*" (STARS)
		int k = 1;
		while (k <= (2 * l - 1))
		{
		    System.out.print ("*");
		    k++;
		}

		System.out.println ("");
	    }
	}
    }
}


