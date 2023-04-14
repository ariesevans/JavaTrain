package ch00.sec02;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("정수 a: "); int a= stdIn.nextInt();
		System.out.println("정수 b: "); int b= stdIn.nextInt();
		
		int diff = a>= b ? a-b : b-a;
				
				if (diff <= 10)
					System.out.println("두 값의 차는 10이하 입니다");
				else
					
					System.out.println("두 값의 차는 11이상 입니다");
	}

}
