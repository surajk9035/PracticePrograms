package com.suraj.practice.Flipkart1;

import org.apache.log4j.Logger;


class CreateUser implements Runnable{
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class PurchaseProduct implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class AddProduct implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class BlacklistUser implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class DisplayBestSellingProduct implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

class DisplayBestSellingProductForCat implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}

public class OnlineMart implements Runnable{
	
	static Logger log = Logger.getLogger(OnlineMart.class);
	
//	public OnlineMart(UserSelection sel, )
	
	@Override
	public void run(){
		
		
		int option=2;
		log.info("1. Create a user.\n2. Purchase a product.\n 3. Add a product.\n 4. Blacklist a user.\n5. Display best selling Product.\n6. Display best selling product by category.\n Please select any one... [Purchase a product(2)]");
		Task tsk =null;
		switch(option){
		case 1: 
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		}
		
	}
	

	public static void main(String[] args) {
		
		log.info("Welcome to Online Mart.");
		
		
		
		
	
	}

}
