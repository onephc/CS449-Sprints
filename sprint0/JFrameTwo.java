package sprint0;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class JFrameTwo  implements ActionListener{

	private JFrame frame;
	
	public JFrameTwo() {
		initialize();
	}
	/*
	public void paintComponent(Graphics g) 
	{
		g.setColor(Color.RED);
		g.drawLine(1, 20, 120, 150);
	}
	*/
	
	public void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JFrameTwo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(500, 400);
		
		JRadioButton pizzaButton = new JRadioButton("Pizza");
		JRadioButton hamburgerButton = new JRadioButton("Hamburger");
		JRadioButton hotdogButton = new JRadioButton("Hotdog");
		
		JCheckBox coolnessCheck = new JCheckBox("Does your mouse work?");
		
		JTextField nameEnter = new JTextField("       ");
		
		
		this.frame.add(pizzaButton);
		this.frame.add(hamburgerButton);
		this.frame.add(hotdogButton);
		
		this.frame.add(coolnessCheck);
		
		this.frame.add(nameEnter);
		
		this.frame.setLayout(new FlowLayout());
		this.frame.setLocationRelativeTo(null);
		this.frame.setResizable(false);
		this.frame.setVisible(true);
	}
	
	@Override public void actionPerformed(ActionEvent e) {
		
	}
}
