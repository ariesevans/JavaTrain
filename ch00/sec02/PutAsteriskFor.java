package ch00.sec02;

import java.util.Scanner;

public class PutAsteriskFor {

	public static void main(String[] args) {
		Scanner stdIn= new Scanner(System.in);
		System.out.println("몇개의 *를 표시 할까요?:");
		int n= stdIn.nextInt();
		if (n>0) {
			for(int i=0;i<n;i++)
				System.out.println('*');
			    System.out.println();
		}
	}

}
