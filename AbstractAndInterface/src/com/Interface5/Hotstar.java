package com.Interface5;

public class Hotstar implements INetfixServer, IAmazonServer {

	@Override
	public void video() { 
		// Here class can decide which implementation to call INetfixServer Or IAmazonServer
		IAmazonServer.super.video();
	}
	
}
