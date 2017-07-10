import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class PixelArt extends Applet implements ActionListener
{
    int row = 10;
    JButton b[] = new JButton [row * row];
    JButton first;
    JButton second;
    JButton third;
    JButton fourth;

    public void init ()
    {
	resize (450, 500);
	JLabel title = new JLabel ("Pixel Art");
	add (title);

	first = new JButton ("Alien");
	first.setActionCommand ("1");
	first.addActionListener (this);

	second = new JButton ("Face");
	second.setActionCommand ("2");
	second.addActionListener (this);

	third = new JButton ("Heart");
	third.setActionCommand ("3");
	third.addActionListener (this);

	fourth = new JButton ("Other");
	fourth.setActionCommand ("4");
	fourth.addActionListener (this);

	Panel g = new Panel (new GridLayout (row, row));
	for (int i = 0 ; i < b.length ; i++)
	{
	    b [i] = new JButton (" ");
	    g.add (b [i]);
	}
	add (g);
	add (first);
	add (second);
	add (third);
	add (fourth);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("1"))
	{
	    for (int i = 0 ; i < b.length ; i++)
	    {
		b [i].setBackground (Color.lightGray);
	    }
	    int alien[] [] = {{0, 0, 0, 0, 0, 0, 0, 0, 0,
		    0}, {0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0,
		    0, 1, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1,
		    0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 0, 0}, {0,
		    0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1,
		    0, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 1, 0, 0,
		    0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0,
		    0, 0, 0, 0, 0, 0, 0}};
	    int n = 0;
	    for (int i = 0 ; i < 10 ; i++)
	    {
		for (int j = 0 ; j < 10 ; j++)
		{
		    if (alien [i] [j] == 1)
			b [n].setBackground (Color.red);
		    n++;
		}
	    }
	}

	else if (e.getActionCommand ().equals ("2"))
	{
	    for (int i = 0 ; i < b.length ; i++)
	    {
		b [i].setBackground (Color.lightGray);
	    }
	    int face[] [] = {{0, 0, 0, 0, 0, 0, 0, 0, 0,
		    0}, {0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1,
		    0, 1, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1,
		    0, 0, 0}, {0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0,
		    0, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0,
		    0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0,
		    0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0,
		    0, 0, 0, 0, 0, 0, 0}};
	    int n = 0;
	    for (int k = 0 ; k < 10 ; k++)
	    {
		for (int l = 0 ; l < 10 ; l++)
		{
		    if (face [k] [l] == 1)
			b [n].setBackground (Color.red);
		    n++;
		}
	    }
	}

	else if (e.getActionCommand ().equals ("3"))
	{
	    for (int i = 0 ; i < b.length ; i++)
	    {
		b [i].setBackground (Color.lightGray);
	    }
	    int heart[] [] = {{0, 0, 0, 0, 0, 0, 0, 0, 0,
		    0}, {0, 1, 1, 0, 0, 0, 1, 1, 0, 0}, {0, 1, 1,
		    1, 0, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 1,
		    1, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, {0,
		    0, 0, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 1,
		    0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0,
		    0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0,
		    0, 0, 0, 0, 0, 0, 0}};

	    int n = 0;
	    for (int o = 0 ; o < 10 ; o++)
	    {
		for (int p = 0 ; p < 10 ; p++)
		{
		    if (heart [o] [p] == 1)
			b [n].setBackground (Color.red);
		    n++;
		}
	    }
	}

	else if (e.getActionCommand ().equals ("4"))
	{
	    for (int i = 0 ; i < b.length ; i++)
	    {
		b [i].setBackground (Color.lightGray);
	    }
	    int checkerboard[] [] =
		{{1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
		    {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
		    {1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
		    {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
		    {1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
		    {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
		    {1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
		    {0, 1, 0, 1, 0, 1, 0, 1, 0, 1},
		    {1, 0, 1, 0, 1, 0, 1, 0, 1, 0},
		    {0, 1, 0, 1, 0, 1, 0, 1, 0, 1}};

	    int n = 0;
	    for (int q = 0 ; q < 10 ; q++)
	    {
		for (int r = 0 ; r < 10 ; r++)
		{
		    if (checkerboard [q] [r] == 1)
			b [n].setBackground (Color.red);
		    n++;
		}
	    }
	}



    }
}

