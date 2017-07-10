public class PlantsVSZombies
{
    public static void main (String args[])
    {
	new PlantsVSZombies ();
    }


    public PlantsVSZombies ()
    {
	int num = 0;
	char quit = 'n';
	char newPlant, deletePlant;
	String plant[] = new String [20];
	int sunlight[] = new int [20];
	while (quit == 'n')
	{
	    char menu = IBIO.inputChar ("\n\tMain Menu\n\n\t(a) Add Plant\n\t(b) Delete Plants\n\t(c) Average Sunlight\n\t(d) Quit\n >> ");
	    if (menu == 'A' || menu == 'a')
	    {
		newPlant = IBIO.inputChar ("\tPlant:\t\t\tCost:\n\n\t(a) Sunflower\t\t50\n\t(b) Pea Shooter\t\t100\n\t(c) Cherry Bomb\t\t150\n\t(d) Wall-Nut\t\t50\n\t(e) Potato Mine\t\t25\n\t(f) Snow Pea\t\t175\n\t(g) Chomper\t\t150\n >> ");
		if (num == 20)
		    System.out.println ("You have reached the maximum number of plants. You cannot add any more plants.");
		else
		{
		    if (newPlant == 'A' || newPlant == 'a')
		    {
			plant [num] = "Sunflower";
			sunlight [num] = 50;
		    }
		    else if (newPlant == 'B' || newPlant == 'b')
		    {
			plant [num] = "Pea Shooter";
			sunlight [num] = 100;
		    }
		    else if (newPlant == 'C' || newPlant == 'c')
		    {
			plant [num] = "Cherry Bomb";
			sunlight [num] = 150;
		    }
		    else if (newPlant == 'D' || newPlant == 'd')
		    {
			plant [num] = "Wall-Nut";
			sunlight [num] = 50;
		    }
		    else if (newPlant == 'E' || newPlant == 'e')
		    {
			plant [num] = "Potato Mine";
			sunlight [num] = 25;
		    }
		    else if (newPlant == 'F' || newPlant == 'f')
		    {
			plant [num] = "Snow Pea";
			sunlight [num] = 175;
		    }
		    else
		    {
			plant [num] = "Chomper ";
			sunlight [num] = 150;
		    }
		    num++;
		}
	    }
	    else if (menu == 'B' || menu == 'b')
	    {
		int pos = -1;
		String find;
		deletePlant = IBIO.inputChar ("\n Which plant do you want to remove?\n\n\tPlant:\t\t\tCost:\n\n\t(a) Sunflower\t\t50\n\t(b) Pea Shooter\t\t100\n\t(c) Cherry Bomb\t\t150\n\t(d) Wall-Nut\t\t50\n\t(e) Potato Mine\t\t25\n\t(f) Snow Pea\t\t175\n\t(g) Chomper\t\t150\n >> ");
		if (deletePlant == 'a' || deletePlant == 'a')
		    find = "Sunflower";
		else if (deletePlant == 'b' || deletePlant == 'B')
		    find = "Pea Shooter";
		else if (deletePlant == 'c' || deletePlant == 'C')
		    find = "Cherry Bomb";
		else if (deletePlant == 'd' || deletePlant == 'D')
		    find = "Wall-Nut";
		else if (deletePlant == 'e' || deletePlant == 'E')
		    find = "Potato Mine";
		else if (deletePlant == 'f' || deletePlant == 'F')
		    find = "Snow Pea";
		else
		    find = "Chomper ";
		for (int i = 0 ; i < plant.length ; i++)
		{
		    if (plant [i] == find)
			pos = i;
		}
		if (pos == -1)
		    System.out.println ("There are no " + find.toLowerCase () + " plants in your garden to remove.");
		else
		{
		    plant [pos] = null;
		    for (int i = pos + 1 ; i < num ; i++)
		    {
			plant [i - 1] = plant [i];
			sunlight [i - 1] = sunlight [i];
		    }
		    plant [num - 1] = null;
		    sunlight [num - 1] = 0;
		    num--;
		}
	    }
	    else if (menu == 'c' || menu == 'C')
	    {
		int avg = 0;
		for (int i = 0 ; i < sunlight.length ; i++)
		    avg += sunlight [i];
		avg /= (num);
		System.out.println ("\nAverage sunlight is: " + avg);
	    }
	    else
		quit = 'y';
	    if (quit == 'n' && num != 0)
	    {
		System.out.println ("\n\tList of Items\n\n\tPlant:\t\t\tSunlight:");
		for (int i = 0 ; i < num ; i++)
		    System.out.println ("\t" + plant [i] + "\t\t" + sunlight [i]);
	    }
	}
	System.out.println ("Goodbye");
    }
}
