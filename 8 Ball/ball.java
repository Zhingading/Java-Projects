import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class ball extends Applet implements ActionListener
{

    JTextField question;
    public void init ()
    {
	resize (500, 400);
	JButton enter = new JButton ("Enter");
	enter.addActionListener (this);
	enter.setActionCommand ("click");

	JLabel title = new JLabel ("The Magic 8 Ball");
	title.setFont (new Font ("Jokerman", Font.BOLD, 30));
	title.setForeground (Color.orange);
	JLabel instructions = new JLabel ("Ask a yes/no question and recieve an answer!");
	instructions.setForeground (Color.orange);
	JLabel ball = new JLabel (createImageIcon ("ball.jpg"));
	question = new JTextField (25);
	setBackground (Color.white);


	add (title);
	add (instructions);
	add (question);
	add (enter);
	add (ball);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("click"))
	{
	    int num = (int) (Math.random () * 15) + 1;

	    if (num == 1)
		showStatus ("Outlook not so good");

	    else if (num == 2)
		showStatus ("Don't count on it");

	    else if (num == 3)
		showStatus ("My sources say no");

	    else if (num == 4)
		showStatus ("Without a doubt");

	    else if (num == 5)
		showStatus ("Reply hazy, try again.");

	    else if (num == 6)
		showStatus ("It is certain");

	    else if (num == 7)
		showStatus ("My reply is no");

	    else if (num == 8)
		showStatus ("As I see it, yes");

	    else if (num == 9)
		showStatus ("Most Likely");

	    else if (num == 10)
		showStatus ("You may rely on it");

	    else if (num == 11)
		showStatus ("Cannot predict now");

	    else if (num == 12)
		showStatus ("Outlook good");

	    else if (num == 13)
		showStatus ("Better not tell you now");

	    else if (num == 14)
		showStatus ("Very doubtful");

	    else if (num == 15)
		showStatus ("Yes definitely");

	    else
		showStatus ("Concentrate and ask again");

	    question.setText ("");
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = ball.class.getResource (path);
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
