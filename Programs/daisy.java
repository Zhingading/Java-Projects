public class daisy
{
    public static void main (String args[])
    {
	new daisy ();
    }


    public daisy ()
    {
	int num = (int) (Math.random () * 25) + 15;
	for (int i = 0 ; i <= num ; i++)

	if (i % 2 == 0)
	    System.out.println ("He loves me");
	else
	    System.out.println ("He loves not");

	try
	{
	    Thread.sleep (100);
	}
	catch (InterruptedException m)
	{
	    ;
	}

    }
}
