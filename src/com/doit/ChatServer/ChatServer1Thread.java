package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import com.doit.users.MyFileUtil;

public class ChatServer1Thread extends Thread {

	  Socket socket;
	   
	public   ChatServer1Thread(Socket socket)
 {
	this.socket=socket;
	}
	
	
	@Override
	public void run() {
		
		BufferedReader bufferedReader;
		try {
			//new ChatServer2Thread(socket).start();
			while(true){
			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 String msg=bufferedReader.readLine();
			 System.out.println("接收消息为："+msg);
			 
			 MyFileUtil.WriteFromMsg(msg+";");
			 System.out.println("已保存到F:\\ChatData\\BBB.txt.....");
			 int count=MyFileUtil.inFile("F:\\ChatData\\count.txt");
				count=1;
				MyFileUtil.outFile(count, "F:\\ChatData\\count.txt");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
