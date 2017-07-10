import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class WhereIsIt extends Applet implements ActionListener
{
    JButton[] a;
    int row = 10;
    int col = 10;
    int total = row * col;
    int hiddenX = (int) ((Math.random () * 9) + 1);
    int hiddenY = (int) ((Math.random () * 9) + 1);
    public void init ()
    {
	JLabel title = new JLabel ("Where is it?");
	title.setFont (new Font ("Arial", Font.BOLD, 18));
	add (title);
	setBackground (Color.orange);
	Panel p = new Panel (new GridLayout (row, col, 0, 0));
	resize (500, 400);
	a = new JButton [total];
	for (int nNum = 0 ; nNum < total ; nNum++)
	{
	    a [nNum] = new JButton ("0");
	    p.add (a [nNum]);
	    a [nNum].addActionListener (this);
	    a [nNum].setBackground (Color.white);
	    a [nNum].setActionCommand ("" + nNum);
	}
	add (title);
	add (p);
	JButton reset = new JButton ("Reset");
	reset.addActionListener (this);
	reset.setActionCommand ("-1");
	add (reset);
    }


    public void actionPerformed (ActionEvent e)
    {
	int pos = Integer.parseInt (e.getActionCommand ());
	if (pos == -1)
	{ //add reset code here
	    for (int nNum = 0 ; nNum < total ; nNum++)
	    {
		a [nNum].setBackground (Color.white);
	    }
	    hiddenX = (int) ((Math.random () * 9) + 1);
	    hiddenY = (int) ((Math.random () * 9) + 1);
	}
	else
	{
	    //find i and j
	    int i = pos / row;
	    int j = pos % row;
	    if (i == hiddenX && j == hiddenY)
	    {
		a [pos].setBackground (Color.red);
		showStatus ("You win!");
	    }
	    else if ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j + 1 ==
		    hiddenY)
	    {
		a [pos].setBackground (Color.orange);
	    }
	    else if ((i + 1 == hiddenX || i - 1 == hiddenX) && j == hiddenY)
	    {
		a [pos].setBackground (Color.orange);
	    }
	    else if ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j - 1 ==
		    hiddenY)
	    {
		a [pos].setBackground (Color.orange);
	    }
	    else if (i == hiddenX || j == hiddenY)
	    {
		a [pos].setBackground (Color.yellow);
	    }
	    else
	    {
		a [pos].setBackground (Color.black);
	    }
	}
    }
}

//1. There are 101 buttons on the screen.
//2. The Grid Layout dimensions are 10x10
//3. The for loop starts at 0 and ends at the total.
//4. The action command for each button except fot the reset button is ("" + nNum). The reset button has an actionCommand of ("-1")
//5. The actionCommand is different for each button since nNum is always different.
//6. A square turns red if (i == hiddenX && j == hiddenY)
//7. A square turns orange if ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j + 1 == hiddenY) or ((i + 1 == hiddenX || i - 1 == hiddenX) && j == hiddenY) or ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j - 1 == hiddenY)
//8. A square turns yellow if (i == hiddenX || j == hiddenY)






