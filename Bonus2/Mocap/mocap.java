public class mocap
{
    public static void main (String args[])
    {
	new mocap ();
    }


    public mocap ()
    { //data
	int x[] = {234, 345, 348, 456, 567, 765, 654, 544, 587, 578};
	int y[] = {456, 456, 345, 347, 346, 467, 562, 562, 532, 576};
	int z[] = {345, 324, 312, 317, 304, 305, 307, 308, 309, 298};

	System.out.println ("");
	//loop
	for (int i = 0 ; i < x.length ; i++)
	{
	    System.out.println ("(" + x [i] + ", " + y [i] + ", " + z [i] + ")");
	}

	System.out.println ("\n");
	//minimum values
	int min = x [0];
	for (int i = 0 ; i < x.length ; i++)
	{
	    if (min > x [i])
		min = x [i];
	}
	System.out.println ("\nThe minimum x is: " + min);

	min = y [0];
	for (int i = 0 ; i < y.length ; i++)
	{
	    if (min > y [i])
		min = y [i];
	}
	System.out.println ("\nThe minimum y is: " + min);

	min = z [0];
	for (int i = 0 ; i < z.length ; i++)
	{
	    if (min > z [i])
		min = z [i];
	}
	System.out.println ("\nThe minimum z is: " + min);

	System.out.println ("\n");
	//Maximum values
	int max = x [0];
	for (int i = 0 ; i < x.length ; i++)
	{
	    if (max < x [i])
		max = x [i];
	}
	System.out.println ("\nThe maximum x is: " + max);

	max = y [0];
	for (int i = 0 ; i < y.length ; i++)
	{
	    if (max < y [i])
		max = y [i];
	}
	System.out.println ("\nThe maximum y is: " + max);

	max = z [0];
	for (int i = 0 ; i < z.length ; i++)
	{
	    if (max < z [i])
		max = z [i];
	}
	System.out.println ("\nThe maximum z is: " + max);
	System.out.println ("\n");

	//Averages
	int sum = 0;
	double average;

	for (int i = 0 ; i < x.length ; i++)
	{
	    sum = sum + x [i];
	}
	average = (double) sum / x.length;
	System.out.println ("\nThe average x is: " + average);

	sum = 0;
	for (int i = 0 ; i < y.length ; i++)
	{
	    sum = sum + y [i];
	}
	average = (double) sum / y.length;
	System.out.println ("\nThe average y is: " + average);

	sum = 0;
	for (int i = 0 ; i < z.length ; i++)
	{
	    sum = sum + z [i];
	}
	average = (double) sum / z.length;
	System.out.println ("\nThe average z is: " + average);


	System.out.println ("\n");

	//Control Points
	System.out.println ("Control points close");
	for (int i = 0 ; i < x.length ; i++)
	{
	    if (x [i] < 550)
	    {
		System.out.println ("(" + x [i] + ", " + y [i] + ", " + z [i] + ")");
	    }
	}

	System.out.println ("\n");

	//In Focus Points
	System.out.println ("In focus points");
	for (int i = 0 ; i < x.length ; i++)
	{
	    if (z [i] <= 315 && z [i] >= 304)
	    {
		System.out.println ("(" + x [i] + ", " + y [i] + ", " + z [i] + ")");
	    }
	}
    }
}
