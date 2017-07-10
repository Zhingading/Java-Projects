import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OddEven extends Applet implements ActionListener
{
    JLabel comp;
    JLabel result;
    JLabel score;
    JTextField in;
    int uscore = 0;
    int cscore = 0;

    public void init ()
    {
	resize (420, 600);
	JLabel title = new JLabel ("Odds and Evens");
	title.setFont (new Font ("Jokerman", Font.BOLD, 24));
	add (title);

	JLabel rules = new JLabel ("       You pick a number between 0 and 5.");
	JLabel rules1 = new JLabel ("The computer picks a number between 0 and 5.");
	JLabel rules2 = new JLabel ("If the sum is odd then you win. If it is even, the computer wins");
	add (rules);
	add (rules1);
	add (rules2);

	JLabel image = new JLabel (createImageIcon ("oddeven.jpg"));
	add (image);

	JLabel input = new JLabel ("                                           Enter your choice:  ");
	in = new JTextField (3);
	add (input);
	add (in);

	JButton enter = new JButton ("Enter");
	enter.addActionListener (this);
	enter.setActionCommand ("enter");
	add (enter);

	comp = new JLabel ("        Computer Choice:                                     ");
	add (comp);
	result = new JLabel ("");
	add (result);
	score = new JLabel ("              Score:                                                    ");
	add (score);


    }


    public void actionPerformed (ActionEvent e)
    {
	int compnum = (int) (Math.random () * 5 + 0);
	String user = in.getText ();
	int usernum = Integer.parseInt (user);
	int sum = compnum + usernum;

	if (e.getActionCommand ().equals ("enter"))
	{
	    comp.setText ("Computer Choice: " + compnum);

	    if (sum % 2 == 0)
	    {
		cscore++;
		result.setText ("The computer won!");
	    }

	    else
	    {
		uscore++;
		result.setText ("You won!");
	    }
	    score.setText ("Score: Comp: " + cscore + ". You: " + uscore + ".");
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = OddEven.class.getResource (path);
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

