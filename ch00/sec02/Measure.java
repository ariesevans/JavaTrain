package ch00.sec02;

import java.util.Scanner;

public class Measure {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		System.out.println("정숫값:");
		int n=stdIn.nextInt();
		int count =0;
		for (int i=1;i<=n; i++)
			if (n%i ==0) {
				System.out.println(i+"");
				count ++;
			}
		System.out.println("\n의 약수는 "+count+"개입니다");
	}

}
