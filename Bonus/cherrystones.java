public class cherrystones
{
    public static void main (String args[])
    {
	new cherrystones ();
    }


    public cherrystones ()
    {
	int num = (int) (Math.random () * 8) + 1;
	for (int i = 1 ; i <= num ; i++)
	{
	    if (i == 1)
		System.out.println ("IT");
	    else if (i == 2)
		System.out.println ("Prime Minister");
	    else if (i == 3)
		System.out.println ("Chef");
	    else if (i == 4)
		System.out.println ("Engineer");
	    else if (i == 5)
		System.out.println ("Burger Flipper");
	    else if (i == 6)
		System.out.println ("Lawyer");
	    else if (i == 7)
		System.out.println ("CEO");
	    else
		System.out.println ("Farmer");
	    try
	    {
		Thread.sleep (100);
	    }
	    catch (InterruptedException m)
	    {
		;
	    }


	}

	System.out.println ("");
	System.out.println ("You had " + num + " cherry stones");


    }
}


