package ch00.sec02;

import java.util.Scanner;

public class Modulo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("변수 a: "); int a = stdIn.nextInt();
		System.out.println("변수 b: "); int b = stdIn.nextInt();
 		
		if (a>b)
			System.out.println("a가 크다.");
		else if (a<b)
			System.out.println("b가 크다.");
		else
			System.out.println("a와 b가 같다");
	}

}
