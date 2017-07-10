import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Something extends Applet implements ActionListener
{
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    
    public void init ()
    {
	setBackground (Color.cyan);
	JLabel title = new JLabel ("The Great Something Something");
	title.setForeground (Color.orange);
	title.setFont (new Font ("Arial", Font.BOLD, 19));
	JLabel rules = new JLabel ("Press the buttons to change the words.");
	b1 = new JButton ("The");

	b2 = new JButton ("Large");

	b3 = new JButton ("Lion");

	b4 = new JButton ("Pounced");

	b5 = new JButton ("Onto");

	b6 = new JButton ("The");

	b7 = new JButton ("Tiny");

	b8 = new JButton ("Chicken");

	setBackground (Color.white);
	resize (300, 450);


	b1.addActionListener (this);
	b1.setActionCommand ("1");

	b2.addActionListener (this);
	b2.setActionCommand ("2");

	b3.addActionListener (this);
	b3.setActionCommand ("3");

	b4.addActionListener (this);
	b4.setActionCommand ("4");

	b5.addActionListener (this);
	b5.setActionCommand ("5");

	b6.addActionListener (this);
	b6.setActionCommand ("6");

	b7.addActionListener (this);
	b7.setActionCommand ("7");

	b8.addActionListener (this);
	b8.setActionCommand ("8");

	add (title);
	add (rules);
	add (b1);
	add (b2);
	add (b3);
	add (b4);
	add (b5);
	add (b6);
	add (b7);
	add (b8);

	b1.setPreferredSize (new Dimension (250, 38));
	b2.setPreferredSize (new Dimension (250, 38));
	b3.setPreferredSize (new Dimension (250, 38));
	b4.setPreferredSize (new Dimension (250, 38));
	b5.setPreferredSize (new Dimension (250, 38));
	b6.setPreferredSize (new Dimension (250, 38));
	b7.setPreferredSize (new Dimension (250, 38));
	b8.setPreferredSize (new Dimension (250, 38));
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b1.setText ("The");
	    else if (r == 1)
		b1.setText ("A");
	    else
		b1.setText ("This");

	}


	if (e.getActionCommand ().equals ("2"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b2.setText ("Miniscule");
	    else if (r == 1)
		b2.setText ("Large");
	    else
		b2.setText ("Scary");

	}


	if (e.getActionCommand ().equals ("3"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b3.setText ("Lion");
	    else if (r == 1)
		b3.setText ("Giraffe");
	    else
		b3.setText ("Zebra");

	}


	if (e.getActionCommand ().equals ("4"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b4.setText ("Pounced");
	    else if (r == 1)
		b4.setText ("Slipped");
	    else
		b4.setText ("Crawled");

	}


	if (e.getActionCommand ().equals ("5"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b5.setText ("Onto");
	    else if (r == 1)
		b5.setText ("With");
	    else
		b5.setText ("Beside");

	}


	if (e.getActionCommand ().equals ("6"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b6.setText ("The");
	    else if (r == 1)
		b6.setText ("A");
	    else
		b6.setText ("This");
	    b6.setPreferredSize (new Dimension (250, 38));
	}


	if (e.getActionCommand ().equals ("7"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b7.setText ("Tiny");
	    else if (r == 1)
		b7.setText ("Smelly");
	    else
		b7.setText ("Freezing");

	}


	if (e.getActionCommand ().equals ("8"))
	{
	    int r = (int) (Math.random () * 3);
	    if (r == 0)
		b8.setText ("Mouse");
	    else if (r == 1)
		b8.setText ("Meerkat");
	    else
		b8.setText ("Frog");

	}
    }
}
