import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class GameManager {//singleton
	
	private static GameManager manager;
	
	GameManager(){}
	
	public static GameManager getInstance() 
	{
		
		if(manager == null)
		{
			
			manager = new GameManager();
			
		}
		return manager;
	}
	//add other methods 
	void createGame()
	{
		int [] rows = new int[8];
		int [] cols = new int[8];
		int [] spaces = new int[64];
		
		createBoard();
		
		
		
	}
	JFrame createBoard()
	{
		JButton [][] grid = new JButton [8][8];
		JFrame frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(750, 750);
		
		for(int i = 0; i < grid.length; i++) //sets tile buttons
		{
			
			for(int j = 0; j < grid[i].length; j++)
			{
				JButton tile = new JButton();
				frame.add(tile);
				if((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0))
				{
					
					tile.setBackground(Color.white);
				}
				else 
				{
					
					tile.setBackground(Color.gray);
					
				}
						
				
			}
			
		}
		
		
		frame.setLayout(new GridLayout(8, 8));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		return frame;
		
	}
	

}
