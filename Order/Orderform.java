import javax.swing.*; import java.awt.*;
import java.awt.event.*; import java.applet.Applet;

public class Orderform extends Applet implements ActionListener
{
    public void init ()
    {
	setBackground(Color.white) ;
	JLabel title = new JLabel ("Order Form");
	title.setFont (new Font("ComicSans", Font.BOLD, 50));
	
	JLabel fries = new JLabel ("Fries @ $1.50 each");
	JTextField quantity = new JTextField (4);
	fries.setFont (new Font ("ComicSans", Font.ITALIC, 16));     
	fries.setForeground (Color.yellow);

	JLabel burgers = new JLabel ("Burgers @ $3.50 each ");
	JTextField bq = new JTextField (4);
	burgers.setFont (new Font("ComicSans", Font.ITALIC, 16));
	burgers.setForeground (Color.green);
	
	JLabel soda = new JLabel ("Sodas @ $1.00 each ");
	JTextField sq = new JTextField (4);
	soda.setFont(new Font("ComicSans", Font.ITALIC, 16));
	soda.setForeground (Color.orange);
	
	JButton Order = new JButton ("Place Order");

	add (title);
	add (fries);
	add (quantity);
	add (burgers);
	add (bq);
	add (soda);
	add (sq);
	add (Order);
	
    }


    public void actionPerformed (ActionEvent e)
    {
    }
}
