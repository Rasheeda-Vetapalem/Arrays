package com.ojas.Arrays;

import java.util.Scanner;

public class EvenInts {
	
	public static int getEvenArray(int[] inputArray) {
	int count=0;
	for (int i = 0; i < inputArray.length; i++) {
		if (inputArray[i] %2==0)
		{
			count++;
		}
	}
		return count;
		
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
	int count = getEvenArray(inputArray);
	System.out.println(count);
}
}