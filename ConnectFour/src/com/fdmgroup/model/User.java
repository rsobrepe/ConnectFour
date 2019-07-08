package com.fdmgroup.model;

public class User {
	private Chip[] userChips = new Chip[21];
	private String name;
	private int userId;

	public User() {
		this.userId = 1;		
	}

	public User(String name, int idSet) {
		this.userId = idSet;
		this.name = name;
	}

	public Chip[] getUserChips() {
		return userChips;
	}

	public void setUserChips(Chip[] userChips) {
		this.userChips = userChips;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

}
