import javax.swing.*; import java.awt.*;
import java.awt.event.*; import java.applet.Applet;

public class Orderform extends Applet implements ActionListener
{
    public void init ()
    {
	setBackground(Color.red) ;
	JLabel title = new JLabel ("Order Form");
	title.setFont (new Font("ComicSans", Font.BOLD, 50));
	
	JLabel fries = new JLabel ("Fries @ $1.50 each");
	fries.setFont (new Font ("Arial", Font.ITALIC, 16));
	JTextField quantity = new JTextField (3);       
	
	JLabel burgers = new JLabel ("Burgers @ $3.50 each ");
	JTextField bq = new JTextField (3);
	burgers.setFont (new Font("Arial", Font.ITALIC, 16));
	
	JLabel soda = new JLabel ("Sodas @ $1.00 each ");
	JTextField sq = new JTextField (3);
	soda.setFont(new Font("Arial", Font.ITALIC, 16));
	
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
