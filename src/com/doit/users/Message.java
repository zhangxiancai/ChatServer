package com.doit.users;

public class Message {

	private String username;
	private String message;
	private String time;
	public Message(String username,String message,String time)
	{
		this.username=username;
		this.message=message;
		this.time=time;
	}
	public String getUserName()
	{
		return username;
	}
	
	public String getMessage()
	{
		return message;
	}
	public String getTime()
	{
		return time;
	}
}
