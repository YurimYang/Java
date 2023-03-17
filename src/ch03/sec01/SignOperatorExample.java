package ch03.sec01;

public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x: " + x);
		
		byte b = 100;
		int y = -b; //-b한 것도 연산처리 되서 int로 바뀌기 때문에 int y
		
		System.out.println("y: " + y);
	}
}
