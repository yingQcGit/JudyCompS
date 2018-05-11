package MemoryGame;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class PigCard extends Square
{
	private Image image;
	private PinkCard back; 

	public PigCard()
	{
		this(0,0);
	}

	public PigCard(int x, int y)
	{
		super(x, y);
		back = new PinkCard(x, y);
		try
		{
//			image = ImageIO.read(new File("/Users/judyqin/git/APCSAHome/APCSAHome/src/MemoryGame/pig.JPG"));
			image = ImageIO.read(new File("./src/MemoryGame/pig.JPG"));
		}
		catch(Exception e)
		{
			System.out.println("PigCard: we have a problem!");
		}
	}


	public void draw( Graphics window )
	{
		window.drawImage(image,getxPos(),getyPos(),80,80,null);
	}
	
	public void drawBack(Graphics window)
	{
		back.draw(window);
	}

	public String toString()
	{
		return super.toString();
	}
}
