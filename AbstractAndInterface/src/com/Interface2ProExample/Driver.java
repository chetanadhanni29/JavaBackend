package com.Interface2ProExample;

public class Driver {

	public static void main(String[] args) {
		IOTTPlatform[] iott = new IOTTPlatform[5];
		iott[0] = new HotStar();
		iott[1] = new Netflix();
		iott[2] = new Amazon();
		iott[3] = new SunNext();
		iott[4] = new SonyLive();
		
		for(int i = 0; i < iott.length; i++) {
			iott[i].signUp();
			iott[i].login();
			iott[i].subscribe();
			iott[i].cancelsubscription();
			iott[i].addToFav();
			iott[i].watchList();
			iott[i].profile();
			System.out.println("--------------------------");
		}

	}

}
