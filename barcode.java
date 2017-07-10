public class barcode
{
    public static void main (String args[])
    {
	new barcode ();
    }


    public barcode ()
    {

	System.out.println ("Enter the last 3 values of your 13 digit number below");
	System.out.println ("");

	int thirdlast = IBIO.inputInt ("What is the 11th digit? ");
	if (thirdlast > 9)
	    System.out.println ("");
	System.out.println ("ALERT: enter a single digit");
	System.out.println ("");

	int secondlast = IBIO.inputInt ("What is the 12th digit? ");
	if (secondlast > 9)
	    System.out.println ("");
	System.out.println ("ALERT: enter a single digit");
	System.out.println ("");

	int last = IBIO.inputInt ("What is the last digit? ");
	if (last > 9)
	    System.out.println ("");
	System.out.println ("ALERT: enter a single digit");
	System.out.println ("");

	int third = thirdlast * 1;

	int second = secondlast * 3;

	int lastone = last * 1;

	int sum = third + second + lastone + 91;

	System.out.print ("The 1-3 value is " + sum);
    }
}
