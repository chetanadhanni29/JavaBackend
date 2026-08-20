package com.AmazonAccount;

import com.AmazonUser.UserMgmt;

public class AccountMgmt {

	public static void main(String[] args) {
		// i want to call user mgmt module

		UserMgmt um = new UserMgmt();
		um.getUserInfo("retail");
		um.getUserInfo("marketplace");

	}

}