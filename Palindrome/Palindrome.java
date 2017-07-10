public class Palindrome
{
    public static void main (String args[])
    {
	new Palindrome ();
    }


    public Palindrome ()
    {

	char a1[] = {'R', 'A', 'D', 'A', 'R'};
	char a2[] = {'A', 'M', 'A', 'N', 'A', 'P', 'L', 'A', 'N', 'A', 'C',
	    'A', 'N', 'A', 'L', 'P', 'A', 'N', 'A', 'M', 'A'};
	// A man, a plan, a canal: Panama
	char a3[] = {'H', 'A', 'N', 'N', 'A', 'H'};
	char a4[] = {'C', 'A', 'T', 'A'};
	char a5[] = {'A', 'B', 'C', 'A'};
	char a6[] = {'A'};

	System.out.println (check (a1));
	System.out.println (check (a2));
	System.out.println (check (a3));
	System.out.println (check (a4));
	System.out.println (check (a5));
	System.out.println (check (a6));
    }


    public static boolean check (char[] a1)
    {
	boolean palindrom = false;
	if (a1.length % 2 == 0)
	{
	    for (int i = 0 ; i < a1.length / 2 - 1 ; i++)
	    {
		if (a1 [i] != a1 [a1.length - i - 1])
		{
		    return false;
		}
		else
		{
		    palindrom = true;
		}
	    }
	}
	else
	{
	    for (int i = 0 ; i < (a1.length - 1) / 2 - 1 ; i++)
	    {
		if (a1 [i] != a1 [a1.length - i - 1])
		{
		    return false;
		}
		else
		{
		    palindrom = true;
		}


	    }
	}
	return palindrom;
    }
}

