package ch00.sec02;

import java.util.Scanner;

public class Med3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner stdIn = new Scanner(System.in);
    
    System.out.println("정수 a:"); int a=stdIn.nextInt();
    System.out.println("정수 b:"); int b=stdIn.nextInt();
    System.out.println("정수 c:"); int c=stdIn.nextInt();
    
    int med;
    if (a>= b)
    	if (b>=c)
    		med = b;
    	else if(a<=c)
    		med = a;
    	else if (a>c)
    		med = a;
    	else if (b>c)
    		med = c;
	}

}
