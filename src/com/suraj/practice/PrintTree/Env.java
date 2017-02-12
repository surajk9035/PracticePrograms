package com.suraj.practice.PrintTree;

public class Env {
	
	public static final String SEPERATOR = ",";
	public static final String Alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static int getAlphaInt(String ch){
		
		return Alphabets.indexOf(ch);
	}
	
	public static boolean isAlpha(String ch){
		return Alphabets.contains(ch);
	}

}
