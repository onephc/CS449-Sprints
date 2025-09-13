package sprint0;

import java.awt.event.*;

import javax.swing.JFrame;

public class JFrameOne extends JFrame implements ActionListener{

	public JFrameOne() {
		initialize();
	}
	
	public void initialize() {
		setTitle("JFrameOne");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	@Override public void actionPerformed(ActionEvent e) {
		
	}
}
