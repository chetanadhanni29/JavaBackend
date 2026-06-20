package com.Interface5;

public interface INetfixServer {
	default void video() {
		System.out.println("INetfixServer.video()"); // X
	}
}
