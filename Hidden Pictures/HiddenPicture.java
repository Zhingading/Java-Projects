import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class HiddenPicture extends Applet implements ActionListener
{
    public void init ()
    {

	JLabel title = new JLabel ("HIDDEN PICTURE");
	title.setFont (new Font ("Jokerman", Font.BOLD, 50));
	title.setForeground (Color.red);


	JLabel cap = new JLabel ("See if you can find the hidden image");
	cap.setFont (new Font ("Arial", Font.ITALIC, 20));

	JLabel ins = new JLabel ("   Enter the letter and number of the image when you find it");

	JLabel main = new JLabel (createImageIcon ("Bear images.jpg"));
	JLabel find = new JLabel (createImageIcon ("images.jpg"));
	JLabel let = new JLabel ("Letter");
	JLabel num = new JLabel ("Number");
	JTextField nu = new JTextField (2);
	JTextField le = new JTextField (2);
	JButton done = new JButton ("Done");
	setBackground (Color.green);
	resize (800, 640);

	add (title);
	add (cap);
	add (ins);
	add (main);
	add (find);
	add (let);
	add (le);
	add (num);
	add (nu);
	add (done);


    }





    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = HiddenPicture.class.getResource (path);
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
