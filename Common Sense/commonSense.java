public class commonSense
{
    public static void main (String args[])
    {
	new commonSense ();
    }


    public commonSense ()
    { //Example: Days of the Week
	String week[] = {"Sunday", "Monday", "Tuesday", "Wednesday",
	    "Thursday", "Friday", "Saturday"};
	for (int i = 0 ; i < week.length ; i++)
	    System.out.print (week [i] + " ");
	System.out.println ("");
	//1. Roman Numerals
	String numeral[] = {"I", "II", "II", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
	for (int i = 0 ; i < numeral.length ; i++)
	    System.out.print (numeral [i] + " ");
	System.out.println ("");


	//2. Fibonacci Sequence
	int fib[] = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55};

	for (int i = 0 ; i < fib.length ; i++)
	    System.out.print (fib [i] + " ");
	System.out.println ("");


	//3. Rainbow Colours
	String rainbow[] = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};

	for (int i = 0 ; i < rainbow.length ; i++)
	    System.out.print (rainbow [i] + " ");
	System.out.println ("");


	//4. Counting Words
	String words[] = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
	for (int i = 0 ; i < words.length ; i++)
	    System.out.print (words [i] + " ");
	System.out.println ("");


	//5. Head & Shoulders Words
	String head[] = {"Head", "Shoulders", "Knees", "Toes", "Eyes", "Ears", "Mouth", "Nose"};
	for (int i = 0 ; i < head.length ; i++)
	    System.out.print (head [i] + " ");
	System.out.println ("");


	//6. Period Start Times
	String period[] = {"8:15", "9:40", "10:59", "12:14", "1:33"};
	for (int i = 0 ; i < period.length ; i++)
	    System.out.print (period [i] + " ");
	System.out.println ("");


	//7. Powers
	int powers[] = {1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
	for (int i = 0 ; i < powers.length ; i++)
	    System.out.print (powers [i] + " ");
	System.out.println ("");


	//8. Start of Alphabet
	char alpha[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i'};
	for (int i = 0 ; i < alpha.length ; i++)
	    System.out.print (alpha [i] + " ");
	System.out.println ("");
	//2. Fibonacci Sequence
	//3. Rainbow Colours
	//4. Counting Words
	//5. Head & Shoulders Words
	//6. Period start times
	//7. Powers
	//8. Start of Alphabet
    }
}
