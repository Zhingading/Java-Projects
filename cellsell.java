public class cellsell
{
    public static void main (String args[])
    {
	new cellsell ();
    }


    public cellsell ()
    {
	int j = 1;
	while (j > 0)
	{
	    System.out.println ("__________________________________________");
	    System.out.println ("Times program has been used this session: " + j );
	    System.out.println ("");
	    int daytime = IBIO.inputInt ("How many daytime minutes do you use? ");
	    int evening = IBIO.inputInt ("How many evening minutes do you use? ");
	    int weekend = IBIO.inputInt ("How many weekend minutes do you use? ");
	    System.out.println ("");

	    double Adaytime = ((daytime - 100) * 0.25);
	    if (daytime <= 100)
		Adaytime = 0;

	    double Aevening = (evening * 0.15);

	    double Aweekend = (weekend * 0.20);

	    double Atotal = (Adaytime + Aevening + Aweekend);

	    System.out.println ("Plan A costs $" + Atotal);


	    double Bdaytime = ((daytime - 250) * (0.45));
	    if (daytime <= 250)
		Bdaytime = 0;

	    double Bevening = (evening * 0.35);

	    double Bweekend = (weekend * 0.25);

	    double Btotal = (Bdaytime + Bevening + Bweekend);

	    System.out.println ("Plan B costs $" + Btotal);
	    System.out.println ("");

	    if (Btotal > Atotal)
		System.out.println ("Therefore Plan A is cheapest");

	    else if (Atotal > Btotal)
		System.out.println ("Therefore Plan B is cheapest");

	   else
		System.out.println ("Plan A and B cost the same");
	    System.out.println ("");
	    j++;
	}
    }
}

