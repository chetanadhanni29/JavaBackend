package com.StaticAndInstantBlocks;

class User{
	public static int totalLiveUsers = 0;
	private String mobile;
	
	public User(String mobile) {
		this.mobile = mobile;
	}
	{
		totalLiveUsers += 1;
	}
}

public class JioHotStar {

	public static void main(String[] args) {
		User u1 = new User("8358632891");
		User u2 = new User("3473832489");
		User u3 = new User("1952796327");
		User u4 = new User("9852147964");
		User u5 = new User("9631457885");
		User u6 = new User("8352792891");
		User u7 = new User("8258532891");
		User u8 = new User("8384258891");
		User u9 = new User("8350864891");
		User u10 = new User("8350413591");
		
		System.out.println(" Total Live Viewers are : " + User.totalLiveUsers);		

	}

}
