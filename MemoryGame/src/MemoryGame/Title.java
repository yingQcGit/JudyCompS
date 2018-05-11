package MemoryGame;

public class Title implements Locatable {

	private int xPos;
	private int yPos;

	public Title()
	{
		xPos = 0; 
		yPos = 0; 
	}

	public Title(int x, int y)
	{
		xPos = x; 
		yPos = y; 
	}

	public void setPos( int x, int y)
	{
		xPos = x; 
		yPos = y; 
	}


	public void setX(int x)
	{
		xPos = x; 
	}


	public void setY(int y)
	{
		yPos = y; 
	}

	public int getX()
	{
		return xPos;
	}


	public int getY()
	{
		return yPos;
	}
	
}
