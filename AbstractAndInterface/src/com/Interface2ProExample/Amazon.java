package com.Interface2ProExample;

public class Amazon implements IOTTPlatform{

	@Override
	public void signUp() {
		System.out.println("Amazon.signUp()");
	}

	@Override
	public void login() {
		System.out.println("Amazon.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("Amazon.subscribe()");
	}

	@Override
	public void cancelsubscription() {
		System.out.println("Amazon.cancelsubscription()");
	}

	@Override
	public void addToFav() {
		System.out.println("Amazon.addToFav()");
	}

	@Override
	public void watchList() {
		System.out.println("Amazon.watchList()");
	}

	@Override
	public void profile() {
		System.out.println("Amazon.profile()");
	}

}
