import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class volume extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1;
    CardLayout cdLayout = new CardLayout ();
    JLabel blank1;
    JLabel blank2;
    JButton ok;
    JLabel picture;

    public void init ()
    {
	resize (500, 500);
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	blank1 = new JLabel ("blank");
	blank2 = new JLabel ("blank");
	main ();


	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void main ()
    {
	card1 = new Panel ();
	card1.setBackground (Color.white);
	JLabel title = new JLabel ("The Volume Program");
	JLabel instruction = new JLabel ("Press a button to find the volume");

	JButton sphere = new JButton ("Sphere");
	sphere.setActionCommand ("sphere");
	sphere.addActionListener (this);

	JButton cylinder = new JButton ("Cylinder");
	cylinder.setActionCommand ("cylinder");
	cylinder.addActionListener (this);

	JButton rectPrism = new JButton ("Rectangular Prism");
	rectPrism.setActionCommand ("prism");
	rectPrism.addActionListener (this);

	JButton cone = new JButton ("Cone");
	cone.setActionCommand ("cone");
	cone.addActionListener (this);

	picture = new JLabel ();
	card1.add (title);
	card1.add (instruction);
	card1.add (sphere);
	card1.add (cylinder);
	card1.add (rectPrism);
	card1.add (cone);
	card1.add (picture);
	card1.add (blank1);
	card1.add (blank2);

	p_card.add ("1", card1);
    }






    public void actionPerformed (ActionEvent e)
    {

	if (e.getActionCommand ().equals ("sphere"))
	{
	    cdLayout.show (p_card, "1");
	    int radius = Integer.parseInt (JOptionPane.showInputDialog ("Enter a radius:"));
	    double volume = sphereVolume (radius);
	    picture.setIcon (createImageIcon ("sphere.gif"));
	    volume = round (volume, 1);
	    blank1.setText ("Radius = " + radius + "cm.");
	    blank2.setText ("The volume is " + volume + " cm^3.");
	}

	else if (e.getActionCommand ().equals ("cylinder"))
	{
	    cdLayout.show (p_card, "1");
	    int height = Integer.parseInt (JOptionPane.showInputDialog ("Enter a height:"));
	    int radius = Integer.parseInt (JOptionPane.showInputDialog ("Enter a radius:"));
	    picture.setIcon (createImageIcon ("cylinder.png"));
	    double volume = cylinderVolume (height, radius);
	    volume = round (volume, 1);
	    blank1.setText ("Height = " + height + " cm. Radius = " + radius + "cm.");
	    blank2.setText ("The volume is " + volume + " cm^3.");
	}


	else if (e.getActionCommand ().equals ("cone"))
	{
	    cdLayout.show (p_card, "1");
	    int height = Integer.parseInt (JOptionPane.showInputDialog ("Enter a height:"));
	    int radius = Integer.parseInt (JOptionPane.showInputDialog ("Enter a radius:"));
	    picture.setIcon (createImageIcon ("cone.gif"));
	    double volume = coneVolume (radius, height);
	    volume = round (volume, 1);
	    blank1.setText ("Height = " + height + " cm. Radius = " + radius + "cm.");
	    blank2.setText ("The volume is " + volume + " cm^3.");
	}

	else if (e.getActionCommand ().equals ("prism"))
	{
	    cdLayout.show (p_card, "1");
	    int height = Integer.parseInt (JOptionPane.showInputDialog ("Enter a height:"));
	    int width = Integer.parseInt (JOptionPane.showInputDialog ("Enter a width:"));
	    int length = Integer.parseInt (JOptionPane.showInputDialog ("Enter a length:"));
	    picture.setIcon (createImageIcon ("rectangle.jpg"));
	    double volume = prismVolume (width, height, length);
	    volume = round (volume, 1);
	    blank1.setText ("Height = " + height + " cm. Width = " + width + "cm. Length = " + length + "cm.");
	    blank2.setText ("The volume is " + volume + " cm^3.");
	}

    }


    public double sphereVolume (int radius)
    {
	return Math.pow (radius, 3) * Math.PI * (4 / 3);
    }


    public double cylinderVolume (int height, int radius)
    {
	return radius * radius * Math.PI * height;
    }


    public double coneVolume (int radius, int height)
    {
	return Math.pow (radius, 2) * Math.PI * (height / 3);
    }


    public double prismVolume (int width, int height, int length)
    {
	return width * length * height;
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


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = volume.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}

	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}


