package com.qa.TextAdventureGame;

import java.util.Scanner;

public class GameManager {

	public void findTreasure(Player p, Swamp s) {

		System.out.println(s.toString());
		System.out.println("You notice a small watch-like device in your left hand. \r\n" + "\r\n"
				+ "It has hands like a watch, but the hands don't seem to tell time.");
		System.out.println("The dial reads " + s.getTreasureX() + " meters north or south and " + s.getTreasureY()
				+ " meters east or west");
		System.out.println("Try \"north\",\"south\",\"east\",or \"west\"");

		Scanner sc = new Scanner(System.in);

		String input;

		boolean found = false;

		while (!found) {
			input = sc.next();
			if (input.equals("north")) {
				p.moveNorth();
				System.out.println("The treasure is " + (s.getTreasureY() - p.getPlayerY())
						+ " meters away in the North Direction");
				if (p.getPlayerX() == s.getTreasureX() && p.getPlayerY() == s.getTreasureY()) {
					found = true;
					System.out.println(
							"You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
				}
			}
			if (input.equals("south")) {
				p.moveSouth();
				System.out.println("The treasure is " + (s.getTreasureY() - p.getPlayerY())
						+ " meters away in the North Direction");
				if (p.getPlayerX() == s.getTreasureX() && p.getPlayerY() == s.getTreasureY()) {
					found = true;
					System.out.println(
							"You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
				}
			}
			if (input.equals("east")) {
				p.moveEast();
				System.out.println("The treasure is " + (s.getTreasureX() - p.getPlayerX())
						+ " meters away in the East Direction");
				if (p.getPlayerX() == s.getTreasureX() && p.getPlayerY() == s.getTreasureY()) {
					found = true;
					System.out.println(
							"You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
				}
			}
			if (input.equals("west")) {
				p.moveWest();
				System.out.println("The treasure is " + (s.getTreasureX() - p.getPlayerX())
						+ " meters away in the East Direction");
				if (p.getPlayerX() == s.getTreasureX() && p.getPlayerY() == s.getTreasureY()) {
					found = true;
					System.out.println(
							"You see a box sitting on the plain.   Its filled with treasure!  You win!  The end.");
				}
			}
		}
	}

}
