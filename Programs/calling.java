public class calling
{
    public static void main (String args[])
    {
	new calling ();
    }


    //The purpose of this assignment is to practice calling methods.

    //ask for input from the user for each of the parameters
    //call each method and store its result
    //print out the result.

    public calling ()
    {
	//------example for round---------

	//1. ask for num and digit - parameters
	System.out.println ("Rounding");
	double num = IBIO.inputDouble ("What is the decimal number? ");
	while (num <= 0)
	    num = IBIO.inputDouble ("What is the decimal number? ");

	int digit = IBIO.inputInt ("Round to how many digits? ");
	//2. call method - pass in num and digit, save in r
	double r = round (num, digit);
	//3. print out new value of r
	System.out.println ("That is : " + r);

	//----A--isOdd---------
	if (Odd (num) == true)
	    System.out.println ("This is an odd number");
	else
	    System.out.println ("This is an even number");


	//----B--isGreater5---------
	if (Greater5 (num))
	    System.out.println ("It is greater than 5");
	else
	    System.out.println ("It is not greater than 5");

	//----C--toCelsius---------
	System.out.println ("In celsius this would be " + Celsius (num));

	//----D--toFahrenheit---------
	System.out.println ("In fahrenheit this would be " + Fahrenheit (num));

	//----E--isPrime---------
	int addone = IBIO.inputInt ("Please enter another number >>");

	if (Prime (addone))
	    System.out.println ("This is a prime number \n");
	else
	    System.out.println ("This isn't a prime number \n");

	//----F--HI---------
	//note: this is a void method.
	HI ();

	//----G--oneClown---------
	//note: this is a void method.

	oneClown ();
	//----H--lala---------
	// note: this is a void method. It doesn't need a variable or to be printed.
	// Just get each the input and call it.
	lala (addone);


	//----I--Clown---------
	// note: this is a void method. It doesn't need a variable or to be printed.
	// Just get each the input and call it.

	Clown (addone);
    }


    public double round (double num, int digit)
    {
	double num2 = num * Math.pow (10, digit);
	double num3 = (num2 - ((int) num2)) * 10;
	num2 = ((int) num2);
	if (num3 >= 5)
	    num2++;
	return num2 /= Math.pow (10, digit);
    }


    public boolean Odd (double num)
    { //checks if num is odd.
	//returns true if it is, false otherwise
	if (num % 2 != 0)
	    return true;
	else
	    return false;
    }


    public boolean Greater5 (double num)
    { //checks if num is greater than 5
	//returns true if it is, false otherwise
	if (num > 5)
	    return true;

	return false;
    }


    public double Celsius (double fahrenheit)
    { //takes a fahrenheit temperature and returns the celsius of it
	return (fahrenheit - 32) * 5 / 9;
    }


    public double Fahrenheit (double celsius)
    { //takes a celsius temperature and returns the fahrenheit of it
	return celsius * 9 / 5 + 32;
    }


    public boolean Prime (int n)
    { //checks if n is a prime number
	//returns true if it is, false otherwise
	int stop = n - 1;
	while (stop > 1)
	{
	    if (n % stop == 0)
		return false;
	    stop--;
	}
	return true;
    }


    public void HI ()
    {
	System.out.println ("*   *   ***");
	System.out.println ("*   *    * ");
	System.out.println ("*****    * ");
	System.out.println ("*   *    * ");
	System.out.println ("*   *   ***");
	System.out.println ("");
    }


    public void oneClown ()
    {
	System.out.println ("      {_}");
	System.out.println ("      /*\\");
	System.out.println ("     /_*_\\");
	System.out.println ("    {('o')}");
	System.out.println (" C{{([^*^])}}D");
	System.out.println ("     [ * ]");
	System.out.println ("    /  Y  \\");
	System.out.println ("   _\\__|__/_");
	System.out.println ("  (___/ \\___)");

    }


    public void lala (int x)
    { //x is the number of 'la's on the screen
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("la ");
	System.out.println ("");
    }


    public void Clown (int x)
    { //x is a number of clowns that will be printed on the screen
	//x should be between 1-6 to fit on the screen

	System.out.println ("\nHow many clowns are on the screen?\n");
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("      {_}     ");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("      /*\\     ");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("     /_*_\\    ");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("    {('o')}   ");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print (" C{{([^*^])}}D");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("     [ * ]    ");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("    /  Y  \\   ");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("   _\\__|__/_  ");
	System.out.println ();
	for (int i = 0 ; i < x ; i++)
	    System.out.print ("  (___/ \\___) ");
	System.out.println ();

    }
}
