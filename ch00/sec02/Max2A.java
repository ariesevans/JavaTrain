package ch00.sec02;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("실수 a:"); double a = stdIn.nextDouble();
		System.out.println("실수 b:"); double b = stdIn.nextDouble();
		
		Double max; 
		if (a>b)
			max = a;
		else
			max =b;
		System.out.println("큰쪽의 값은 " + max + "입니다." );
		
	}

}
