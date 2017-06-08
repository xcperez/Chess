import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GUI {
	
	void createBoard()
	{
		
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(750, 750);
		
		for(int i = 0; i < 64; i++) //sets tile buttons
		{
			
			JButton tile = new JButton();
			frame.add(tile);
			
		}
		
		frame.setLayout(new GridLayout(8, 8));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
	}
	


}
