import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class spinner extends Applet implements ActionListener
{
    JLabel picture;
    public void init ()
    {

	JLabel title = new JLabel ("Click to spin the spinner");
	JButton roll = new JButton ("Spin.");
	picture = new JLabel ();
	setBackground (Color.white);
	resize (800, 500);

	roll.addActionListener (this);
	roll.setActionCommand ("spinning");
	add (picture);

	add (title);
	add (roll);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("spinning"))
	{

	    int n = (int)
		((Math.random () * 4) + 1);
	    showStatus ("You rolled a " + n + ".");
	    if (n == 1)
		picture.setIcon (createImageIcon ("1.png"));
	    else if (n == 2)
		picture.setIcon (createImageIcon ("2.png"));
	    else if (n == 3)
		picture.setIcon (createImageIcon ("3.png"));
	    else
		picture.setIcon (createImageIcon ("4.png"));

	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = spinner.class.getResource (path);
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
