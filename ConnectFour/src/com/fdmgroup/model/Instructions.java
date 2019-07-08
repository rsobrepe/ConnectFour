package com.fdmgroup.model;

import java.util.Scanner;

public class Instructions {
	private Scanner scan = new Scanner(System.in);
	public void showInstructions(Menu m){		
		
		System.out.println("Sample instructions");
		System.out.println("1-Go Back | 2-Exit");
		if(scan.nextInt() == 1){
			m.showMenu();
		}
		else if(scan.nextInt() == 2){
			System.out.println("");
		}
	}
}
