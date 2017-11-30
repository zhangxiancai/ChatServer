package com.doit.ChatServer;

import java.io.File;
import java.io.IOException;

import com.doit.users.MyFileUtil;

public class Test {

	public static void main(String[] args) {
		
		
		
		MyFileUtil.outFile(0, "F:\\ChatData\\count3.txt");
		
		System.out.println(MyFileUtil.inFile("F:\\ChatData\\count3.txt"));
	}

}
