public class goldilocks
{
    public static void main (String args[])
    {
	new goldilocks();
    }


    public goldilocks()
    {
	int bowl1 = IBIO.inputInt("Enter the weight of the first bowl. ");
	int bowl2 = IBIO.inputInt("Enter the weight of the second bowl. ");
	int bowl3 = IBIO.inputInt("Enter the weight of the third bowl. ");
	System.out.println("");

	int middle = Math.min (Math.min (Math.max (bowl1, bowl2), Math.max (bowl2, bowl3)), Math.max (bowl1, bowl3));
	System.out.println ("The medium bowl weight is " + middle);
    }
}
