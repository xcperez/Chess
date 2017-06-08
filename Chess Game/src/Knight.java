import java.awt.Image;

import javax.imageio.ImageIO;


public class Knight extends Piece{
	
	public Knight(String color)
	{
		
		colors = color;
		piece = "Knight";
		
	}
	public String getPiece()
	{
		
		return piece;
	}
	public boolean isDead()
	{
		
		return false;
		
	}
	public int[][] getMoveSet()
	{
		int [][] moveSet = new int [0][1];
		
		return moveSet;
		
	}
	public String getColor()
	{
		
		return colors;
		
	}
	public Image getImage()
	{
	
		Image knightimage;
		if(colors.equals("White"))
		{
			
			Image whiteKnightImage = null;
			try
			{
				
				whiteKnightImage = ImageIO.read(getClass().getResource("White_knight.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			knightimage = whiteKnightImage;
		}
		else 
		{
			
			Image blackRookImage = null;
			try
			{
				
				blackRookImage = ImageIO.read(getClass().getResource("Black_knight.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			knightimage = blackRookImage;
		}
		
		return knightimage;
	}

}
