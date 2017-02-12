package com.suraj.practice.Flipkart1;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private String name;
	
	public int pCount;
	private List<String> purchaseList=null;
	


	private boolean isBlackList;
	
	public User(String name){
		
		this.name=name;
		purchaseList=new ArrayList<String>();
		isBlackList=false;
		pCount=0;
	}
	
	public void purchase(){
		
		
		
	}
	
	public int getTotalPurchaseCount(){
		return pCount;
	}
	
	public String getRecentPurchase(){
		
		if(pCount>0){
			return purchaseList.get(pCount-1);
		}
		
		return null;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBlackList() {
		return isBlackList;
	}

	public void setBlackList(boolean isBlackList) {
		this.isBlackList = isBlackList;
	}
	

}
