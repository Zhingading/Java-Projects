import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FindMe extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2, card3, card4, card5, card6, card7;
    CardLayout cdLayout = new CardLayout ();

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	screen3 ();
	screen4 ();
	screen5 ();
	screen6 ();
	resize (675, 600);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    {
	card1 = new Panel ();
	JLabel title = new JLabel ("Find Me!");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.red);
	JLabel picture = new JLabel (createImageIcon ("hall.jpg"));
	JLabel subhead = new JLabel ("             You are in the main hall.                  ");
	subhead.setFont (new Font ("Arial", Font.BOLD, 25));
	subhead.setForeground (Color.blue);
	JLabel ins = new JLabel ("                                      Look throughout my house to find me.                                       ");
	ins.setFont (new Font ("Arial", Font.BOLD, 15));

	JButton billiard = new JButton ("Billiard Room");
	billiard.setActionCommand ("2");
	billiard.addActionListener (this);

	JButton dining = new JButton ("Dining Room");
	dining.setActionCommand ("3");
	dining.addActionListener (this);

	JButton conservatory = new JButton ("Conservatory");
	conservatory.setActionCommand ("4");
	conservatory.addActionListener (this);

	JButton ballroom = new JButton ("Ballroom");
	ballroom.setActionCommand ("5");
	ballroom.addActionListener (this);

	JButton bedroom = new JButton ("Bedroom");
	bedroom.setActionCommand ("6");
	bedroom.addActionListener (this);

	card1.add (title);
	card1.add (picture);
	card1.add (subhead);
	card1.add (ins);
	card1.add (billiard);
	card1.add (dining);
	card1.add (conservatory);
	card1.add (ballroom);
	card1.add (bedroom);

	p_card.add ("1", card1);
    }


    public void screen2 ()
    {
	card2 = new Panel ();
	JLabel picture = new JLabel (createImageIcon ("billiard.jpg"));
	JLabel title = new JLabel ("Billiard Room");
	title.setFont (new Font ("Arial", Font.BOLD, 25));
	title.setForeground (Color.red);
	JLabel message = new JLabel ("I'm not here! Keep Looking.");
	message.setFont (new Font ("Arial", Font.BOLD, 15));

	JButton back = new JButton ("Back to Hall");
	back.setActionCommand ("1");
	back.addActionListener (this);

	card2.add (picture);
	card2.add (title);
	card2.add (message);
	card2.add (back);

	p_card.add ("2", card2);
    }


    public void screen3 ()
    {
	card3 = new Panel ();
	JLabel picture = new JLabel (createImageIcon ("dining.jpg"));
	JLabel title = new JLabel ("Dining Room");
	title.setFont (new Font ("Arial", Font.BOLD, 25));
	title.setForeground (Color.red);
	JLabel message = new JLabel ("I'm not here! Keep Looking.");
	message.setFont (new Font ("Arial", Font.BOLD, 15));

	JButton back = new JButton ("Back to Hall");
	back.setActionCommand ("1");
	back.addActionListener (this);

	card3.add (picture);
	card3.add (title);
	card3.add (message);
	card3.add (back);

	p_card.add ("3", card3);
    }


    public void screen4 ()
    {
	card4 = new Panel ();
	JLabel picture = new JLabel (createImageIcon ("conservatory.jpg"));
	JLabel title = new JLabel ("Conservatory");
	title.setFont (new Font ("Arial", Font.BOLD, 25));
	title.setForeground (Color.red);
	JLabel message = new JLabel ("I'm not here! Keep Looking.");
	message.setFont (new Font ("Arial", Font.BOLD, 15));

	JButton back = new JButton ("Back to Hall");
	back.setActionCommand ("1");
	back.addActionListener (this);

	card4.add (picture);
	card4.add (title);
	card4.add (message);
	card4.add (back);

	p_card.add ("4", card4);
    }


    public void screen5 ()
    {
	card5 = new Panel ();
	JLabel picture = new JLabel (createImageIcon ("ballroom.jpg"));
	JLabel title = new JLabel ("Ballroom   ");
	title.setFont (new Font ("Arial", Font.BOLD, 25));
	title.setForeground (Color.red);
	JLabel message = new JLabel ("I'm not here! Keep Looking.");
	message.setFont (new Font ("Arial", Font.BOLD, 15));

	JButton back = new JButton ("Back to Hall");
	back.setActionCommand ("1");
	back.addActionListener (this);

	card5.add (picture);
	card5.add (title);
	card5.add (message);
	card5.add (back);

	p_card.add ("5", card5);
    }


    public void screen6 ()
    {
	card6 = new Panel ();
	JLabel picture = new JLabel (createImageIcon ("bedroom.jpg"));
	JLabel title = new JLabel ("      Bedroom      ");
	title.setFont (new Font ("Arial", Font.BOLD, 25));
	title.setForeground (Color.red);
	JLabel message = new JLabel ("I'm here! You found me.");
	message.setFont (new Font ("Arial", Font.BOLD, 15));

	card6.add (picture);
	card6.add (title);
	card6.add (message);

	p_card.add ("6", card6);
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
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = FindMe.class.getResource (path);
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












