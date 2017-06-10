import java.awt.Image;

import javax.swing.JButton;


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
	void movePiece(Piece [][] piece, JButton [][] grid, int xp, int yp, int x, int y)
	{
		
		switch(piece[xp][yp].getPiece())
		{
		
		case "WhitePawn":
			if(piece[xp][yp].hasMoved == false)
			{
				if((x == (xp + piece[xp][yp].getXMove())) && (y == (yp + piece[xp][yp].getYMove())))
				{
					
					piece[x][y] = new Pawn("White");
					piece[x][y].hasMoved = true;
					piece[xp][yp].setPiece(null);
					grid[x][y].setIcon(grid[xp][yp].getIcon());
					grid[xp][yp].setIcon(null);
				}
				else if((x == (xp + piece[xp][yp].getXMove() + 1)) && (y == (yp + piece[xp][yp].getYMove())))
				{
					
					piece[x][y] = new Pawn("White");
					piece[x][y].hasMoved = true;
					piece[xp][yp].setPiece(null);
					grid[x][y].setIcon(grid[xp][yp].getIcon());
					grid[xp][yp].setIcon(null);
					
				}
				else 
				{
					System.out.println("Not a valid move");
				}
			}
			else 
			{
				
				if((x == (xp + piece[xp][yp].getXMove())) && (y == (yp + piece[xp][yp].getYMove())))
				{
					
					piece[x][y] = new Pawn("White");
					piece[x][y].hasMoved = true;
					piece[xp][yp].setPiece(null);
					grid[x][y].setIcon(grid[xp][yp].getIcon());
					grid[xp][yp].setIcon(null);
				}
				else 
				{
					System.out.println("Not a valid move.");
				}
			}
			break;
			
		case "BlackPawn":
			
			if(piece[xp][yp].hasMoved == false)
			{
				if((x == (xp + piece[xp][yp].getXMove())) && (y == (yp + piece[xp][yp].getYMove())))
				{
					
					piece[x][y] = new Pawn("White");
					piece[x][y].hasMoved = true;
					piece[xp][yp].setPiece(null);
					grid[x][y].setIcon(grid[xp][yp].getIcon());
					grid[xp][yp].setIcon(null);
				}
				else if((x == (xp + piece[xp][yp].getXMove() - 1)) && (y == (yp + piece[xp][yp].getYMove())))
				{
					
					piece[x][y] = new Pawn("White");
					piece[x][y].hasMoved = true;
					piece[xp][yp].setPiece(null);
					grid[x][y].setIcon(grid[xp][yp].getIcon());
					grid[xp][yp].setIcon(null);
					
				}
				else 
				{
					System.out.println("Not a valid move");
				}
			}
			else 
			{
				
				if((x == (xp + piece[xp][yp].getXMove())) && (y == (yp + piece[xp][yp].getYMove())))
				{
					
					piece[x][y] = new Pawn("White");
					piece[x][y].hasMoved = true;
					piece[xp][yp].setPiece(null);
					grid[x][y].setIcon(grid[xp][yp].getIcon());
					grid[xp][yp].setIcon(null);
				}
				else 
				{
					System.out.println("Not a valid move.");
				}
			}
		}
		
	}
	
}


