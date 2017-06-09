import java.awt.Image;

import javax.imageio.ImageIO;


public class Pawn extends Piece{
	
	
	public Pawn(String color)
	{
		colors = color;
		piece =  color + "Pawn";
		
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
	
		Image pawnimage;
		if(colors.equals("White"))
		{
			
			Image whitePawnImage = null;
			try
			{
				
				whitePawnImage = ImageIO.read(getClass().getResource("White_pawn.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			pawnimage = whitePawnImage;
		}
		else 
		{
			
			Image blackPawnImage = null;
			try
			{
				
				blackPawnImage = ImageIO.read(getClass().getResource("Black_pawn.png"));
				
			}
			catch(Exception ex)
			{
				
				System.out.println("Image did not work");
				
			}
			pawnimage = blackPawnImage;
		}
		
		return pawnimage;
	}
	

}
