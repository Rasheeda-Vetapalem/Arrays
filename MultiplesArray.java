package com.ojas.Arrays;

import java.util.Scanner;

public class MultiplesArray {
	 static int[] getMultipleArray(int num) {
	        int mul = 0;
	        int[] input = new int[10];
	        if(num > 0) {
	        for(int i = 0;i< input.length;i++) {
	            input[i] = num * (i+1);
	        }
	        	return input;
	     }
	        else 
	            return null;
	 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
  System.out.println("enter the number");
  int n = sc.nextInt();
  int input[] = getMultipleArray(n);
  for(int i = 0;i < input.length; i++) {
  System.out.println(input[i] + " ");
  }
	}

}

