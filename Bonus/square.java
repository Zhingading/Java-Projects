public class square
{
    public static void main (String args[])
    {
	new square ();
    }


    public square ()
    {
	System.out.println ("---Welcome to the Square Making Program---");
	System.out.println ("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	System.out.println ("  Don't be a square, make some squares!");
	while (1==1)
	{
	    System.out.println ("");
	    int input = IBIO.inputInt ("What dimension would you like your square to be? (-9999 to quit): ");
	    if (input == -9999)
	    {
		System.out.println ("Hope you enjoyed making squares!");
		System.exit (0);
	    }
	    else
	    {
		int x = 1;
		int y = 1;
		for (y = 1 ; y <= input ; y++)
		{
		    for (x = 1 ; x <= input ; x++)
		    {
			System.out.print ("* ");
		    }
		    System.out.println ("");
		}
	    }
	}
    }
}
