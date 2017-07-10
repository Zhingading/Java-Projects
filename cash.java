public class cash
{
    public static void main (String args[])
    {
	new cash ();
    }


    public cash ()
    {
	System.out.println ("Welcome to Zhao's Cash Register!");
	System.out.println ("********************************");
	int j = 1;
	while (j > 0)
	{

	    System.out.println ("Round " + j);
	    double cost = IBIO.inputDouble ("Please enter the total cost: ");
	    double amountpaid = IBIO.inputDouble ("Please enter the amount you paid: ");

	    double change = (amountpaid - cost);
	    int ichange = (int) (change * 100);
	    if (amountpaid < cost)
	    {
		System.out.println ("ALERT: Please pay the full amount for your purchase!");
		System.out.println ("");
	    }
	    else
	    {
		System.out.println ("");
		System.out.println ("Total change: " + change);

		int toonie = (int) (ichange / 200);
		int loonie = (int) ((ichange % 200) / 100);
		int quarter = (int) ((ichange % 100) / 25);
		int dime = (int) ((ichange % 25) / 10);
		int nickel = (int) ((ichange % 10) / 5);
		int penny = (int) (ichange % 5);

		System.out.println ("You will need: ");
		System.out.println (penny + " Penny(s)");
		System.out.println (nickel + " Nickel(s)");
		System.out.println (dime + " Dime(s)");
		System.out.println (quarter + " Quarter(s)");
		System.out.println (loonie + " Loonie(s)");
		System.out.println (toonie + " Toonie(s)");
		System.out.println ("_____________________________________");
		System.out.println ("");
		j++;
	    }
	}
    }
}



