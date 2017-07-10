import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class fortuneCookie extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2;
    CardLayout cdLayout = new CardLayout ();
    JLabel picture;
    JLabel ans;

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	resize (800, 500);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    {
	card1 = new Panel ();
	JLabel title = new JLabel ("Fortune Cookie");
	title.setFont (new Font ("Arial", Font.BOLD, 20));
	JLabel picture = new JLabel (createImageIcon ("cookieClose.JPG"));
	JLabel ins = new JLabel ("                 Click to find out your fortune.                 ");
	ins.setFont (new Font ("Arial", Font.BOLD, 12));
	ins.setForeground (Color.red);

	JButton fortune = new JButton ("Find Fortune.");
	fortune.setActionCommand ("2");
	fortune.addActionListener (this);

	JButton again = new JButton ("New Cookie.");

	card1.add (title);
	card1.add (picture);
	card1.add (ins);
	card1.add (fortune);
	card1.add (again);

	p_card.add ("1", card1);
    }


    public void screen2 ()
    {
	card2 = new Panel ();
	JLabel title = new JLabel ("Fortune Cookie");
	title.setFont (new Font ("Arial", Font.BOLD, 20));
	JLabel picture = new JLabel (createImageIcon ("cookieOpen.jpg"));

	ans = new JLabel ("");
	ans.setFont (new Font ("Arial", Font.BOLD, 12));

	JButton fortune = new JButton ("Find Fortune.");

	JButton again = new JButton ("New Cookie.");
	again.setActionCommand ("1");
	again.addActionListener (this);

	card2.add (title);
	card2.add (picture);
	card2.add (ans);
	card2.add (fortune);
	card2.add (again);

	p_card.add ("2", card2);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");
	{
	    long num = Math.round (Math.random () * 15) + 1;
	    {
		if (num == 1)
		    ans.setText ("Bring an umbrella today. You are a statue.");
		else if (num == 2)
		    ans.setText ("Wise people don't get even. They get odder.");
		else if (num == 3)
		    ans.setText ("In two days time, tomorrow will be yesterday.");
		else if (num == 4)
		    ans.setText ("You must try harder if you want to succeed.");
		else if (num == 5)
		    ans.setText ("You may be guilty of something you did not do.");
		else if (num == 6)
		    ans.setText ("You must stop eating. You may get food poisoning.");
		else if (num == 7)
		    ans.setText ("You will get a lousy dessert if you eat this.");
		else if (num == 8)
		    ans.setText ("Look at your past and future. But don't stare.");
		else if (num == 9)
		    ans.setText ("The wise need good manners or fast reflexes.");
		else if (num == 10)
		    ans.setText ("Bad news! You will soon lose your money...");
	    }
	}
	if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = fortuneCookie.class.getResource (path);
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










