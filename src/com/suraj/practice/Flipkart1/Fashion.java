package com.suraj.practice.Flipkart1;

import java.util.ArrayList;
import java.util.List;

public class Fashion extends Product{
	
	public static Fashion instance = new Fashion(new ArrayList<String>());
	
	
	public List<String> pList;
	
	public Fashion(List<String> list){
		this.pList=list;
		init();
	}
	
	
	public List<String> getpList() {
		return pList;
	}


	public void init(){
		getpList().add("Shirt");
		getpList().add("Trouser");
		getpList().add("Jeans");
	}
	
	public static Fashion getInstance(){
		return instance;
	}
	
	public boolean addProduct(String prod){
		if(!getpList().contains(prod)){
			getpList().add(prod);
			return true;
		}
		
		return false;
	}
	
	
	public boolean deleteProduct(String prod){
		
		return getpList().remove(prod);
		
	}
	
	@Override
	public String toString(){
		
		StringBuffer buf = new StringBuffer();
		int c=0;
		while(c!=getpList().size()){
			
			buf.append(Integer.toString(c+1)+getpList().get(c)+"\n");
			c++;
		}
		return buf.toString();
	}

}
