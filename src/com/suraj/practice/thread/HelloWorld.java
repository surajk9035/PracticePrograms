package com.suraj.practice.thread;

public class HelloWorld extends Thread{
	
	
	
	@Override
	public void run(){
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Suraj");
		synchronized(this){
			this.notifyAll();
		}
		
	}

}
