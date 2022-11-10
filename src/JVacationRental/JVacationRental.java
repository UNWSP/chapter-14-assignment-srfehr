package JVacationRental;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JVacationRental extends JFrame implements ItemListener{
	final int PARKSIDE = 600;
    final int POOLSIDE = 750;
    final int LAKESIDE = 825;
    final int ONEBED = 50;
    final int TWOBED = 75;
    final int THREEBED = 150;
    final int MEAL = 200;
    
    int location, beds, total;
    int meal = 0;
	
 // asking user what property they are renting
 	JRadioButton j1 = new JRadioButton("Park Side rental", false);
 	JRadioButton j2 = new JRadioButton("Pool side rental", false);
 	JRadioButton j3 = new JRadioButton("Lake side rental", false);

 	// asking user how many beds they are getting
 	JRadioButton j4 = new JRadioButton("1 Bed", false);
 	JRadioButton j5 = new JRadioButton("2 Bed", false);
 	JRadioButton j6 = new JRadioButton("3 Bed", false);

 	// asking user if they are getting a meal
 	JRadioButton j7 = new JRadioButton("Yes", false);
 	JRadioButton j8 = new JRadioButton("no", false);
	JLabel price = new JLabel();
		

	public JVacationRental() {
		super("Choose rental site");
		setTitle("Vacation Rental");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 330);
		setLayout(new FlowLayout());					
		
		this.add(j1);
		this.add(j2);
		this.add(j3);
		this.add(j4);
		this.add(j5);
		this.add(j6);
		this.add(j7);
		this.add(j8);
		this.add(price);
		
		price.setText("$" + total);
		
		j1.addItemListener(this);
		j2.addItemListener(this);
		j3.addItemListener(this);
		
		j4.addItemListener(this);
		j5.addItemListener(this);
		j6.addItemListener(this);
		
		j7.addItemListener(this);
		j8.addItemListener(this);
		
	}
	@Override
	public void itemStateChanged(ItemEvent check) {
		Object source = check.getSource();
		int select = check.getStateChange();

		if(source == j1) {

			if (select == ItemEvent.SELECTED) {
				total+= PARKSIDE;
			}
		}
		if(source == j2) {
			if (select == ItemEvent.SELECTED) {
				total+=POOLSIDE;
			}
		}
		if (source == j3) {
			if (select == ItemEvent.SELECTED) {
				total+=LAKESIDE;

			}
		}

		// adding action response for bedroom checkboxes
		if(source == j4) {
			if (select == ItemEvent.SELECTED) {
				total+=ONEBED;

			}
		}
		if(source == j5) {
			if(select == ItemEvent.SELECTED) {
				total+=TWOBED;
			}

		}
		if(source == j6) {
			if(select == ItemEvent.SELECTED) {
				total+=THREEBED;
			}
		}

		//adding action response for meal
		if(source == j7) {
			if(select == ItemEvent.SELECTED) {
				total+=MEAL;
			}
			price.setText("$" + total);

		}
		if(source == j8) {
			if (select == ItemEvent.SELECTED) {

			}
			price.setText("$" + total);}
	}
		
public static void main(String[] args) {
	  JVacationRental jVacationRental = new JVacationRental();
	  jVacationRental.setVisible(true);
}
}
		
