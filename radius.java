public class radius
{
    public static void main (String args[])
    {
	new radius ();
    }


    public radius ()
    {
	double radius = IBIO.inputInt ("Enter a radius value: ");
	System.out.println ("");
	System.out.println ("On a circle...");
	double diameter = (radius * 2);
	System.out.println ("The diameter would be " + diameter + " units");
	double area = (Math.PI * Math.pow (radius, 2));
	System.out.println ("The area would be " + area + " units squared");
	double circumference = (2 * Math.PI * radius);
	System.out.println ("The circumference would be " + circumference + " units");
	System.out.println ("");
	System.out.println ("On a sphere...");
	double surface = (4 * Math.PI * Math.pow (radius, 2));
	System.out.println ("The surface area would be " + surface + " units squared");
	double volume = ((4 * Math.PI * Math.pow (radius, 3)) / 3);
	System.out.println ("The volume would be " + volume + " units cubed");
	System.out.println ("");

	System.out.println ("      x  x              x  x");
	System.out.println ("   x        x        x        x");
	System.out.println ("  x          x      x          x");
	System.out.println ("  x          x      x          x");
	System.out.println ("   x        x        x        x");
	System.out.println ("      x  x              x  x");
    }
}

