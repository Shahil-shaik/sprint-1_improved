package com.capgemini.online_test.dto;

public class User {
	private String userName,userPassword;
	private long userId;
	private test userTest;
	private Boolean isAdmin;
	public User(String userName, long userId, boolean isAdmin, test userTest, String userPassword) {
		this.userName=userName;
		this.isAdmin=isAdmin;
		this.userId=userId;
		this.userTest=userTest;
		this.userPassword=userPassword;
	}
	public User() {
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public test getUserTest() {
		return userTest;
	}
	public void setUserTest(test userTest) {
		this.userTest = userTest;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}