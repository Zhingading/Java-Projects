public class Price
{
    public static void main (String args[])
    {
	new Price ();
    }


    public Price ()
    {
	System.out.println ("Welcome to...THE PRICE IS RIGHT!");

	String name1 = getname (1);
	String name2 = getname (2);
	String name3 = getname (3);
	String name4 = getname (4);
	char again = 'y';
	while (again == 'y')
	{
	    String item = item ();
	    rules (item);
	    System.out.println ("");
	    double bid1 = getbid (name1);
	    double bid2 = getbid (name2);
	    double bid3 = getbid (name3);
	    double bid4 = getbid (name4);
	    winner (name1, name2, name3, name4, bid1, bid2, bid3, bid4, item);
	    again = IBIO.inputChar ("Would you like to play again? (y/n): ");
	}
    }


    public String getname (int num)
    {

	String name = IBIO.inputString ("Player " + num + " Please enter your name: ");
	System.out.println ("You are player " + num + "\n");
	return name;
    }


    public String item ()
    {
	int object = (int) (Math.random () * 5) + 1;
	String item = "";
	if (object == 1)
	{
	    return item = "WII U";
	}
	else if (object == 2)
	{
	    return "Carribean Vacation";
	}
	else if (object == 3)
	{
	    return "iPhone 6S";

	}
	else if (object == 4)
	{
	    return "RC ATV Car";

	}
	else
	{
	    return "Super wide screen TV";

	}
    }


    public void rules (String item)
    {

	System.out.println ("The item you are bidding on is a " + item);
	System.out.println ("The maximum amount you can bid is $1000.00");
	System.out.println ("The contestant who makes the closest bid without going over wins!");
    }


    public double getbid (String name)
    {

	double bid = IBIO.inputDouble ("Your bid, " + name + ": ");
	while (bid > 1000.00 || bid < 1.00)
	{
	    System.out.println ("That is not valid, Plase enter a value between 1 and 1000");
	    bid = IBIO.inputDouble ("Your bid, " + name + ": ");
	}
	return bid;
    }


    public void winner (String name1, String name2, String name3, String name4, double bid1, double bid2, double bid3, double bid4, String item)
    {
	double price = 0.00;
	if (item.equals ("WII U"))
	    price = 330.00;
	else if (item.equals ("Carribean Vacation"))
	    price = 899.00;
	else if (item.equals ("iPhone 6S"))
	    price = 780.00;
	else if (item.equals ("RC ATV Car"))
	    price = 98.00;
	else
	    price = 680.00;
	String winner = "";
	if (bid1 > bid2 && bid1 > bid3 && bid1 > bid4 && price - bid1 > 0)
	    winner = name1;
	else if (bid2 > bid3 && bid2 > bid4 && price - bid2 > 0)
	    winner = name2;
	else if (bid3 > bid4 && price - bid3 > 0)
	    winner = name3;
	else if (price - bid4 > 0)
	    winner = name4;
	else
	    System.out.println ("Nobody Wins");

	System.out.println ("The winner is " + winner + ". the price of the " + item + " is $" + price);
    }
}
