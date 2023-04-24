package ch00.sec05;

import java.util.Scanner;

public class PrintArray1 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("요소수");
		int n= stdIn.nextInt();
		int[] a=new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.print("a["+i+"]="); 
			a[i]=stdIn.nextInt();
		}

	}

}
