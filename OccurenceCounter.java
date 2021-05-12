package com.ojas.Arrays;

import java.util.Scanner;

public class OccurenceCounter {
		static int getCount(int[] inputArray, int num) {
	        int count = 0;
	        for(int i = 0;i< inputArray.length;i++) {
	                if(inputArray[i] == num) {
	                    count++;
	                }
	            }
	            if(count == 0) {
	                return -1;
	            }
	            else 
	                return count;   
	    }
		public static void main(String[] args) {
			 Scanner scan=new Scanner(System.in);
		        int[] inputArray = new int[5];
		        System.out.println("enter the array elements");
		        for(int i = 0; i < inputArray.length ; i++) {
		            inputArray[i] = scan.nextInt();
		        }    
		        System.out.println("enter the number to be search ");
		        System.out.println(getCount(inputArray,scan.nextInt()));
		}



	}
