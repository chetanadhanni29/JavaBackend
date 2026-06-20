package com.StaticAndInstantBlocks;

public class StaticAndInstantBlocks {
	
	static {
		System.out.println("Inside static Block 2");
	}
	
	{
		System.out.println("Inside instant Block 2");
	}
	
	public StaticAndInstantBlocks(){
		// super() or this()
		// Instant Block
		System.out.println("Inside Constructor of StaticAndInstantBlocks ");
	}
	
	void payment(){
		System.out.println("Inside Payment Method ");
	}
	
	static {
		System.out.println("Inside static Block 1");
	}
	
	{
		System.out.println("Inside instant Block 1");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside Main Method before Obj creation");
		StaticAndInstantBlocks si = new StaticAndInstantBlocks();
		System.out.println("Inside Main Method after Obj creation");
		si.payment();

	}

}
