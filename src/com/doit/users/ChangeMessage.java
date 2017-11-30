package com.doit.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ChangeMessage {
//	public static HashMap<String,Object> setMessage(String msg)
//	{
//		String[] msg1=msg.split("&");
//		HashMap<String, Object> msg2 = new HashMap<>();
//		for (int i = 0; i < msg1.length; i++) {
//			msg2.put(msg1[i].split("=")[0],msg1[i].split("=")[1]);
//		}
//		return msg2;
//	}

	public static User setMessage(String msg)
	{
		String[] msg1=msg.split("&");
		return new User(msg1[0],msg1[1]);
	}
	
	public static List<Message> getMessages(String msg)
	{
		
		List<Message> messages=new ArrayList<Message>();
		//msg.
		//System.out.println(msg);
		msg.substring(0, msg.length()-2);
		String[] msg1=msg.split(";");
		
		//System.out.println(msg1[msg1.length-1]);
		for (int i = 0; i < msg1.length; i++) {

			messages.add(new Message(
					msg1[i].split("&")[0],
					msg1[i].split("&")[1],
					new Date(Long.valueOf((msg1[i].split("&")[2]))).toLocaleString()));
		}
		return messages;
	}
	
	
	
	
	
	
	public static void OutUI(List<Message> messages,String username)
	{
		System.out.println("******"+username+"µÄÁÄÌì******");
		for (int i = 0; i < messages.size(); i++) {
			

			if(messages.get(i).getUserName().equals(username))
		     System.out.println("**("+messages.get(i).getUserName()+")**:");
			else
				System.out.println("("+messages.get(i).getUserName()+"):");
		    System.out.println(messages.get(i).getMessage());
		    System.out.println(messages.get(i).getTime());
		}
	}
	
	
	
}













