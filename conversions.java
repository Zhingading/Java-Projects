public class conversions
{
  public static void main(String args[])
     {  
	new conversions ();
     }
  public conversions()
  {
  double hour = IBIO.inputDouble("What is the time in hours?: ");

  double minutes = (hour*60);
  System.out.println("Therefore it is : " + minutes + " minute(s)" );
  System.out.println("");
  System.out.println("");
  
  double meter = IBIO.inputDouble("What is the length in meters?: ");

  double inches = (meter*39.37);
  System.out.println("Therefore it is " + inches + " inch(s)" );
  System.out.println("");
  System.out.println("");
  
  double mile = IBIO.inputDouble("What is the distance in miles?: ");

  double kilometer = (mile*1.6);
  System.out.println("Therefore it is " + kilometer + " kilometer(s)");
  System.out.println("");
  System.out.println("");
  
  double kilogram = IBIO.inputDouble("What is the weight in kilograms: ");
  
  double pound = (kilogram*2.2046);
  System.out.println("Therefore it is " + pound + " pound(s)");
  System.out.println("");
  System.out.println("");
  
  double fahrenheit = IBIO.inputDouble("What is the temperature in fahrenheit?: ");
  
  double celsius = ((fahrenheit-32)*5/9);
  System.out.println("Therefore it is " + celsius + " degrees Celsius");
  System.out.println(""); 
  System.out.println("");
  

  }  
}
