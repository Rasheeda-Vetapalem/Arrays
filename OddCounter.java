package com.ojas.Arrays;

import java.util.Scanner;

public class OddCounter {

		public static int[] getOddCount(int[] inputArray) {
			if(inputArray.length != 10) {
				return null;
			}
			int odd[] = new int[inputArray.length];
				int count=0;
				for (int i = 0; i < inputArray.length; i++) {
					if (inputArray[i]%2 !=0)
					{
						odd[count]=inputArray[i];	
						count++;
					}
				}
				System.out.println("the no.of odd values are" +count);
					return odd;
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
					inputArray = getOddCount(inputArray);

					for(int i = 0; i<inputArray.length;i++) {
						if(inputArray[i]>0) {
						System.out.print(inputArray[i] + " ");
						}

					}

	}

}
