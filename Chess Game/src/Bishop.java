import java.awt.Image;

import javax.imageio.ImageIO;


public class Bishop extends Piece{
	
	public Bishop(String color)
	{
		
		colors = color;
		piece = "Bishop";
		
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
	
		Image image;
		if(colors.equals("White"))
		{
			
			Image whitePieceImage = null;
			try
			{
				
				whitePieceImage = ImageIO.read(getClass().getResource("White_bishop.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			image = whitePieceImage;
		}
		else 
		{
			
			Image blackPieceImage = null;
			try
			{
				
				blackPieceImage = ImageIO.read(getClass().getResource("Black_bishop.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			image = blackPieceImage;
		}
		
		return image;
	}


}
