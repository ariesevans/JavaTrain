package choo.sec03;

import java.util.Scanner;

public class DigitPyramid {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		System.out.println("숫자 피라미드를 표시 합니다");
		System.out.println("단수는:");
		int n=stdIn.nextInt();
		for (int i=1; i<=n;i++) {
			for (int j=1; j<=n-i;j++)
				System.out.print(i%10);
			System.out.println();
		}

	}

}
