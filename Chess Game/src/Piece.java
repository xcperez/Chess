import java.awt.Image;


public abstract class Piece { // decorator
	
	String piece = "Piece";
	String colors = "Color";
	Image image;
	int xMove = 0;
	int yMove = 0;
	int [][] moveSet = new int [xMove][yMove];
	boolean hasMoved = false;
	boolean isDead = false;
	
	public String getPiece()
	{
		
		return piece;
		
	}
	public void setPiece(String x)
	{
		
		piece = x;
		
	}
	public int getXMove()
	{
		
		return xMove;
	}
	public int getYMove()
	{
		
		return yMove;
	}
	public Image getImage()
	{
		
		return image;
		
	}
	public void setImage(Image img)
	{
		
		image = img;
		
	}
	void dead()
	{
		
		isDead = true;
		
	}
	

}
