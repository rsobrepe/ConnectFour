package com.fdmgroup.model;

public class Chip {
	private User u;
	private int indexI, indexJ;
	private boolean isEmpty;
	
	public Chip(User u){
		this.u = u;
		this.isEmpty = true;
	}
	
	public int getIndexI() {
		return indexI;
	}

	public void setIndexI(int indexI) {
		this.indexI = indexI;
	}

	public int getIndexJ() {
		return indexJ;
	}

	public void setIndexJ(int indexJ) {
		this.indexJ = indexJ;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public String placeToken(){
		String valueOfUserId = String.valueOf(u.getUserId());
		if(isEmpty)
			return  "";
		else
			return valueOfUserId;
	}
}
