import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayFont extends JFrame implements ActionListener{
	JLabel letterX;
	JLabel fontSize;
	JButton increaseBtn;
	JButton decreaseBtn;
	
	int size;
	
	DisplayFont() {
		setLayout(new GridLayout(2,2));
		size = 18;
		
		fontSize = new JLabel(String.valueOf(size), JLabel.CENTER);
		add(fontSize);
		
		letterX = new JLabel("X", JLabel.CENTER);
		letterX.setFont(new Font("Serif", Font.BOLD, size));
		add(letterX);
		
		decreaseBtn = new JButton("Decrease");
		decreaseBtn.addActionListener(this);
		add(decreaseBtn);
		
		increaseBtn = new JButton("Increase");
		increaseBtn.addActionListener(this);
		add(increaseBtn);
	}
	
	void incSize() {
		size++;
		updateFontLabels();
	}

	void decSize() {
		size--;
		updateFontLabels();
	}
	
	void updateFontLabels() {
		letterX.setFont(new Font("Serif", Font.BOLD, size));
		fontSize.setText(String.valueOf(size));
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==increaseBtn) {
			incSize();
		} else if (e.getSource()==decreaseBtn) {
			decSize();
		}
	}
}

class TestFonts {
	public static void main(String[] args) {
		DisplayFont df = new DisplayFont();
		df.setTitle("Display Fonts");
		df.setSize(200, 200);
		df.setVisible(true);;
		df.addWindowListener(new WindowAdapter()
				{ public void windowClosing(WindowEvent e)
					{	System.exit(0); }
				});
	}
}
