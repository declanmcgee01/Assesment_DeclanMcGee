package com.qa.TextAdventureGame;

public class Runner {

	public static void main(String[] args) {

		int randX = (int) ((Math.random() * 10) + 1);
		int randY = (int) ((Math.random() * 10 + 1));

		GameManager g = new GameManager();
		Swamp s = new Swamp("Grey ", "Wet ", randX, randY);
		Player p = new Player(0, 0);

		g.findTreasure(p, s);

	}

}
