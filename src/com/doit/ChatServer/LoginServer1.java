package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.doit.users.ChangeMessage;
import com.doit.users.User;
import com.doit.users.UserBiz;

public class LoginServer1 {

	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket=new ServerSocket(10086);
			System.out.println("服务端的Socket创建成功");
			while(true)
			{
			Socket socket=serverSocket.accept();
			BufferedReader bufferedReader=
					new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 String msg=bufferedReader.readLine();
			
			 //bufferedReader.close();
			 
			 
			 System.out.println("申请登陆的用户为："+msg);
			 String msg2=UserBiz.getUserNamebyUser(ChangeMessage.setMessage(msg));
			
			 
			 
			 
			 PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
			 printWriter.println(msg2);
			 printWriter.flush();
			 printWriter.close();
			 
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
