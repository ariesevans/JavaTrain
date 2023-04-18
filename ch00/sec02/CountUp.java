package ch00.sec02;

import java.util.Scanner;

public class CountUp {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("카운트업 합니다");
		int x;
		do {
			System.out.println("양의 정수값:");
			x=stdIn.nextInt();
		} while (x<=0);
		
		for (int i=0; i<=x; i++)
			System.out.println(i);
	}

}
