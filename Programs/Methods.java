//At the bottom of this class are a series of methods
//Fill them in, according to their instructions.
//Run them as you go, to verify if they are working.

public class Methods
{
    public static void main (String args[])
    {
	new Methods ();
    }


    public Methods ()
    {
	square ();
	blank ();
	circle ();
	blank ();
	bunny ();
	blank ();
	line ();
	blank ();
	count ();
	blank ();
	signature ();
    }


    public void blank ()
    {
	System.out.println (" ");
    }


    public void circle ()
    {

	System.out.println ("     *  *     ");
	System.out.println ("  *        *     ");
	System.out.println (" *          *      ");
	System.out.println (" *          *      ");
	System.out.println ("  *        *        ");
	System.out.println ("     *  *             ");
    }


    public void square ()
    {

	System.out.println ("* * * *");
	System.out.println ("*     *");
	System.out.println ("*     *");
	System.out.println ("* * * *");
    }


    public void bunny ()
    {

	System.out.println ("        ,.   ,.     ");
	System.out.println ("        \\.\\ /,/     ");
	System.out.println ("         Y Y f      ");
	System.out.println ("         |. .|      ");
	System.out.println ("        (\\\"_, l      ");
	System.out.println ("         ,- , \\     ");
	System.out.println ("        (_)(_) Y,.  ");
	System.out.println ("         _j _j |,   ");
	System.out.println ("       (_,(__,      ");

    }


    public void line ()
    {
	for (int star = 1 ; star <= 10 ; star++)
	    System.out.print ("*");
    }


    public void count ()
    {
	System.out.println ("");
	for (int i = 1 ; i <= 10 ; i++)
	    System.out.print (i + " ");
    }


    public void signature ()
    {
	System.out.println ("");
	System.out.println ("Name: Zhao");
	System.out.println ("Position: IB Student at Turner Fenton");
	System.out.println ("\"Nobody is perfect, and that's a good thing.\"");

    }
}
