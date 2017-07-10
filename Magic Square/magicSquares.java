import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class magicSquares extends Applet implements ActionListener
{
    int row = 3;
    int i;
    JButton a[] = new JButton [row * row];
    JLabel sums[] = new JLabel [row + row + 1];
    int sumNum[] = {6, 15, 24, 12, 15, 18, 45};
    JButton reset;
    public void init ()
    {
	resize (500, 500);
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton ("" + (i + 1));
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    a [i].setBackground (pickClr (i + 1));
	    a [i].setFont (new Font ("Arial", Font.PLAIN, 26));
	    a [i].setPreferredSize (new Dimension (50, 50));
	}
	for (int i = 0 ; i < sums.length ; i++)
	{
	    sums [i] = new JLabel (" " + sumNum [i]);
	    sums [i].setFont (new Font ("Arial", Font.PLAIN, 16));
	    sums [i].setPreferredSize (new Dimension (50, 50));
	}
	Panel g = new Panel (new GridLayout (row + 1, row + 1));
	//add the buttons here, one by one
	JLabel title = new JLabel ("Magic Square");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	add (title);

	JLabel ins = new JLabel ("A magic square is an arrangement");
	ins.setFont (new Font ("Arial", Font.BOLD, 12));
	ins.setForeground (Color.blue);
	JLabel ins2 = new JLabel ("of numbers where the numbers");
	ins2.setFont (new Font ("Arial", Font.BOLD, 12));
	ins2.setForeground (Color.blue);
	JLabel ins3 = new JLabel ("in each row, column, and diagonals,");
	ins3.setFont (new Font ("Arial", Font.BOLD, 12));
	ins3.setForeground (Color.blue);
	JLabel ins4 = new JLabel ("all add up to the same number.");
	ins4.setFont (new Font ("Arial", Font.BOLD, 12));
	ins4.setForeground (Color.blue);
	add (ins);
	add (ins2);
	add (ins3);
	add (ins4);
	add (g);
	g.add (a [0]);
	g.add (a [1]);
	g.add (a [2]);
	g.add (a [3]);
	g.add (a [4]);
	g.add (a [5]);
	g.add (a [6]);
	g.add (a [7]);
	g.add (a [8]);

	reset = new JButton ("Reset");
	reset.setActionCommand ("reset");
	reset.addActionListener (this);

	resize (250, 300);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("reset"))
	{ //reset code here
	    for (int i = 0 ; i < a.length ; i++)
	    {
		a [i] = new JButton ("" + (i + 1));
		a [i].setBackground (pickClr (i + 1));
		updateSums ();
		showStatus ("Have you won?  " + winner ());
	    }
	}
	else
	{
	    int n = Integer.parseInt (e.getActionCommand ());
	    int x = n / row;
	    int y = n % row;
	    int num = Integer.parseInt (a [n].getText ());
	    //process a click code here
	    num++;
	    if (num >= 10)
		num = 1;
	    a [n].setText ("" + num);
	    a [n].setBackground (pickClr (num));
	    updateSums ();
	    showStatus ("Have you won?  " + winner ());
	}
    }


    public void updateSums ()
    {
	int n[] = new int [9];
	for (int i = 0 ; i < a.length ; i++)
	{
	    n [i] = Integer.parseInt (a [i].getText ());

	}
	//add in manual sums here
	sumNum [0] = n [0] + n [1] + n [2];
	sumNum [1] = n [3] + n [4] + n [5];
	sumNum [2] = n [6] + n [7] + n [8];
	sumNum [3] = n [0] + n [3] + n [6];
	sumNum [4] = n [1] + n [4] + n [7];
	sumNum [5] = n [2] + n [5] + n [8];
	sumNum [6] = n [0] + n [4] + n [8];


	for (int i = 0 ; i < sums.length ; i++)
	{
	    sums [i].setText (" " + sumNum [i]);
	}
    }


    public Color pickClr (int n)
    {
	Color clr[] = {Color.red, Color.orange, Color.yellow, Color.cyan,
	    Color.green, Color.magenta, Color.pink, Color.white, Color.lightGray};
	return (clr [n - 1]);
    }


    public boolean winner ()
    {
	boolean win = true;
	//all sums the same
	//- search to see if all are equal to first spot
	int check = sumNum [0];
	for (int i = 1 ; i < sumNum.length ; i++)
	{
	    if (sumNum [i] != check)
		win = false;
	}
	//all numbers different
	//- bin sort approach for each label, if equal, set to 0
	int nums[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int n[] = new int [9];
	for (int i = 0 ; i < a.length ; i++)
	{
	    n [i] = Integer.parseInt (a [i].getText ());
	}
	for (int i = 0 ; i < n.length ; i++)
	{
	    nums [n [i]]++;
	}
	//- if all 0, then all are different
	for (int i = 1 ; i < nums.length ; i++)
	{
	    if (nums [i] == 0)
		win = false;
	}
	return win;
    }
}
