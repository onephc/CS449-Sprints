package sprint0;

import javax.swing.*;

public class Launcher {
	
	public static void main(String [] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				//JFrameOne frame1 = new JFrameOne();
				
				JFrameTwo frame2 = new JFrameTwo();
				
 
				
			}
		});	
	}
} 