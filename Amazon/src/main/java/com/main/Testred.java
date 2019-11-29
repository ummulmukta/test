package com.main;



public class Testred {
	

	public static void main(String[] args) {
		int[]x= {1,4,5,6,7,8};
		int max=0;
		int secondmax=0;
		for(int i=0;i<x.length;i++) {
			if(x[i]>max) {
				secondmax=max;
			max=x[i];
			
		}
			else if(x[i]>secondmax) {
				secondmax=x[i];
				
			}
	}
	System.out.println(secondmax);	
		
		
}}
