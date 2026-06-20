package com.Interface1;

public interface IBanking{ // 100% abstract
	public abstract void pay();
	public abstract void settle();
	void addPayee(); // public abstract void addPayee();
	void modifyPayee(); // By default all the methods in interface are public and abstract
	void doEKYC();
}
