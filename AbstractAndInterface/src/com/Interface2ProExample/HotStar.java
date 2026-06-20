package com.Interface2ProExample;

public class HotStar implements IOTTPlatform{

	@Override
	public void signUp() {
		System.out.println("HotStar.signUp()");
	}

	@Override
	public void login() {
		System.out.println("HotStar.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("HotStar.subscribe()");
	}

	@Override
	public void cancelsubscription() {
		System.out.println("HotStar.cancelsubscription()");
	}

	@Override
	public void addToFav() {
		System.out.println("HotStar.addToFav()");
	}

	@Override
	public void watchList() {
		System.out.println("HotStar.watchList()");
	}

	@Override
	public void profile() {
		System.out.println("HotStar.profile()");
	}

}
