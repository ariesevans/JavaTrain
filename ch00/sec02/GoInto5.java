package ch00.sec02;

import java.util.Scanner;

public class GoInto5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn= new Scanner(System.in);
		
		System.out.println("정숫값:");
		int n=stdIn.nextInt();
		
		if (n>0)
			if(n%5==0)
				System.out.println("이 값은 5로 나누어 집니다");
			else
				System.out.println("이 값은 5로 나우어 지지 않습니다");
			else 
			System.out.println("음의 정숫값을 입력했씁니다");
	
		

	}

}
