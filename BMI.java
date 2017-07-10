public class BMI
{
    public static void main (String args[])
    {
	new BMI ();
    }


    public BMI ()
    {
	System.out.println ("Welcome to the Body Mass Index Calculator.");
	int j = 1;
	while (j > 0)
	{
	    double height = IBIO.inputDouble ("Enter your height (In centimetres): ");
	    double weight = IBIO.inputDouble ("Enter your weight (In kilograms): ");
	    double actualheight = (height / 100);
	    double bodymassindex = ((weight) / (actualheight * actualheight));

	    System.out.println ("Your BMI is " + bodymassindex);

	    if (bodymassindex > 25.0)
		System.out.println ("This indicates that you are Overweight.");
	    else if (bodymassindex <= 18.5)
		System.out.println ("This indicates that you are at a under Weight");
	    else
		System.out.println ("This indicates you are Normal weight");
	    System.out.println ("");

	}
    }
}


