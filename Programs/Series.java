public class Series
{
    public static void main (String args[])
    {
	new Series ();
    }


    public Series ()
    {
	System.out.println ("Group A: Counting\n");

	for (int i = 0 ; i < 13 ; i++)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 1 ; i < 20 ; i++)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 12 ; i < 23 ; i++)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 101 ; i < 116 ; i++)
	    System.out.print (i + " ");

	System.out.println ("\n\nGroup B: Backwards\n");

	for (int i = 12 ; i > -1 ; i--)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 20 ; i > 0 ; i--)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 22 ; i > 11 ; i--)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 115 ; i > 100 ; i--)
	    System.out.print (i + " ");

	System.out.println ("\n\nGroup C: Skip Counting\n");

	for (int i = 0 ; i < 20 ; i += 2)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 1 ; i < 20 ; i += 2)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 0 ; i < 31 ; i += 3)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (int i = 0 ; i < 41 ; i += 4)
	    System.out.print (i + " ");

	System.out.print ("\n");

	for (double i = 0 ; i < 6 ; i += 0.5)
	    System.out.print (i + " ");

	System.out.println ("\n\nGroup D: One thing, Repeated\n");

	for (int i = 1 ; i < 14 ; i++)
	    System.out.print ("*");

	System.out.print ("\n");

	for (int i = 1 ; i < 14 ; i++)
	    System.out.print ("2");

	System.out.print ("\n");

	for (int i = 1 ; i < 14 ; i++)
	    System.out.print ("1 0 ");

	System.out.print ("\n");

	for (int i = 1 ; i < 22 ; i++)
	    System.out.print ("la");

	System.out.print ("\n");

	for (double i = 1 ; i < 7 ; i++)
	    System.out.print ("- 1 + 1");

	System.out.println ("\n\nGroup E:Powers- Multiply and Divide\n");

	for (int i = 0 ; i < 13 ; i++)
	    System.out.print (i * i + " ");

	System.out.print ("\n");

	for (int i = 0 ; i < 13 ; i++)
	    System.out.print (i * i * i + " ");

	System.out.print ("\n");

	System.out.println ("\n\nBonus\n");

	for (int i = 0 ; i < 12 ; i++)
	    System.out.print ((int) Math.pow (2, i) + " ");

	System.out.print ("\n");

	for (int i = 0 ; i < 11 ; i++)
	    System.out.print ((int) Math.pow (3, i) + " ");

	System.out.print ("\n");

	for (int i = 1 ; i <= 100000 ; i *= 10)
	    System.out.print ((double) 1000 / i + " ");

	System.out.print ("\n\n");

	for (int i = 1 ; i < 9 ; i++)
	    System.out.print (i + "/" + (i + 1) + " ");





    }
}


