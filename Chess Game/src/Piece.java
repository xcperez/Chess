
public abstract class Piece { // decorator
	
	String piece = "Piece";
	int xMove = 0;
	int yMove = 0;
	int [][] moveSet = new int [xMove][yMove];
	boolean isDead = false;
	
	public String getPiece()
	{
		
		return piece;
		
	}
	public int [][] getMoveSet()
	{
		
		return moveSet;
		
	}
	void dead()
	{
		
		isDead = true;
		
	}
	

}
