import java.awt.Image;

import javax.imageio.ImageIO;


public class Rook extends Piece{
	
	public Rook(String color)
	{
		
		colors = color;
		piece = "R";
		
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
	
		Image rookimage;
		if(colors.equals("White"))
		{
			
			Image whiteRookImage = null;
			try
			{
				
				whiteRookImage = ImageIO.read(getClass().getResource("White_rook.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			rookimage = whiteRookImage;
		}
		else 
		{
			
			Image blackRookImage = null;
			try
			{
				
				blackRookImage = ImageIO.read(getClass().getResource("Black_rook.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			rookimage = blackRookImage;
		}
		
		return rookimage;
	}

}
