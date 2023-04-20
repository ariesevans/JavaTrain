package ch00.sec05;

public class Square {

	public static void main(String[] args) {
		System.out.println("x      x의 제곱");
		System.out.println("-------------");
		
		for (float x=0.0F; x <= 1.0F;x +=0.01F)
			System.out.printf("%5.3f   %10.7f\n",x,x*x);
	}

}
