package com.doit.users;


import java.util.ArrayList;
import java.util.List;

public class Users {

	public static List<User> users= new ArrayList<>();
//	public Users()
//	{
//		users.add(new User("admin1","123"));
//		users.add(new User("admin2","456"));
//		users.add(new User("admin3","789"));
//	}
//	
	static{
		users.add(new User("admin1","123"));
	    users.add(new User("admin2","456"));
		users.add(new User("admin3","789"));
		
	}
		
	
}
