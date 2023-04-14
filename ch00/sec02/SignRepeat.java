package ch00.sec02;

import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn =new Scanner(System.in);
		int retry;
		
		do {
			System.out.println("정숫값:");
			int n= stdIn.nextInt();
			
			if (n>0)
				System.out.println("이 값은 양수 입니다");
			else if (n<0)
				System.out.println("이 값은 음수 입니다");
			else
				System.out.println("이 값은 0 입니다");
			
			System.out.println("다시 한번? 1-Yes/ 0-No:");
			retry=stdIn.nextInt();
		}
		while (retry ==1);
		}
	}


