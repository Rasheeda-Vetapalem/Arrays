package com.ojas.Arrays;

import java.util.Scanner;

public class ArrayWithoutTen {
	public static int[] withoutTen(int[] num)
	{
		int[] array = new int[num.length];
		int count = 0;
		for (int index = 0; index < num.length; index++) 
		{
			if(num[index] != 10)
			{
				array[count] = num[index];
				count++;
			}
		}
		return array;
	}
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int Size = scanner.nextInt();
		int[] array = new int[Size];
		System.out.println("Enter the size of values"+ Size );
		for (int index = 0; index < array.length; index++) 
		{
			array[index] = scanner.nextInt();
		}
		int[] Array = withoutTen(array);
		for (int index : Array) 
		{
			System.out.print(index + " ");
		}
	}

}
