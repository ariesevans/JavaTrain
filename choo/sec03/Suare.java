package choo.sec03;

import java.util.Scanner;

public class Suare {

	public static void main(String[] args) {
	
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("정방향을 표시 합니다.");
		System.out.println("당수는:");
		int n=stdIn.nextInt();
		
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=n;j++)
				System.out.println('*');
			System.out.println();
		}
		
	}

}
