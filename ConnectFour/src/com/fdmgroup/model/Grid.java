package com.fdmgroup.model;

public class Grid {
	// Handles default setting
	public Grid() {
		
	}

	// handles two player game


	public void drawGrid() {
		for(int i = 1; i <= 6; i++){
			System.out.print("("+i+")");
		}
		
		System.out.println("");
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {			
				System.out.print("[ ]");
			}
			System.out.println("");
		}
	}
	
	public void updateGrid(){
		
	}
	
	public void placeChip(Chip c, User u){
		
		
	}

}
