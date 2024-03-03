package GUI;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class learningGUI implements ActionListener{
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public learningGUI() {
		
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Click me");
		button.addActionListener(this);
		
		label = new JLabel ("Number of Clicks: 0");
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Learning our first GUI");
		frame.pack();
		frame.setVisible(true);
		
		
	}
	
	public static void main (String[] args) {
		
		new learningGUI();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		count++;
		label.setText("Number of Clicks: " + count);
		
	}
}
