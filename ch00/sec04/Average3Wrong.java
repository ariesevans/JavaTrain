package ch00.sec04;

import java.util.Scanner;

public class Average3Wrong {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.println("정숫값 x,y,z의 평균을 구합니다.");
		System.out.println("x값:"); int x=stdIn.nextInt();
		System.out.println("y값:"); int y=stdIn.nextInt();
		System.out.println("z값:"); int z=stdIn.nextInt();
		
		double ave=(x+y+z)/3.0;
		System.out.printf("x,y,z의 평균은 %.5f입니다.\n",ave);
		
	}

}
