package MemoryGame;
import java.awt.Component;

import javax.swing.JFrame;

public class MemoryGame extends JFrame
{
	private static final long serialVersionUID = 1L;
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 1300;

	public MemoryGame()
	{
		super("MEMORY GAME");
		setSize(WIDTH,HEIGHT);

		Board theGame = new Board();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
	}

	public static void main( String args[] )
	{
		MemoryGame run = new MemoryGame();
		System.out.println("Created JFrame");

	}
}
