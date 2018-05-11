package MemoryGame;

import java.util.ArrayList;
import java.util.Random;

public class PinkCards extends PinkCard {

	private PinkCard[][] p; 
	private ArrayList<Square> cardSet = new ArrayList<Square>();
	private ArrayList<Square> twoFlipCardsPair = new ArrayList<Square>();
	private ArrayList<Integer> cardIndex = new ArrayList<Integer>();
	private Random randomGenerator = new Random();
	
	
	public PinkCards() {
	}
	
	public PinkCards(int x, int y) {
		
		cardSet.add(new BalloonsCard(200, 150));
		cardSet.add(new BeachCard(400, 150));
		cardSet.add(new CupcakeCard(600, 150));
		cardSet.add(new DogCard(800, 150));
		cardSet.add(new FlowerCard(200, 300));
		cardSet.add(new IceCreamCard(400, 300));
		cardSet.add(new PigCard(600, 300));
		cardSet.add(new FlowerCard(800, 300));
		cardSet.add(new CupcakeCard(200, 450)); 
		cardSet.add(new HouseCard(400, 450));
		cardSet.add(new BeachCard(600, 450));
		cardSet.add(new PigCard(800, 450));
		cardSet.add(new DogCard(200, 600));
		cardSet.add(new BalloonsCard(400, 600));
		cardSet.add(new HouseCard(600, 600));
		cardSet.add(new IceCreamCard(800, 600));
		
		for (int i= 0; i <=15; i++)
		{
			cardIndex.add(i);
		}
		
		p = new PinkCard[4][4];
		System.out.println("PinkCards: xPos = " + x + ", yPos = " + y + ", p.length = " + p.length);
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[0].length; j++) {
				p[i][j] = new PinkCard(x, y);
				x = x + 200;
			}
			x = 200; 
			y = y + 150; 
		}
		
		for (int i = 0; i < p.length; i++) {
			for (int j = 0; j < p[0].length; j++) {
				System.out.println("p[" + i + "]"+"[" + j + "]" + " = " + p[i][j]);
			}
		}
	}
	
	public PinkCard[][] pMatrix() { 
		return p;
	}
	
	public ArrayList<Square> rand() {
		
		System.out.println("Begin PinkCard[][] rand()");
		int r1, r2;		
		boolean isR1Good = false, isR2Good = false;

		do 
		{
			r1 = randomGenerator.nextInt(16);
			for (int i = 0; i < cardIndex.size(); i ++)
			{
				if (r1 == cardIndex.get(i))
				{
					isR1Good = true;
					break;
				}
			}
		}
		while(!isR1Good);
//		cardIndex.remove(new Integer(r1));
		
		do 
		{
			r2 = randomGenerator.nextInt(16);
			for (int i = 0; i < cardIndex.size(); i ++)
			{
				if (r2 == cardIndex.get(i))
				{
					isR2Good = true;
					break;
				}
			}
		}
		while(!isR2Good);
//		cardIndex.remove(new Integer(r2));
		
		System.out.println("r1=" + r1 + ", r2=" + r2);
		
		if(twoFlipCardsPair != null && twoFlipCardsPair.size() != 0 )
		{
			for(int i=0; i < twoFlipCardsPair.size(); i++)
			{
				twoFlipCardsPair.remove(i);
			}
		}
		
		twoFlipCardsPair.add(cardSet.get(r1));
		twoFlipCardsPair.add(cardSet.get(r2));
		
		for (int i = 0; i < cardIndex.size(); i++)
		{
			System.out.println("cardIndex: " + i + " = " + cardIndex.get(i));
		}
		
		return twoFlipCardsPair;
	  
	}

	public ArrayList<Square> getTwoFlipCardsPair() {
		return twoFlipCardsPair;
	}
	
}
