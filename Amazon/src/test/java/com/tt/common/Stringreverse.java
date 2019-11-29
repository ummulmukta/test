package com.tt.common;

import java.util.Arrays;

public class Stringreverse {

	public static void main(String[] args) {
int[]x= {2,4,5,7,9};
int min=10000;
int secondmin=10000;
for(int i=0;i<x.length;i++) {
	if(x[i]<min) {
		secondmin=min;
		min=x[i];
	}
	else if(x[i]<secondmin) {
		secondmin=x[i];
	}
}
System.out.println(secondmin);
	}

}
