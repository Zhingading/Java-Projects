public class quotes
{
    public static void main (String args[])
    {
	new quotes ();
    }


    public quotes ()
    {
	System.out.println ("* * * * * * * * * * * * * *");
	System.out.println ("* * Q U O T A T I O N S * *");
	System.out.println ("* * * * * * * * * * * * * *");

	System.out.print ("\n");
	System.out.println ("(a) Oscar Wilde");
	System.out.println ("(b) Mark Twain");
	System.out.println ("(c) Eleanor Roosevelt");
	System.out.println ("(d) E E cummings");
	System.out.println ("(e) Lois Mcmaster Bujold");
	System.out.println ("");

	char continu = IBIO.inputChar ("Do you wish to read a quote ? (y / n): ");
	while (continu == 'y')
	{

	    char author = IBIO.inputChar ("Which authour would you like(a, b, c, d, e)? : ");

	    if (author == 'a')
	    {
		System.out.println ("");
		System.out.println ("O S C A R    W I L D E ");
		System.out.println ("\"Always forgive your enemies; nothing annoys them so much.\"");
		System.out.println ("");
	    }

	    else if (author == 'b')
	    {
		System.out.println ("");
		System.out.println ("M A R K    T W A I N");
		System.out.println ("\"A lie can travel halfway around the world while the truth is putting on its shoes.\"");
		System.out.println ("");
	    }

	    else if (author == 'c')
	    {
		System.out.println ("");
		System.out.println ("E L E A N O R  R O O S E V E L T");
		System.out.println ("\"No one can make you feel inferior without your consent.\"");
		System.out.println ("");
	    }

	    else if (author == 'd')
	    {
		System.out.println ("");
		System.out.println ("E . E . C u m m i n g s");
		System.out.println ("\"The most wasted of all days is one without laughter.\"");
		System.out.println ("");
	    }

	    else
	    {
		System.out.println ("");
		System.out.println ("Loic McMaster Bujold");
		System.out.println ("\"My home is not a place, it is people.\"");
		System.out.println ("");
	    }


	    continu = IBIO.inputChar ("Do you wish to read another quote ? (y / n): ");
	    System.out.println ("");
	}

    }
}


