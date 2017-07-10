import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class LoveMeter extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2, card3;
    CardLayout cdLayout = new CardLayout ();
    JLabel result;
    JLabel message;

    public void init ()
    {
	resize (320, 700);
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    {
	card1 = new Panel ();
	JButton start = new JButton ();
	start.setIcon (createImageIcon ("lovemeter.png"));
	start.setActionCommand ("2");
	start.addActionListener (this);

	card1.add (start);
	p_card.add ("1", card1);
    }


    public void screen2 ()
    {
	card2 = new Panel ();
	JLabel ins = new JLabel ("   Enter her and his names and dates of birth.   ");
	ins.setFont (new Font ("Arial", Font.BOLD, 12));

	JLabel pic = new JLabel (createImageIcon ("male.jpg"));
	JTextField m = new JTextField (14);
	JTextField m2 = new JTextField (7);

	JLabel pic2 = new JLabel (createImageIcon ("female.jpg"));
	JTextField f = new JTextField (14);
	JTextField f2 = new JTextField (7);

	JButton next = new JButton ("Get Result!");
	next.setActionCommand ("3");
	next.addActionListener (this);

	card2.add (ins);
	card2.add (pic);
	card2.add (m);
	card2.add (m2);
	card2.add (pic2);
	card2.add (f);
	card2.add (f2);
	card2.add (next);
	p_card.add ("2", card2);
    }


    public void screen3 ()
    {
	card3 = new Panel ();
	JLabel picture = new JLabel (createImageIcon ("meter.png"));

	result = new JLabel ("");
	result.setFont (new Font ("Arial", Font.BOLD, 20));

	message = new JLabel ("");
	message.setFont (new Font ("Arial", Font.BOLD, 12));

	JButton reset = new JButton ("Reset");
	reset.setActionCommand ("1");
	reset.addActionListener (this);

	card3.add (picture);
	card3.add (result);
	card3.add (message);
	card3.add (reset);
	p_card.add ("3", card3);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("3"))
	    cdLayout.show (p_card, "3");
	{
	    long num = Math.round (Math.random () * 100) + 1;
	    {
		if (num < 25)
		    message.setText ("Never Worse!");
		else if (num < 50)
		    message.setText ("Not the worst..");
		else if (num < 75)
		    message.setText ("Not the best..");
		else
		    message.setText ("Never better!");
	    }
	    result.setText (num + "%");
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = LoveMeter.class.getResource (path);
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












