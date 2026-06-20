package com.Interface5;

public interface IAmazonServer {
	default void video() {
		System.out.println("IAmazonServer.video()"); // Y
	}
}
