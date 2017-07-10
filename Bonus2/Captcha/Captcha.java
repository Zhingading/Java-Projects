import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Captcha extends Applet implements ActionListener
{
    JLabel pic;
    String answers[] = {"existing", "overlooks", "inquiry", "contribute", "tround", "qssae", "3m573", "chisels", "and"};
    int i = -1;
    int n = 1;
    JLabel type;
    JTextField space;
    JButton next;
    JButton done;

    public void init ()
    {
	JLabel title = new JLabel ("Captcha");

	pic = new JLabel (createImageIcon ("c1.PNG"));

	JLabel answer = new JLabel ("Answer: ");


	space = new JTextField (10);

	done = new JButton ("Done");
	done.addActionListener (this);
	done.setActionCommand ("done");
	type = new JLabel ("Type in the answer");

	next = new JButton ("Next");
	next.addActionListener (this);
	next.setActionCommand ("next");
	next.setEnabled (false);

	add (title);
	add (pic);
	add (answer);
	add (space);
	add (type);
	add (done);
	add (next);
	resize (500, 200);
    }


    public void actionPerformed (ActionEvent e)
    {
	String ans = space.getText ();
	if (e.getActionCommand ().equals ("done"))
	{
	    i++;
	    if (ans.equals (answers [i]))
	    {
		type.setText ("Correct! Go to the next one!");
		done.setEnabled (false);
		next.setEnabled (true);
	    }
	    else
		type.setText ("Incorrect. Keep trying!");
	}

	else if (e.getActionCommand ().equals ("next"))
	{
	    type.setText ("Type in the answer!");
	    n++;
	    pic.setIcon (createImageIcon ("c" + n + ".PNG"));
	    done.setEnabled (true);
	    next.setEnabled (false);
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = Captcha.class.getResource (path);
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










