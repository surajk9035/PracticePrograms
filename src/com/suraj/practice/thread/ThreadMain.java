package com.suraj.practice.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadMain {
	
	
	
	
	

	public static void main(String[] args) {
		
		
		new ThreadMain().develop();
		

	}
	
	public void develop(){
		
		
		Thread main = Thread.currentThread();
		
		Lock threadLock = new ReentrantLock();
		
		
		threadLock.lock();
		
		
		new HelloWorld().start();
		
		
		
		
		
		
//		synchronized(this){
//			this.notify();
//		}
		
		
		
		System.out.println("suraj");
		
	}

}
