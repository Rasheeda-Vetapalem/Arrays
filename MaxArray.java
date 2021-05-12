package com.ojas.Arrays;

import java.util.Scanner;

public class MaxArray {
		public static int getMax(int[] inputArray) {
			if(inputArray.length != 10)
				return -1;
			else
			{
				int Max=inputArray[0];
				for (int i = 0; i < inputArray.length; i++) {
					if (inputArray[i] > Max)
					{
						Max=inputArray[i];	
					}
				}
				return Max;
			}
		}
				public static void main(String[] args) {
					
					System.out.println("Enter the size of the array");
					Scanner sc = new Scanner(System.in);
					int size = sc.nextInt();
					int[] inputArray= new int[size];
					System.out.println("Enter the elements");
					for (int i = 0; i < inputArray.length; i++) {
						inputArray[i] = sc.nextInt();
					}
					System.out.println(getMax(inputArray));
			}

	}


