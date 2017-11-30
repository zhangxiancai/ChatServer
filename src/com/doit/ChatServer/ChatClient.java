package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Scanner;

import com.doit.users.ChangeMessage;
import com.doit.users.Message;

public class ChatClient {
	   
	public static void start(String username)
	{
		Scanner cin=new Scanner(System.in);
		try {
			 Socket socket = new Socket("",10010);
			 System.out.println("聊天服务器连接成功。。。");
			// new ChatClientThread(username,socket).start();
			while(true){
			System.out.println("输入所发送的消息：");
			String msg=cin.next();
			//String msg1="username="+username+"&message="+msg+"&time="+System.currentTimeMillis();
			String msg1=username+"&"+msg+"&"+System.currentTimeMillis();
			
			
			 
			 PrintWriter printWriter = 
						new PrintWriter(socket.getOutputStream());
				printWriter.println(msg1);
		    	 printWriter.flush();
		    	 System.out.println("发送成功！"); 
		    	 
					 
					 
					 
					 
					 
			}
			
				 
		} catch (UnknownHostException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
