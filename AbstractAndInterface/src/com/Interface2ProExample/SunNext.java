package com.Interface2ProExample;

public class SunNext implements IOTTPlatform{

	@Override
	public void signUp() {
		System.out.println("SunNext.signUp()");
	}

	@Override
	public void login() {
		System.out.println("SunNext.login()");
	}

	@Override
	public void subscribe() {
		System.out.println("SunNext.subscribe()");
	}

	@Override
	public void cancelsubscription() {
		System.out.println("SunNext.cancelsubscription()");
	}

	@Override
	public void addToFav() {
		System.out.println("SunNext.addToFav()");
	}

	@Override
	public void watchList() {
		System.out.println("SunNext.watchList()");
	}

	@Override
	public void profile() {
		System.out.println("SunNext.profile()");
	}

}
