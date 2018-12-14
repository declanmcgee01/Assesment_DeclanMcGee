package com.qa.TextAdventureGame;

import java.util.Scanner;

public class Player {

	private int playerX;
	private int playerY;

	public Player(int playerX, int playerY) {
		this.playerX = playerX;
		this.playerY = playerY;
	}

	public int getPlayerX() {
		return playerX;
	}

	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	public int getPlayerY() {
		return playerY;
	}

	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}

	public void moveNorth() {
		playerY++;
	}

	public void moveSouth() {
		playerY--;
	}

	public void moveEast() {
		playerX++;
	}

	public void moveWest() {
		playerX--;
	}
	

}
