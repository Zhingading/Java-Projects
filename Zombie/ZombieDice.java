import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ZombieDice extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2;
    CardLayout cdLayout = new CardLayout ();

    int shotguns = 0;
    int brains = 0;
    int p1b = 0;
    int p2b = 0;

    JLabel pic1;
    JLabel pic2;
    JLabel pic3;

    JLabel brain;
    JLabel shotgun;

    JLabel player;
    JButton keepgoing;
    JButton stopscore;
    JButton nextplayer;
    JLabel p1brains;
    JLabel p2brains;

    JLabel result;

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	screen1 ();
	screen2 ();
	resize (550, 500);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void screen1 ()
    {
	card1 = new Panel ();
	JLabel logo = new JLabel (createImageIcon ("logo.jpg"));

	JButton play = new JButton (createImageIcon ("play.jpg"));
	play.setBackground (Color.red);
	play.setActionCommand ("2");
	play.addActionListener (this);

	JButton quit = new JButton (createImageIcon ("quit.jpg"));
	quit.setBackground (Color.red);
	quit.setActionCommand ("quit");
	quit.addActionListener (this);

	card1.add (logo);
	card1.add (play);
	card1.add (quit);
	setBackground (Color.red);

	p_card.add ("1", card1);
    }


    public void screen2 ()
    {
	card2 = new Panel ();
	player = new JLabel ("Player 1             ");
	player.setFont (new Font ("Vinque", Font.BOLD, 20));

	shotgun = new JLabel ("Shotguns: " + shotguns + "          ");
	shotgun.setFont (new Font ("Vinque", Font.BOLD, 14));
	brain = new JLabel ("Braaainss: " + brains);
	brain.setFont (new Font ("Vinque", Font.BOLD, 14));

	p1brains = new JLabel ("Player 1 Ate: " + p1b + " Braaiinnss            ");
	p1brains.setFont (new Font ("Vinque", Font.BOLD, 16));

	p2brains = new JLabel ("Player 2 Ate: " + p2b + " Braaiinnss");
	p2brains.setFont (new Font ("Vinque", Font.BOLD, 16));

	pic1 = new JLabel (createImageIcon ("zombie.jpg"));
	pic2 = new JLabel (createImageIcon ("zombie.jpg"));
	pic3 = new JLabel (createImageIcon ("zombie.jpg"));

	keepgoing = new JButton (createImageIcon ("keepgoing.jpg"));
	keepgoing.addActionListener (this);
	keepgoing.setActionCommand ("kg");

	stopscore = new JButton (createImageIcon ("stopAndScore.jpg"));
	stopscore.addActionListener (this);
	stopscore.setActionCommand ("ss");

	nextplayer = new JButton (createImageIcon ("nextPlayer.jpg"));
	nextplayer.addActionListener (this);
	nextplayer.setActionCommand ("np");
	nextplayer.setEnabled (false);

	result = new JLabel ("");
	result.setFont (new Font ("Arial", Font.BOLD, 25));

	card2.add (player);
	card2.add (shotgun);
	card2.add (brain);
	card2.add (p1brains);
	card2.add (p2brains);
	card2.add (pic1);
	card2.add (pic2);
	card2.add (pic3);
	card2.add (keepgoing);
	card2.add (stopscore);
	card2.add (nextplayer);
	card2.add (result);

	p_card.add ("2", card2);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");

	else if (e.getActionCommand ().equals ("kg"))
	{
	    int n = (int) ((Math.random () * 9) + 1);
	    {
		if (n == 1)
		{
		    pic1.setIcon (createImageIcon ("greenBrain.jpg"));
		    brains++;
		}
		else if (n == 2)
		    pic1.setIcon (createImageIcon ("greenFootPrints.jpg"));
		else if (n == 3)
		{
		    pic1.setIcon (createImageIcon ("greenShotGun.jpg"));
		    shotguns++;
		}
		else if (n == 4)
		{
		    pic1.setIcon (createImageIcon ("redBrain.jpg"));
		    brains++;
		}
		else if (n == 5)
		    pic1.setIcon (createImageIcon ("redFootPrints.jpg"));
		else if (n == 6)
		{
		    pic1.setIcon (createImageIcon ("redShotGun.jpg"));
		    shotguns++;
		}

		else if (n == 7)
		{
		    pic1.setIcon (createImageIcon ("yellowBrain.jpg"));
		    brains++;
		}

		else if (n == 8)
		    pic1.setIcon (createImageIcon ("yellowFootPrints.jpg"));
		else if (n == 9)
		{
		    pic1.setIcon (createImageIcon ("yellowShotGun.jpg"));
		    shotguns++;
		}

	    }
	    int n2 = (int) ((Math.random () * 9) + 1);
	    {
		if (n2 == 1)
		{
		    pic2.setIcon (createImageIcon ("greenBrain.jpg"));
		    brains++;
		}

		else if (n2 == 2)
		    pic2.setIcon (createImageIcon ("greenFootPrints.jpg"));
		else if (n2 == 3)
		    pic2.setIcon (createImageIcon ("greenShotGun.jpg"));
		else if (n2 == 4)
		    pic2.setIcon (createImageIcon ("redBrain.jpg"));
		else if (n2 == 5)
		{
		    pic2.setIcon (createImageIcon ("redFootPrints.jpg"));
		    brains++;
		}
		else if (n2 == 6)
		    pic2.setIcon (createImageIcon ("redShotGun.jpg"));
		else if (n2 == 7)
		{
		    pic2.setIcon (createImageIcon ("yellowBrain.jpg"));
		    brains++;
		}

		else if (n2 == 8)
		    pic2.setIcon (createImageIcon ("yellowFootPrints.jpg"));
		else if (n2 == 9)
		{
		    pic2.setIcon (createImageIcon ("yellowShotGun.jpg"));
		    shotguns++;
		}

	    }
	    int n3 = (int) ((Math.random () * 9) + 1);
	    if (n3 == 1)
	    {
		pic3.setIcon (createImageIcon ("greenBrain.jpg"));
		brains++;
	    }

	    else if (n3 == 2)
		pic3.setIcon (createImageIcon ("greenFootPrints.jpg"));
	    else if (n3 == 3)
	    {
		pic3.setIcon (createImageIcon ("greenShotGun.jpg"));
		shotguns++;
	    }

	    else if (n3 == 4)
	    {
		pic3.setIcon (createImageIcon ("redBrain.jpg"));
		brains++;
	    }

	    else if (n3 == 5)
		pic3.setIcon (createImageIcon ("redFootPrints.jpg"));
	    else if (n3 == 6)
	    {
		pic3.setIcon (createImageIcon ("redShotGun.jpg"));
		shotguns++;
	    }

	    else if (n3 == 7)
	    {
		pic3.setIcon (createImageIcon ("yellowBrain.jpg"));
		brains++;
	    }

	    else if (n3 == 8)
		pic3.setIcon (createImageIcon ("yellowFootPrints.jpg"));
	    else if (n3 == 9)
	    {
		pic3.setIcon (createImageIcon ("yellowShotGun.jpg"));
		shotguns++;
	    }

	    brain.setText ("Braaainss: " + brains);
	    shotgun.setText ("Shotguns: " + shotguns + "          ");

	}

	if (shotguns >= 4)
	{
	    pic1.setIcon (createImageIcon ("shotgunned.jpg"));
	    pic2.setIcon (createImageIcon ("shotgunned.jpg"));
	    pic3.setIcon (createImageIcon ("shotgunned.jpg"));
	    nextplayer.setEnabled (true);
	    stopscore.setEnabled (false);
	    keepgoing.setEnabled (false);
	}

	if (e.getActionCommand ().equals ("ss"))
	{
	    p1b = brains;
	    p1brains.setText ("Player 1 Ate: " + brains + " Braaiinnss            ");
	    brains = 0;
	    shotguns = 0;
	    player.setText ("Player 2             ");
	}

	if (e.getActionCommand ().equals ("np") && p1b == 0 && p2b == 0)
	{
	    p1b = brains;
	    p1brains.setText ("Player 1 Ate: " + p1b + " Braaiinnss            ");
	    brains = 0;
	    shotguns = 0;
	    player.setText ("Player 2             ");
	    keepgoing.setEnabled (true);
	    stopscore.setEnabled (true);
	    nextplayer.setEnabled (false);
	}

	if (e.getActionCommand ().equals ("np") && p2b == 0 && p1b > 0)
	{
	    p2b = brains;
	    p2brains.setText ("Player 2 Ate: " + p2b + " Braaiinnss            ");
	    nextplayer.setEnabled (false);
	    stopscore.setEnabled (false);
	    nextplayer.setEnabled (false);
	    if (p1b > p2b)
		result.setText ("Player 1 won!");
	    else if (p2b > p1b)
		result.setText ("Player 2 won!");
	    else
		result.setText ("It's a tie!");


	}


    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = ZombieDice.class.getResource (path);
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

















