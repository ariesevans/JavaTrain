package ch00.sec11;

public class Idtester {

	public static void main(String[] args) {
		Id a=new Id();
		Id b=new Id();
		
		System.out.println("a의 식별번호:"+a.getId());
		System.out.println("b의 식별번호:"+b.getId());
		
		System.out.println("Id.counter="+Id.counter);
		System.out.println("a.counter="+a.counter);
		System.out.println("b.counter="+b.counter);

	}

}
