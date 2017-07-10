import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout;
import javax.swing.JTable;
public class grid extends Applet implements ActionListener
{
    int row = 5;
    JButton a[] = new JButton [row * row];
    JButton reset;
    JLabel hit;
    JLabel miss;
    int hits;
    int misses;
    public void init ()
    {
	Panel g = new Panel (new GridLayout (row, row));
	char hide[] [] = {{'s', 'n', 's', 's', 's'}, {'s', 'n', 'n', 's',
		's'}, {'s', 'n', 's', 's', 'n'}, {'n', 'n', 's', 'n', 's'}, {'n',
		's', 's', 'n', 's'}};
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton (" ");
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    g.add (a [i]);
	}
	hits = 0;
	hit = new JLabel ("Hits: " + hits);
	misses = 0;
	miss = new JLabel ("   Misses: " + misses);

	reset = new JButton ("RESET");
	reset.setEnabled (false);
	reset.addActionListener (this);
	reset.setActionCommand ("-1");

	JLabel ins = new JLabel ("15 soldiers are hidden in this grid");
	JLabel ins2 = new JLabel ("You must shoot them all down to win.");
	JLabel ins3 = new JLabel ("A hit turns Orange and a miss turns Black.");
	add (ins);
	add (ins2);
	add (ins3);
	add (hit);
	add (miss);
	add (reset);
	add (g);
	resize (275, 250);
    }


    public void actionPerformed (ActionEvent e)
    {
	int n = Integer.parseInt (e.getActionCommand ());
	int x = n / row;
	int y = n % row;
	showStatus ("(" + x + ", " + y + ")");

	if (e.getActionCommand ().equals ("-1"))
	{
	    for (int i = 0 ; i < a.length ; i++)
	    {
		a [i].setBackground (Color.lightGray);
	    }
	    hits = 0;
	    misses = 0;
	    reset.setEnabled (false);
	    hit.setText ("Hits: " + hits);
	    miss.setText ("Misses: " + misses);
	}

	else if (e.getActionCommand ().equals ("" + 0))
	{
	    a [0].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 1))
	{
	    a [1].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 2))
	{
	    a [2].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 3))
	{
	    a [3].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 4))
	{
	    a [4].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 5))
	{
	    a [5].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 6))
	{
	    a [6].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 7))
	{
	    a [7].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 8))
	{
	    a [8].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 9))
	{
	    a [9].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 10))
	{
	    a [10].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 11))
	{
	    a [11].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 12))
	{
	    a [12].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 13))
	{
	    a [13].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 14))
	{
	    a [14].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 15))
	{
	    a [15].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 16))
	{
	    a [16].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 17))
	{
	    a [17].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 18))
	{
	    a [18].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 19))
	{
	    a [19].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 20))
	{
	    a [20].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 21))
	{
	    a [21].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 22))
	{
	    a [22].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}
	else if (e.getActionCommand ().equals ("" + 23))
	{
	    a [23].setBackground (Color.black);
	    misses++;
	    miss.setText ("   Misses: " + misses);
	}
	else if (e.getActionCommand ().equals ("" + 24))
	{
	    a [24].setBackground (Color.orange);
	    hits++;
	    hit.setText ("Hits: " + hits);
	}

	if (hits == 15)
	{
	    hit.setText ("Game Over.");
	    miss.setText ("You win!");
	    reset.setEnabled (true);
	}
    }
}
