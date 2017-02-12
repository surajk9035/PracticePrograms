package com.suraj.practice.PrintTree;

import org.apache.log4j.Logger;

public class TreeAdjMatrix {
	
	static Logger Log = Logger.getLogger(TreeAdjMatrix.class.getName());
	boolean[][] _adjMat;



	public TreeAdjMatrix(String[] inp) throws InvalidInputException{
		this._adjMat = getBoolMat(inp);
	}
	
	
	
	public static boolean[][] getBoolMat(String[] inp) throws InvalidInputException{
		
		boolean[][] mat = new boolean[26][26];
		boolean flag = false;
		
		Log.debug("Going to make Adjency Matrix");
		for(int i=0;i<inp.length;i++){
			
			String[] ch = inp[i].split(Env.SEPERATOR);
			if(ch.length!=2&&ch[0].length()!=1&&ch[1].length()!=1&&!Env.isAlpha(ch[0])&&!Env.isAlpha(ch[1])){
				flag = true;
				break;
			}
				
			mat[Env.getAlphaInt(ch[0])][Env.getAlphaInt(ch[1])]= true;
			
		}
		
		if(flag){
			throw new InvalidInputException("Input format is not correct");
		}
		
		Log.debug("Input is Valid");
			
		return mat;
	}
	
	public boolean[][] get_adjMat() {
		return _adjMat;
	}



	public void set_adjMat(boolean[][] _adjMat) {
		this._adjMat = _adjMat;
	}

}
