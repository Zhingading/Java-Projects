    import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.JTable;

public class penguins extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2, card3, card4, card5, card6, card7;
    CardLayout cdLayout = new CardLayout ();
    JLabel picture;

    public void init ()
    {
	resize (300, 300);
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	screen6 ();
	screen7 ();
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    {
	card1 = new Panel ();
	JLabel title = new JLabel ("Draw a Penguin");
	title.setFont (new Font ("Arial", Font.BOLD, 20));
	picture = new JLabel (createImageIcon ("penguin1.jpg"));

	JButton back = new JButton ("Back");
	back.setActionCommand ("7");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.cyan);

	JButton next = new JButton ("Next");
	next.setActionCommand ("2");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.cyan);

	card1.add (title);
	card1.add (picture);
	card1.add (back);
	card1.add (next);

	p_card.add ("1", card1);
    }


    public void screen2 ()
    {
	card2 = new Panel ();
	JLabel title = new JLabel ("Draw a Penguin");
	title.setFont (new Font ("Arial", Font.BOLD, 20));

	picture = new JLabel (createImageIcon ("penguin2.jpg"));

	JButton back = new JButton ("Back");
	back.setActionCommand ("1");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.cyan);

	JButton next = new JButton ("Next");
	next.setActionCommand ("3");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.cyan);

	card2.add (title);
	card2.add (picture);
	card2.add (back);
	card2.add (next);

	p_card.add ("2", card2);
    }


    public void screen3 ()
    {
	card3 = new Panel ();
	JLabel title = new JLabel ("Draw a Penguin");
	title.setFont (new Font ("Arial", Font.BOLD, 20));

	picture = new JLabel (createImageIcon ("penguin3.jpg"));

	JButton back = new JButton ("Back");
	back.setActionCommand ("2");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.cyan);

	JButton next = new JButton ("Next");
	next.setActionCommand ("4");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.cyan);

	card3.add (title);
	card3.add (picture);
	card3.add (back);
	card3.add (next);

	p_card.add ("3", card3);
    }


    public void screen4 ()
    {
	card4 = new Panel ();
	JLabel title = new JLabel ("Draw a Penguin");
	picture = new JLabel (createImageIcon ("penguin4.jpg"));
	title.setFont (new Font ("Arial", Font.BOLD, 20));


	JButton back = new JButton ("Back");
	back.setActionCommand ("3");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.cyan);

	JButton next = new JButton ("Next");
	next.setActionCommand ("5");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.cyan);

	card4.add (title);
	card4.add (picture);
	card4.add (back);
	card4.add (next);

	p_card.add ("4", card4);
    }


    public void screen5 ()
    {
	card5 = new Panel ();
	JLabel title = new JLabel ("Draw a Penguin");
	title.setFont (new Font ("Arial", Font.BOLD, 20));

	picture = new JLabel (createImageIcon ("penguin5.jpg"));

	JButton back = new JButton ("Back");
	back.setActionCommand ("4");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.cyan);

	JButton next = new JButton ("Next");
	next.setActionCommand ("6");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.cyan);

	card5.add (title);
	card5.add (picture);
	card5.add (back);
	card5.add (next);

	p_card.add ("5", card5);
    }


    public void screen6 ()
    {
	card6 = new Panel ();
	JLabel title = new JLabel ("Draw a Penguin");
	title.setFont (new Font ("Arial", Font.BOLD, 20));

	picture = new JLabel (createImageIcon ("penguin6.jpg"));

	JButton back = new JButton ("Back");
	back.setActionCommand ("5");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.cyan);

	JButton next = new JButton ("Next");
	next.setActionCommand ("7");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.cyan);

	card6.add (title);
	card6.add (picture);
	card6.add (back);
	card6.add (next);

	p_card.add ("6", card6);
    }


    public void screen7 ()
    {
	card7 = new Panel ();
	JLabel title = new JLabel ("Draw a Penguin");
	title.setFont (new Font ("Arial", Font.BOLD, 20));

	picture = new JLabel (createImageIcon ("penguin7.jpg"));

	JButton back = new JButton ("Back");
	back.setActionCommand ("6");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.cyan);

	JButton next = new JButton ("Next");
	next.setActionCommand ("1");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.cyan);

	card7.add (title);
	card7.add (picture);
	card7.add (back);
	card7.add (next);

	p_card.add ("7", card7);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("3"))
	    cdLayout.show (p_card, "3");
	else if (e.getActionCommand ().equals ("4"))
	    cdLayout.show (p_card, "4");
	else if (e.getActionCommand ().equals ("5"))
	    cdLayout.show (p_card, "5");
	else if (e.getActionCommand ().equals ("6"))
	    cdLayout.show (p_card, "6");
	else if (e.getActionCommand ().equals ("7"))
	    cdLayout.show (p_card, "7");
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = penguins.class.getResource (path);
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





