package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.doit.users.ChangeMessage;
import com.doit.users.User;
import com.doit.users.UserBiz;

public class Client {
	 public  static Scanner cin=new Scanner(System.in);
	

	public static void main(String[] args) {
		
			try {
				System.out.println("输入用户名：");
				String username=cin.next();
				System.out.println("输入密码：");
				String password=cin.next();
				String msg=username+"&"+password;
				//String msg="username="+username+"&"+"password="+password;
				
				
				
				
				Socket socket=new Socket("",10086);
				PrintWriter printWriter = 
						new PrintWriter(socket.getOutputStream());
				printWriter.println(msg);
		    	 printWriter.flush();
		    	// socket.close();
		    	 
		    	 BufferedReader bufferedReader=
							new BufferedReader(new InputStreamReader(socket.getInputStream()));
					 String msg2=bufferedReader.readLine();
					 
					 
					
					 if(msg2.equals("XXX")){
						// System.out.println(msg2);
						 System.out.println("无此用户，登录失败！");
					 }
					 else{
						 System.out.println(msg2+" 你好，聊天室登陆成功！");
						 ChatClient.start(msg2);
						 
					 }
		    	 
		    	 
		    	 
				
				
			} catch (UnknownHostException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		

	}

}
