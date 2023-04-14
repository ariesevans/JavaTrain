package ch00.sec02;

import java.util.Scanner;

public class Measure2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("변수 A:"); int a=stdIn.nextInt();
		System.out.println("변수 B:"); int b=stdIn.nextInt();
		
		if (a%b ==0)
			System.out.println("B는 A의 약수 입니다");
		else
			System.out.println("B는 A의 약수가 아닙니다");
	}

}
