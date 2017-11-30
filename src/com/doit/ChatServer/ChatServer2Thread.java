package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import com.doit.users.MyFileUtil;

public class ChatServer2Thread extends Thread {

	
   Socket socket;
   int temp1=1;
	public   ChatServer2Thread(Socket socket)
	{
	this.socket=socket;
	}
	@Override
		public void run() {
		
		PrintWriter printWriter = null;
		try {
			printWriter = new PrintWriter(socket.getOutputStream());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			while(true){
				int count=MyFileUtil.inFile("F:\\ChatData\\count.txt");
				int count2=MyFileUtil.inFile("F:\\ChatData\\count2.txt");
				int count3=MyFileUtil.inFile("F:\\ChatData\\count3.txt");
		if(count==1&&temp1==1)
		{
			String msg=MyFileUtil.getMsgByFile("F:\\ChatData\\BBB.txt");
		//System.out.println(MyFileUtil.getMsgByFile("F:\\ChatData\\BBB.txt"));
		 //PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
		 printWriter.println(msg);
		 printWriter.flush();
		// printWriter.close();
		 
		 
		 count2++;
		 System.out.println("聊天服务端2向(count2)"+count2+"个客户端发送了消息");
		 temp1=0;
		 if(count2==count3)
		 {
			 count=0;
			 count2=0;
			 temp1=1;
			 System.out.println("(count2)"+count2); 
		 }
		}
		
		MyFileUtil.outFile(count, "F:\\ChatData\\count.txt");
		MyFileUtil.outFile(count2, "F:\\ChatData\\count2.txt");
		MyFileUtil.outFile(count3, "F:\\ChatData\\count3.txt");
		}
	}
}
