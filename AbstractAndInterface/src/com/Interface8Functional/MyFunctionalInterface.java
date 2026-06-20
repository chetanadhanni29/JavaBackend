package com.Interface8Functional;

@FunctionalInterface
public interface MyFunctionalInterface { // SAM --> Single abstract method
	public abstract String doSomething();
	public default void doNothing() {
		
	}
}
