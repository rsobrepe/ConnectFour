package com.fdmgroup.model;

import java.util.Scanner;

public class Menu {
	private Scanner read = new Scanner(System.in);
	private Instructions i = new Instructions();
	
	public Menu(){
		
	}
	
	public void showMenu(){
		System.out.println("Welcome to connect 4, please select a menu item number!");
		System.out.println("1-StartGame | 2-Instructions | 3-Exit");
		int userInput = read.nextInt();		
		if(userInput == 1){		
			this.readyToStart();
		}
		else if(userInput == 2){
			i.showInstructions(this);
		}
		else if(userInput == 3){
			System.out.println("");
		}	
		else{
			System.out.println("That is not an option, please try again \n");
			this.showMenu();
		}
	}
	
	public boolean readyToStart(){
		return true;
	}
}
