import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class textfield extends Applet implements ActionListener
{
    JLabel one1;
    JTextField number;

    JLabel two2;
    JTextField copies;

    JLabel three3;
    JTextField model;


    public void init ()
    {
	resize (700, 100);
	JLabel one = new JLabel ("Enter a number less than 100: ");
	number = new JTextField (6);
	JButton check = new JButton ("Check number");
	check.addActionListener (this);
	check.setActionCommand ("check");
	one1 = new JLabel ("The number...");

	JLabel two = new JLabel ("Enter the number of copies: ");
	copies = new JTextField (6);
	JButton price = new JButton ("Price");
	price.addActionListener (this);
	price.setActionCommand ("price");
	two2 = new JLabel ("Price per copy...");

	JLabel three = new JLabel ("Enter your model number: ");
	model = new JTextField (6);
	JButton evaluate = new JButton ("Evaluate");
	evaluate.addActionListener (this);
	evaluate.setActionCommand ("evaluate");
	three3 = new JLabel ("Your model...");

	add (one);
	add (number);
	add (check);
	add (one1);

	add (two);
	add (copies);
	add (price);
	add (two2);

	add (three);
	add (model);
	add (evaluate);
	add (three3);

    }


    public void actionPerformed (ActionEvent e)
    {
	String num = number.getText ();
	int number = (0);
	number = Integer.parseInt (num);

	String cop = copies.getText ();
	int copies = (0);
	copies = Integer.parseInt (cop);

	String mod = model.getText ();
	int model = (0);
	model = Integer.parseInt (mod);

	if (e.getActionCommand ().equals ("check"))
	{
	    if (number >= 10)
		one1.setText ("The number is a two digit number.");
	    else if (number < 10)
		one1.setText ("The number is a one digit number.");
	    else
		one1.setText ("You didn't input anything.");

	}


	else if (e.getActionCommand ().equals ("price"))
	{
	    if (copies < 500)
		two2.setText ("Price per copy is $0.30.");
	    else if (copies >= 500 && copies <= 749)
		two2.setText ("Price per copy is $0.28.");
	    else if (copies >= 750 && copies <= 999)
		two2.setText ("Price per copy is $0.27.");
	    else if (copies >= 1000)
		two2.setText ("Price per copy is $0.25.");
	    else
		two2.setText ("You didn't input anything.");

	}


	else if (e.getActionCommand ().equals ("evaluate"))
	{
	    if (model == 119 || model == 179 || (model >= 189 && model <= 195) || model == 221 || model == 780)
		three3.setText ("Your car is defective.");
	    else if (model > 0)
		three3.setText ("Your car is fine.");
	    else
		three3.setText ("You didn't input anything.");
	}
    }
}


