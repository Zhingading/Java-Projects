    public class store
{
    public static void main (String args[])
    {
	new store ();
    }


    public store ()
    {
	int j = 1;
	while (j > 0)
	{
	    System.out.println ("You've visited the market " + j + " times");
	    System.out.println ("*********************************");
	    System.out.println ("Hi, Welcome to the Markteplace! ");
	    System.out.println("");
	    int potato = IBIO.inputInt ("How many Potatoes would you like? ");
	    int lettuce = IBIO.inputInt ("How many heads of Lettuce would you like? ");
	    int tomato = IBIO.inputInt ("How many Tomatoes would you like? ");
	    int corn = IBIO.inputInt ("How many ears of Corn would you like? ");
	    int peas = IBIO.inputInt ("How many Peas would you like? ");

	    double potatocost = (potato * 1.50);
	    double lettucecost = (lettuce * 3);
	    double tomatocost = (tomato * 2);
	    double corncost = (corn * 1.75);
	    double peascost = (peas * 0.2);
	    double subtotal = (potatocost + lettucecost + tomatocost + corncost + peascost);
	    System.out.println ("");
	    System.out.println ("Your subtotal is $" + subtotal);
	    double tax = (subtotal * 0.13);
	    System.out.println ("You tax is $" + tax);
	    double total = (subtotal * 1.13);
	    System.out.println ("Your total after taxes is $" + total);
	    System.out.println ("");
	    double moneypaid = IBIO.inputDouble ("Enter the amount of money paid: $");
	    double moneyowed = (total - moneypaid);
	    double change = (moneypaid - total);
	    if (moneypaid < total)
		System.out.println ("You trying to cheat me? You owe me $" + moneyowed + " Get outta here!");
	    else if (moneypaid > total)
		System.out.println ("Here's your change of $" + change + ", thank you for visiting the market!");
		else 
		System.out.println("Thanks for visiting!");
	    System.out.println ("");
	    System.out.println ("");
	    j++;
	}
    }
}



