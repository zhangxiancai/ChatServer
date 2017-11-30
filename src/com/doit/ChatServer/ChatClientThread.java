package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;

import com.doit.users.ChangeMessage;
import com.doit.users.Message;

public class ChatClientThread extends Thread {
	String username;
	Socket socket2;
	public ChatClientThread(String username,Socket socket2)
	{
		this.username=username;
		this.socket2=socket2;
	}
	
     public void run() {
    	 
		
    	while(true){
			try {
				
		    	 BufferedReader bufferedReader=
		    				new BufferedReader(new InputStreamReader(socket2.getInputStream()));
		    		
		    		 String	msg2 = bufferedReader.readLine();
		    		 if(msg2!=null)
		    		 {
				 List<Message> messages=ChangeMessage.getMessages(msg2);
	    		 ChangeMessage.OutUI(messages, username); 
		    		 }
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	} 
    	 
     }
	

}
