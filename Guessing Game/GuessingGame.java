import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class GuessingGame extends Applet implements ActionListener
{
    public void init ()
    {
	resize (300, 350);
	setBackground (Color.yellow);
	JLabel title = new JLabel ("GUESSING GAME");
	title.setFont (new Font ("Jokerman", Font.BOLD, 25));
	title.setForeground (Color.black);

	JLabel ins = new JLabel ("The number is between 1 and 100. ");

	JLabel your = new JLabel ("Your Guess: ");
	JTextField guess = new JTextField (3);

	JLabel pic = new JLabel (createImageIcon ("hmm.jpg"));

	JButton gess = new JButton ("Guess");

	JLabel ins2 = new JLabel ("Type in a number and press Guess");

	add (title);
	add (ins);
	add (your);
	add (guess);
	add (gess);
	add (pic);
	add (ins2);
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = GuessingGame.class.getResource (path);
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


    public void actionPerformed (ActionEvent e)
    {

    }
}
