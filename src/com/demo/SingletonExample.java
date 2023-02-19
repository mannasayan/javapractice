package com.demo;

public class SingletonExample {
	
	private static final Object object= new Object();
	private static volatile  SingletonExample INSTANCE = null;

	
	private SingletonExample() {
		
	}
	
	public static SingletonExample getInstance() {
		
		if(INSTANCE != null) {
			return INSTANCE;
		}
		synchronized (object) {
			if(INSTANCE==null) {
				INSTANCE = new SingletonExample();
			}
			
			return INSTANCE;
		}
	
	}
}
