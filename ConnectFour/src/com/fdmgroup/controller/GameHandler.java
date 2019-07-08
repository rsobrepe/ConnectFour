package com.fdmgroup.controller;

import java.util.Scanner;
import com.fdmgroup.model.*;

public class GameHandler {
	private User u1, u2;
	private Chip[][] gridChips = new Chip[7][6];
	private boolean gameWon = false;
	private Grid g = new Grid();
	private Instructions i = new Instructions();
	private Scanner read = new Scanner(System.in);
	private Menu mainMenu = new Menu();

	public GameHandler() {
		u1 = new User("First", 1);
		u2 = new User("Second", 2);
	}

	public void init() {
		mainMenu.showMenu();
		if (mainMenu.readyToStart())
			this.startGame();
	}

	public void startGame() {

		// Game runs while the game has yet to be won
		while (!gameWon) {
			g.drawGrid();
			System.out.println();
			
		}
	}

}
