package com.doit.ChatServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	
		 public  static Scanner cin=new Scanner(System.in);
			

			public static void main(String[] args) {
				
					try {
						System.out.println("����������Ϣ������");
						System.out.println("�����û�����");
						String username=cin.next();
						System.out.println("�������룺");
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
								 System.out.println("�޴��û�����¼ʧ�ܣ�");
							 }
							 else{
								 System.out.println(msg2+"���ڿ��Խ�����Ϣ");
								 Socket socket2=new Socket("",10000);
								 new ChatClientThread(msg2,socket2).start();
								 
							 }
				    	 
				    	 
				    	 
						
						
					} catch (UnknownHostException e) {
						
						e.printStackTrace();
					} catch (IOException e) {
						
						e.printStackTrace();
					}
				

			}


	}


