package com.doit.ChatServer;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.doit.users.ChangeMessage;
import com.doit.users.MyFileUtil;

public class ChatServer2 {
	static int temp=0;
	public static void main(String[] args) {
		
		
		try {
			ServerSocket serverSocket = new ServerSocket(10000);
			System.out.println("聊天服务端2的Socket创建成功");
			while(true){
			
			Socket socket=serverSocket.accept();
			int count3=MyFileUtil.inFile("F:\\ChatData\\count3.txt");
			count3++;
			MyFileUtil.outFile(count3, "F:\\ChatData\\count3.txt");
			System.out.println("有Client2连接。。。(count3)"+count3);
			new ChatServer2Thread(socket).start();
			
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		
		
	
	
	
	}
}
