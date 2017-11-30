package com.doit.users;

public class User {

    private String username;
	private String password;
	public User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	public String getUserName()
	{
		return username;
	}
	
	public String getPassWord()
	{
		return password;
	}
}
