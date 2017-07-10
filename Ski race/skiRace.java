import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class skiRace extends Applet implements ActionListener
{
    JTextField answer;
    JTextField answer2;
    JTextField answer3;
    JTextField answer4;

    public void init ()
    {
	resize (800, 525);
	setBackground (Color.blue);
	JLabel pic = new JLabel (createImageIcon ("course.jpg"));

	JLabel ins = new JLabel ("Enter the number of points beside each skier.");
	ins.setFont (new Font ("Arial", Font.BOLD, 12));

	JLabel p1 = new JLabel (createImageIcon ("player1.jpg"));
	answer = new JTextField (3);

	JLabel p2 = new JLabel (createImageIcon ("player2.jpg"));
	answer2 = new JTextField (3);

	JLabel p3 = new JLabel (createImageIcon ("player3.jpg"));
	answer3 = new JTextField (3);

	JLabel p4 = new JLabel (createImageIcon ("player4.jpg"));
	answer4 = new JTextField (3);

	JButton done = new JButton ("Done");
	done.setActionCommand ("done");
	done.addActionListener (this);

	add (pic);
	add (ins);
	add (p1);
	add (answer);
	add (p2);
	add (answer2);
	add (p3);
	add (answer3);
	add (p4);
	add (answer4);
	add (done);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("done"))
	{
	    int txt = Integer.parseInt (answer.getText ());
	    int txt2 = Integer.parseInt (answer2.getText ());
	    int txt3 = Integer.parseInt (answer3.getText ());
	    int txt4 = Integer.parseInt (answer4.getText ());
	    if ((txt == 7) && (txt2 == 8) && (txt3 == 6) && (txt4 == 9))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct",
			JOptionPane.INFORMATION_MESSAGE);
	    }
	    else
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.",
			"Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = skiRace.class.getResource (path);
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





