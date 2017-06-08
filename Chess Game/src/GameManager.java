import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
		JFrame frame = new JFrame();
		JButton tile = new JButton();
		int [] rows = new int[8];
		int [] cols = new int[8];
		int [] spaces = new int[64];
		
		frame = createBoard(frame, tile);
		
		
		
	}
	JFrame createBoard(JFrame frame, JButton tile)
	{
		Image whitePawnImage;
		JButton [][] grid = new JButton [8][8];
		frame = new JFrame("Chess");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setSize(750, 750);
		
		try
		{
			
			whitePawnImage = ImageIO.read(getClass().getResource("Images/White_pawn.png"));
			tile.setIcon(new ImageIcon(whitePawnImage));
		}
		catch(Exception ex)
		{
			
			System.out.println("Image did not work");
			
		}
		for(int i = 0; i < grid.length; i++) //sets tile buttons
		{
			
			for(int j = 0; j < grid[i].length; j++)
			{
				tile = new JButton();
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
