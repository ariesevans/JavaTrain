package ch00.sec08;

import java.util.Scanner;

public class Triangle {
	static void putChars(char c,int n) {
		while (n-->0)
			System.out.println(c);
	}
	static void putStars(int n) {
		putChars('*',n);
	}

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼가현을 표시합니다");
		System.out.println("단수는:");
		int n=stdIn.nextInt();
		for (int i=1;i<=n; i++) {
			putStars(i);
			System.out.println();
		}

	}

}
