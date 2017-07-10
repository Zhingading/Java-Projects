public class average
{
 public static void main (String args[])
 {
 new average();
 }
    public average()
   {
   int mark1 = IBIO.inputInt("Enter the first students mark: ");
   int mark2 = IBIO.inputInt("Enter the second students mark: ");
   int mark3 = IBIO.inputInt("Enter the third students mark: ");
   int mark4 = IBIO.inputInt("Enter the fourth students mark: ");
   int mark5 = IBIO.inputInt("Enter the fifth students mark: ");
   int mark6 = IBIO.inputInt("Enter the sixth students mark: ");
 
   System.out.println ("");
   
   int averagemark = (mark1 + mark2 + mark3 + mark4 + mark5 + mark6) / 6;
   
   System.out.println ("Average Mark: " + averagemark);
   }
}
