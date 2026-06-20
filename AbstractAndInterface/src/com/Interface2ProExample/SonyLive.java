package com.Interface2ProExample;

public class SonyLive implements IOTTPlatform{

	@Override
	public void signUp() {
		System.out.println("SonyLive.signUp()");
	}

	@Override
	public void login() {
		System.out.println("SonyLive.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("SonyLive.subscribe()");
	}

	@Override
	public void cancelsubscription() {
		System.out.println("SonyLive.cancelsubscription()");
	}

	@Override
	public void addToFav() {
		System.out.println("SonyLive.addToFav()");
	}

	@Override
	public void watchList() {
		System.out.println("SonyLive.watchList()");
	}

	@Override
	public void profile() {
		System.out.println("SonyLive.profile()");
	}

}
