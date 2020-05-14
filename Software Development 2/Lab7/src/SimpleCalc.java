import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalc extends JFrame implements ActionListener {
	JLabel accum;
	JTextField userInt;
	JButton clr, plus, minus, multiply, divide;
	
	JPanel clrandUserInt;
	JPanel buttons;
	
	double total;
	
	SimpleCalc() {
		setLayout(new GridLayout(3,1));
		total = 0;
		
		accum = new JLabel(String.valueOf(total), JLabel.CENTER);
		add(accum);
		
		clrandUserInt = new JPanel(new GridLayout(1,2));
		
		clr = new JButton("CLR");
		clr.addActionListener(this);
		clrandUserInt.add(clr);
		
		userInt = new JTextField(20);
		clrandUserInt.add(userInt);
		
		add(clrandUserInt);
		
		buttons = new JPanel(new GridLayout(2,2));
		
		plus = new JButton("+");
		plus.addActionListener(this);
		buttons.add(plus);
		
		minus = new JButton("-");
		minus.addActionListener(this);
		buttons.add(minus);
		
		multiply = new JButton("x");
		multiply.addActionListener(this);
		buttons.add(multiply);
		
		divide = new JButton("/");
		divide.addActionListener(this);
		buttons.add(divide);
		
		add(buttons);
	}

	void clear() {
		total=0;
		updateAccumulator();
	}
	
	void addition(int i) {
		total+=i;
		updateAccumulator();
	}
	
	void subtraction(int i) {
		total-=i;
		updateAccumulator();
	}

	void multiplication(int i) {
		total=total*i;
		updateAccumulator();
	}
	
	void division(int i) {
		total=total/i;
		updateAccumulator();
	}
	
	void updateAccumulator() {
		accum.setText(String.valueOf(total));
	}
	
	public void actionPerformed(ActionEvent e) {
		String s = userInt.getText();
		int i = Integer.parseInt(s);
		if (e.getSource()==clr) {
			clear();
		} else if (e.getSource()==plus) {
			addition(i);
		} else if (e.getSource()==minus) {
			subtraction(i);
		}  else if (e.getSource()==multiply) {
			multiplication(i);
		} else if (e.getSource()==divide) {
			division(i);
		}
	}
}

class TestCalc {
	public static void main(String[] args) {
		SimpleCalc sc = new SimpleCalc();
		sc.setTitle("Simple Calculator");
		sc.setSize(600,400);
		sc.setVisible(true);
		sc.addWindowListener(new WindowAdapter()
				{ public void windowClosing(WindowEvent e)
			{ System.exit(0); }
				});
	}
}
	