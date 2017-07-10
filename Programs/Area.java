public class Area
{
    public static void main (String args[])
    {
	new Area ();
    }


    public Area ()
    {
	char more = 'y';

	while (more == 'Y' || more == 'y')
	{
	    printmenu ();
	    int answer = IBIO.inputInt ("Which object do you have? (1-5) ");
	    double area = -1;
	    if ((answer < 1) || (answer > 5))
		System.out.println ("ERROR: Choose an object from 1-5");
	    else if (answer == 1)
		area = circle ();
	    else if (answer == 2)
		area = rectangle ();
	    else if (answer == 3)
		area = triangle ();
	    else if (answer == 4)
		area = square ();
	    else if (answer == 5)
		area = sphere ();
	    System.out.println ("The area is " + area + " units squared");


	    System.out.println ("");
	    more = IBIO.inputChar ("Do you want to find the area of anything else? (y/n) ");
	    System.out.println ("");
	} //while

	System.out.println ("Goodbye!");
    } //constructor


    public void printmenu ()
    {

	System.out.println ("*** Menu ***");
	System.out.println ("1. circle");
	System.out.println ("2. rectangle");
	System.out.println ("3. triangle");
	System.out.println ("4. square");
	System.out.println ("5. sphere");
	System.out.println ("");
    }


    public double circle ()
    {
	double radius = IBIO.inputDouble ("What is the radius? ");

	return (Math.PI * Math.pow (radius, 2));

    }


    public double rectangle ()
    {
	double length = IBIO.inputDouble ("What is the length of the rectangle? ");
	double width = IBIO.inputDouble ("What is the width of the rectangle? ");

	return (length * width);
    } //rectangle


    public double triangle ()
    {
	double base = IBIO.inputDouble ("What is the base of the triangle? ");
	double height = IBIO.inputDouble ("What is the height of the triangle? ");
	return ((base * height) / 2);
    } //triangle


    public double square ()
    {
	double sidelength = IBIO.inputDouble ("What is the side length of the square? ");
	return (Math.pow (sidelength, 2));
    } //square


    public double sphere ()
    {
	double sphereradius = IBIO.inputDouble ("What is the radius of the sphere? ");
	return (4 * Math.pow (sphereradius, 2));
    } //sphere
} //class
