public class Fish
{
    public static void main (String args[])
    {
	new Fish ();
    }


    public Fish ()
    {
	int sizes[] = {226, 400, 305, 233, 244, 224, 235, 238, 244, 222, 239, 233, 243,
	    221, 230, 237, 240, 309, 230, 236, 242, 222, 235, 237, 240,
	    220, 235, 238, 243, 222, 232, 232, 242};

	int sum = 0;

	for (int i = 0 ; i < sizes.length ; i++)
	{
	    sum = sum + sizes [i];
	}
	int average = sum / sizes.length;
	if (average > 200)
	    System.out.println ("The population is not getting enough food");
	System.out.println ("The population average is " + average);

	int max = 0;
	for (int i = 0 ; i < sizes.length ; i++)
	{


	    if (i == 0)
		max = sizes [i];
	    else if (sizes [i] > max)
		max = sizes [i];
	    else
		max = max;
	}
	if (max > 300)
	    System.out.println ("They are living long enough");
	else
	    System.out.println ("They are not living long enough");

    }
}

