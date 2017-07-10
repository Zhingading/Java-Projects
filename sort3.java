public class sort3
{
    public static void main (String args[])
    {
	new sort3 ();
    }


    public sort3 ()
    {
	while (1>0)
	{
	    int number1 = IBIO.inputInt ("What is the first number? ");
	    int number2 = IBIO.inputInt ("What is the second number? ");
	    int number3 = IBIO.inputInt ("What is the third number? ");

	    int first1 = Math.max (number1, number2);
	    int first2 = Math.max (number3, first1);
	    int last1 = Math.min (number3, number2);
	    int last2 = Math.min (number3, last1);

	    int middle = Math.min (Math.min (Math.max (number1, number2), Math.max (number2, number3)), Math.max (number1, number3));

	    System.out.println ("In sorted order they are " + last2 + ", " + middle + ", " + first2);
	    System.out.println("");
	}
    }
}
