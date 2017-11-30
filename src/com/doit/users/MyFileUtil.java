package com.doit.users;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyFileUtil {
	public static void WriteFromMsg(String msg)
	{
		
		File file=new File("F:\\ChatData");
		if(!file.exists())
		{
			file.mkdir();
		}	
		
		
		File file2=new File("F:\\ChatData\\BBB.txt");
		if(!file2.exists())
		{
			try {
				file2.createNewFile();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		try {
			FileOutputStream fos = new FileOutputStream(file2,true);
			try {
				fos.write(msg.getBytes());
				
				fos.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	public static String getMsgByFile(String fileroad){
		
		try {
			FileInputStream fis = new FileInputStream(fileroad);
			
			//String msg="";
			int length=0;
			try {
				while(fis.read()!=-1)
					length++;
				fis.close();
				//System.out.println(length);
				byte[] buffer=new byte[length];
				
				FileInputStream fis1 = new FileInputStream(fileroad);
				fis1.read(buffer);
				fis1.close();
//				for (int i = 0; i < buffer.length; i++) {
//					System.out.print((char)buffer[i]);
//				}
				
				 return new String(buffer);
				
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	public static void outFile(int count,String fileroad)
	{
		try {
			FileOutputStream fos = new FileOutputStream(fileroad);
			try {
				fos.write(count);
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static int inFile(String fileroad)
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(fileroad);
			try {
				int a=fis.read();
				fis.close();
				return a;
						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	
	return 0;
	}
}
