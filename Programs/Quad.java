public class Quad
{
    public static void main (String args[])
    {
	new Quad ();
    }


    public Quad ()
    {
	printNStars (5);
	printNChars (6, 'q');
	System.out.println ("The positive root is: " + positiveRoot (1, 6, 8));
	System.out.println ("The negative root is: " + negativeRoot (1, 6, 8));
	System.out.println ("The x value of the vertex is: " + xVertex (1, 6, 8));
	System.out.println ("The discriminant is: " + discrim (1, 6, 8));
	System.out.println ("The number of roots is: " + numRoots (1, 6, 8));
	System.out.println ("The absolute value of 'n' is: " + absValue (-4));
    }


    public void printNStars (int n)
    {
	for (int i = 1 ; i <= n ; i++)
	    System.out.print ("*");
	System.out.print ("\n");

    }


    public void printNChars (int n, char c)
    {
	for (int x = 1 ; x <= n ; x++)
	    System.out.println ("q");
	System.out.print ("\n");
    }


    public double positiveRoot (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the positive root of the quadratic equation
	//(-b+Math.sqt(b*b-4*a*c))/2*a
	//replace the return 1
	return (-b + Math.sqrt (b * b - 4 * a * c)) / 2 * a;
    }


    public double negativeRoot (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the positive root of the quadratic equation
	//(-b-Math.sqt(b*b-4*a*c))/2*a
	//replace the return 1
	return (-b - Math.sqrt (b * b - 4 * a * c)) / 2 * a;
    }


    public double xVertex (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the x value of the vertex of the quadratic equation
	//-b/(2*a)
	//replace the return 1
	return -b / (2 * a);
    }


    public double discrim (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the discriminant of the quadratic equation
	//b*b-4*a*c
	//replace the return 1
	return b * b - 4 * a * c;
    }


    public int numRoots (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the number of roots for the quadratic equation
	//call discrim method, make an if to return 0, 1, or 2.
	//replace the return 1

	if (discrim (a, b, c) > 0)
	    return 2;
	else if (discrim (a, b, c) == 0)
	    return 1;
	else
	    return 0;
    }


    public int absValue (int n)
    { //returns the absValue of n
	//replace the return 1
	return n;
    }
}


