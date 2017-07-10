import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Dice extends Applet implements ActionListener
{
    JLabel picture;
    public void init ()
    {

	JLabel title = new JLabel ("Click to Doll the Dice");
	JButton roll = new JButton ("Roll.");
	picture = new JLabel ();
	setBackground (Color.white);
	resize (800, 500);
	setBackground (Color.red);

	roll.addActionListener (this);
	roll.setActionCommand ("rolling");
	add (picture);

	add (title);
	add (roll);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("rolling"))
	{

	    int n = (int)
		((Math.random () * 6) + 1);
	    showStatus ("You rolled a " + n + ".");
	    if (n == 1)
		picture.setIcon (createImageIcon ("1.png"));
	    else if (n == 2)
		picture.setIcon (createImageIcon ("2.png"));
	    else if (n == 3)
		picture.setIcon (createImageIcon ("3.png"));
	    else if (n == 4)
		picture.setIcon (createImageIcon ("4.png"));
	    else if (n == 5)
		picture.setIcon (createImageIcon ("5.png"));
	    else
		picture.setIcon (createImageIcon ("6.png"));
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = Dice.class.getResource (path);
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
