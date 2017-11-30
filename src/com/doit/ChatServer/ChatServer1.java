package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

import com.doit.users.MyFileUtil;
  
public class ChatServer1 {
	
	public static void main(String[] args) {
		MyFileUtil.outFile(0, "F:\\ChatData\\count.txt");
		MyFileUtil.outFile(0, "F:\\ChatData\\count2.txt");
		MyFileUtil.outFile(0, "F:\\ChatData\\count3.txt");
		
		try {
			ServerSocket serverSocket = new ServerSocket(10010);
			System.out.println("聊天服务端1的Socket创建成功");
			
			while(true){
			Socket socket=serverSocket.accept();
			
			
			
			
			//new ChatServer2Thread(socket).start();
			new ChatServer1Thread(socket).start();
			}
			 
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}

}
