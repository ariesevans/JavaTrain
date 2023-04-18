package ch00.sec02;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		int n;
		
		do {
			System.out.println("양의 정숫값:");
			n= stdIn.nextInt();
		} while (n<=0);
		
		int factorail=1;
		int i=1;
		
		while (i<=n) {
			factorail *= i;
					i++;
			
		}
		System.out.println("1부터 "+n+"까지의 곱은"+factorail+"입니다.");
	}

}
