package com.qa.TextAdventureGame;

public class Swamp {

	private String colour;
	private String weather;
	private int treasureX;
	private int treasureY;

	public Swamp(String colour, String weather, int treasureX, int treasureY) {
		this.colour = colour;
		this.weather = weather;
		this.treasureX = treasureX;
		this.treasureY = treasureY;

	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public int getTreasureX() {
		return treasureX;
	}

	public void setTreasureX(int x) {
		this.treasureX = treasureX;
	}

	public int getTreasureY() {
		return treasureY;
	}

	public void setTreasureY(int treasureY) {
		this.treasureY = treasureY;
	}
	
	public int distanceToTreasure(int a, int b)
	{
		int distance = (int) Math.sqrt(a * b);
		return distance;
	}

	@Override
	public String toString() {

		return colour + weather + "clouds float oppressively close to you, reflected in the murky " + colour
				+ " water which reaches up your shins.";
	}
}
