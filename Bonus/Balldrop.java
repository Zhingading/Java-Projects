public class Balldrop
{
    public static void main (String args[])
    {
	new Balldrop ();
    }


    public Balldrop ()
    {
	double dropheight = IBIO.inputDouble ("What height did you drop the ball from? ");
	System.out.println ("");
	double minheight = IBIO.inputDouble ("What is the final height of the ball? ");
	double bounce = dropheight;
	int i = 0;
	if (minheight > dropheight)
	    System.out.println ("ERROR: Invalid input");
	else if (minheight == dropheight)
	    System.out.println ("The ball bounced once");
	else
	    while (bounce >= minheight)
	    {
		bounce = (bounce * 2 / 3);
		i++;
	    }
	System.out.println ("");
	System.out.println ("The ball bounced " + i + " times");
    }
}


