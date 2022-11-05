package JVacationRental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener{
	final int PARKSIDE = 600;
    final int POOLSIDE = 750;
    final int LAKESIDE = 825;
    final int ONEBED = 0;
    final int TWOBED = 75;
    final int THREEBED = 150;
    final int MEAL = 200;
    
    int location, beds, total;
    int meal = 0;
	
	JRadioButton j1 = new JRadioButton("Parkside");
	JRadioButton j2 = new JRadioButton("Poolside");
	JRadioButton j3 = new JRadioButton("Lakeside");
	ButtonGroup a = new ButtonGroup();
	
	JRadioButton j4 = new JRadioButton("One bedroom");
	JRadioButton j5 = new JRadioButton("Two bedrooms");
	JRadioButton j6 = new JRadioButton("Three bedrooms");
	ButtonGroup b = new ButtonGroup();
	
	JRadioButton j7 = new JRadioButton("Meals");
	JRadioButton j8 = new JRadioButton("No meals");
	ButtonGroup c = new ButtonGroup();

	Button ok = new Button("Ok");
	ok.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			total = location + beds + meal;
			JOptionPane.showMessageDialog(null, "Total: $" + total);
		}});
			
	public JVacationRental() {
		setTitle("Vacation Rental");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 330);
		setLayout(new FlowLayout());
		JLabel totallabel = new JLabel("");
		
		a.add(j1);
		a.add(j2);
		a.add(j3);
		
		b.add(j4);
		b.add(j5);
		b.add(j6);
		
		
		c.add(j7);
		c.add(j8);
		
		j1.addItemListener(this);
		j2.addItemListener(this);
		j3.addItemListener(this);
		j4.addItemListener(this);
		j5.addItemListener(this);
		j6.addItemListener(this);
		j7.addItemListener(this);
		j8.addItemListener(this);
		
		
		add(j1);
		add(j2);
		add(j3);
		add(j4);
		add(j5);
		add(j6);
		add(j7);
		add(j8);
		add(ok);
		add(totallabel);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
        JVacationRental jVacationRental = new JVacationRental();
    }	

	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		int select = e.getStateChange();
		
		if (a.getSelection()==j1) {
			location = PARKSIDE;
		}
		if (a.getSelection()==j2) {
			location = POOLSIDE;
		}
		if (a.getSelection()==j3) {
			location = LAKESIDE;
		}
		
		if (b.getSelection()==j1) {
			beds = ONEBED;
		}
		if (b.getSelection()==j2) {
			beds = TWOBED;
		}
		if (b.getSelection()==j3) {
			beds = THREEBED;
		}
		
		if (a.getSelection()==j1) {
			meal = MEAL;
		}}
}}}