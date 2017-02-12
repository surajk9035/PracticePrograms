package com.suraj.javaprograms;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		Scanner s = new Scanner(new InputStreamReader(System.in));
		int n = s.nextInt();
		int l = s.nextInt();
		int r = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		int mi=Integer.MAX_VALUE;
		for(int i=1;i<n;i++){
			int temp =arr[i]-arr[i-1];
			if(temp<mi){
				mi = temp; 
			}
		}
		if(mi>l && mi<r)
		System.out.println(r-mi+1);
		else
		System.out.println(r-l+1);

	}

}
