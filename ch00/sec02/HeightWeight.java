package ch00.sec02;

import java.util.Scanner;

public class HeightWeight {

	public static void main(String[] args) {
		 Scanner stdIn= new Scanner(System.in);
		 System.out.println("먗 CM부터:");
		 int hMin=stdIn.nextInt();
		 System.out.println("몇 CM 까지");
		 int hMax=stdIn.nextInt();
		 System.out.println("몇 CM단위:");
		 int step =stdIn.nextInt();
		 System.out.println("------------");
		 
		 for (int i=hMin; i <=hMax; i+=step)
			 System.out.println(i+""+0.9*(i-100));
	}

}
