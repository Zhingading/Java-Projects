public class BloodTypes
{
    public static void main (String args[])
    {
	new BloodTypes ();
    }


    public BloodTypes ()
    {
	int percentages[] = {46, 40, 10, 4};
	System.out.println ("Chart 1");
	for (int i = 0 ; i < percentages.length ; i++)
	    System.out.print (percentages [i] + " ");

	String bloodtypes[] = {"O", "A", "B", "AB"};
	System.out.println ("");
	System.out.println ("");
	System.out.println ("Chart 2");
	System.out.println ("Blood Types");
	for (int i = 0 ; i < bloodtypes.length ; i++)
	    System.out.println (bloodtypes [i] + " ");

	System.out.println ("");
	System.out.println ("Chart 3");
	System.out.print ("The blood types are ");
	for (int i = 0 ; i < bloodtypes.length ; i++)
	    System.out.print (bloodtypes [i] + ", ");
	System.out.println ("");

	System.out.println ("");
	System.out.println ("Chart 4");
	System.out.print ("The percentages are ");
	for (int i = 0 ; i < percentages.length ; i++)
	    System.out.print (percentages [i] + ", ");
	System.out.println ("");

	System.out.println ("");
	System.out.println ("Chart 5");
	for (int i = 0 ; i < 4 ; i++)
	    System.out.println (bloodtypes [i] + " has " + percentages [i] + "%");
	System.out.println ("\n");


	System.out.println ("Chart 6");
	for (int i = 0 ; i < 4 ; i++)
	    System.out.println (percentages [i] + "% of the population has the blood percentages " + bloodtypes [i]);
	System.out.println ("\n");

	System.out.println ("    Chart 7");
	System.out.println ("TYPE PERCENTAGE");
	System.out.println ("----------------");
	for (int i = 0 ; i < 4 ; i++)
	    System.out.println (percentages [i] + "            " + bloodtypes [i]);
	System.out.println ("\n");

	System.out.println ("      Chart 8");
	System.out.println ("      Blood \n      Type %");
	System.out.println ("-----------------");
	for (int i = 0 ; i < 4 ; i++)
	    System.out.println (percentages [i] + "             " + bloodtypes [i] + "%\n");

	System.out.println ("Chart 9");
	System.out.print ("Blood Type: ");
	for (int i = 0 ; i < 4 ; i++)
	    System.out.print (bloodtypes [i] + "    ");
	System.out.println (" ");
	System.out.print ("Percentage: ");
	for (int i = 0 ; i < 4 ; i++)
	    System.out.print (percentages [i] + "   ");
	System.out.println ("\n");
    }
}

