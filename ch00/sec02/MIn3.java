package ch00.sec02;

import java.util.Scanner;

public class MIn3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("정수 a:"); int a=stdIn.nextInt();
		System.out.println("정수 b:"); int b=stdIn.nextInt();
		System.out.println("정수 b:"); int c=stdIn.nextInt();
		
		int min = a;
		if (b<min) min =b;
		if (c<min) min =c;
	}
	
	

}
