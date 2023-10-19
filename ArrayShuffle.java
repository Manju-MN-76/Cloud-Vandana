package com.java;

import java.util.Random;
import java.util.Scanner;

public class ArrayShuffle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter Array length");
		int len=sc.nextInt();
		
		int Array[]=new int[len];
		
		System.out.println("enter Array values");
		for(int i=0;i<len;i++)
		Array[i]=sc.nextInt();
		
		Shuffle(Array);
		
		sc.close();
		

	}

	public static void Shuffle(int[] Array) {
		int size=Array.length;
		
		for(int i=0;i<size;i++) {
			int RandomIndex=new Random().nextInt(size);
	
			int temp=Array[RandomIndex];
			Array[RandomIndex]=Array[i];
			Array[i]=temp;
		}
		for(int i=0;i<size;i++)
		System.out.print(" "+Array[i]);

	}

}
