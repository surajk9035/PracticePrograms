package com.suraj.practice.PrintTree;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class PrintTreeMain {
	
	static Logger Log = Logger.getLogger(PrintTreeMain.class);
  

	public static void main(String[] args) {
		
		
		
		BasicConfigurator.configure();
		
		Log.debug(
				"Practice Program:"
				+ "Given multiple tuples in the form of (A,B) where A is the parent and B is the child in a binary tree, "
				+ "find if the input is valid or not. 4 error conditions were provided: \n"
				+ "1. If a parent has more than 2 children,\n"
				+ "2. If duplicate tuples entered,\n"
				+ "3. If the tree has a cycle,\n"
				+ "4. If more than one root possible."
				+ "\nFor violation of multiple validity conditions, print the condition coming first in the above order.\nIf the input is valid, print the tree in a serial representation. For eg: If input is (A,B), (B,C), (A,D), (C,E) , output: (A(B(C(E)))(D))");
		TreeAdjMatrix adjMatrix=null;
		try {
			adjMatrix= new TreeAdjMatrix(args);
		} catch (InvalidInputException e) {
			Log.error("Invalid input");
			e.printStackTrace();
		}
		
		boolean[][] mat = adjMatrix.get_adjMat();
		
	}
	
}
