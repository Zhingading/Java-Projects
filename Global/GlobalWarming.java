import java.util.Arrays;

public class GlobalWarming
{
    public static void main (String args[])
    {
	new GlobalWarming ();
    }


    public GlobalWarming ()
    {
	int[] Temp = {10, 8, 8, 10, 8, 14, 13, 10, 6, 14, 8, 9, 5, 5, 12, 6, 12, 5, 15, 8, 6, 10, 12, 6, 4};
	System.out.println ("");
	System.out.println ("Temperatures:");
	for (int i = 0 ; i < Temp.length ; i++)
	{
	    if (Temp [i] > 0)
		System.out.print ("+" + Temp [i] + " ,");
	    else
		System.out.print (Temp [i] + ". ");
	}

	System.out.println ("\n");
	System.out.println ("Changes:");

	int[] changes = { + 1, +2, -2, +1, +2, -2, +1, +2, -2, +1, +2, -2, +1, +2, -2, +1, +2, -2, +1, +2, -2, +1, +2, -2};
	for (int i = 0 ; i < changes.length ; i++)
	{
	    System.out.print (changes [i] + ". ");
	}

	int sum = 0;
	double average;
	for (int i = 0 ; i < changes.length ; i++)
	{
	    sum = sum + changes [i];
	}

	average = (double) sum / changes.length;
	System.out.println ("\n");
	System.out.println ("Average Change: ");

	if (average > 0)
	    System.out.println ("+ " + average);
	else
	    System.out.println (average);

    }
}

