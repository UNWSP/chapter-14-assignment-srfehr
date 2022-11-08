package JVacationRental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ActionListener{
	final int PARKSIDE = 600;
    final int POOLSIDE = 750;
    final int LAKESIDE = 825;
    final int ONEBED = 50;
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

	JButton ok = new JButton("Ok");		
		

	public JVacationRental() {
		setTitle("Vacation Rental");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 330);
		setLayout(new FlowLayout());
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				total = location + beds + meal;
				JOptionPane.showMessageDialog(null, "Total: $" + total);
			}
			
		});
		
		a.add(j1);
		a.add(j2);
		a.add(j3);
		
		b.add(j4);
		b.add(j5);
		b.add(j6);
		
		
		c.add(j7);
		c.add(j8);
		
		
		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);
		this.add(j5);
		this.add(j6);
		this.add(j7);
		this.add(j8);
		this.add(ok);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
        JVacationRental jVacationRental = new JVacationRental();
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source==j1) {
			total += PARKSIDE;}
		if (source==j2) {
			total += POOLSIDE;}
		if (source==j3) {
			total += LAKESIDE;}
		
		if (source==j4) {
			total += ONEBED;}
		if (source==j5) {
			total += TWOBED;}
		if (source==j6) {
			total += THREEBED;}
		
		if (source==j7) {
			total += MEAL;}
	}	

}