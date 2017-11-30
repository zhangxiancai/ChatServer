package com.doit.users;

public class UserBiz {

	public static String getUserNamebyUser(User user1)
	{
		for(User user2:Users.users)
		{
			if(user1.getUserName().equalsIgnoreCase(user2.getUserName())
					&&user1.getPassWord().equals(user2.getPassWord()))
				return user2.getUserName();
		}
		
		return "XXX";
	}
}
