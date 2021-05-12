package com.ojas.Arrays;

import java.util.Scanner;

public class EventList {
	public static int[] getEvenArray(int[] inputArray) {
		if(inputArray.length != 10) {
			return null;
		}
		int Even[] = new int[inputArray.length];
			int count=0;
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] %2==0)
				{
					Even[count]=inputArray[i];	
					count++;
				}
			}
				return Even;
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
				inputArray = getEvenArray(inputArray);

				for(int i = 0; i<inputArray.length;i++) {
					if(inputArray[i]>0) {
					System.out.print(inputArray[i] + " ");
					}
			
				}
sc.close();
	}

}
