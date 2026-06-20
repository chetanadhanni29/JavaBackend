package com.Interface2ProExample;

public class Netflix implements IOTTPlatform{

	@Override
	public void signUp() {
		System.out.println("Netflix.signUp()");
	}

	@Override
	public void login() {
		System.out.println("Netflix.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("Netflix.subscribe()");
	}

	@Override
	public void cancelsubscription() {
		System.out.println("Netflix.cancelsubscription()");
	}

	@Override
	public void addToFav() {
		System.out.println("Netflix.addToFav()");
	}

	@Override
	public void watchList() {
		System.out.println("Netflix.watchList()");
	}

	@Override
	public void profile() {
		System.out.println("Netflix.profile()");
	}

}
