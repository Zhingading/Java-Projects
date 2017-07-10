public class Fruitpop
{
    public static void main (String args[])
    {
	new Fruitpop ();
    }


    public Fruitpop ()
    {

	int j = 1;
	System.out.println ("Welcome to Fruit Pop! (Zhao edition) ");
	System.out.println ("Use -9999 to exit!");
	System.out.println ("");
	while (j > 0)
	{
	    double points = IBIO.inputDouble ("Round " + j + " -- How many points do you have? ");
	    System.out.println ("");
	    if (points == -9999) System.exit(0);
	    if (points < 0)
	    {
		System.out.println ("Sorry that isn't an accepted value!");
		System.out.println ("");
	    }
	    else
	    {
		System.out.println ("");
		System.out.println ("These are the fruits and bonuses you've earned!");


		if (points >= 10)
		    System.out.println ("Apple");
		System.out.println ("Blueberry");
		if ((points >= 2000) && (points <= 3000))
		    System.out.println ("Coin");
		if (points >= 2000)
		    System.out.println ("Extra Time");
		if ((points <= 400) || (points >= 1000))
		    System.out.println ("Heart");
		if (points <= 1500)
		    System.out.println ("Lemon");
		if ((points >= 50) && (points <= 2000))
		    System.out.println ("Lime");
		if (points >= 100)
		    System.out.println ("Orange");
		System.out.println ("Plum");
		if (points >= 1500)
		    System.out.println ("Robot");
		System.out.println ("");
		System.out.println ("");
	    }
	    j++;
	}
    }
}

