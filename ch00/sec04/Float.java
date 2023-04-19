package ch00.sec04;

import java.util.Scanner;

public class Float {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("변수 x는 float형 입니다. 변수y는 double형 입니다.");
		System.out.println("x: ");
		float x=stdIn.nextFloat();
		System.out.println("y: ");
		double y=stdIn.nextDouble();
		
		System.out.println("x="+x);
		System.out.println("y="+y);

	}

}
