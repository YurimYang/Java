package part1.ch03.sec04;

public class AccuracyExample1 {
	public static void main(String[] args) {
			int apple = 1;
			double pieceUnit = 0.1;
			int number = 7;

			double result = apple - number * pieceUnit;
			System.out.println(result); //부동소수점 방법때문에 결과값이 정확히 떨어지지 않음
	}
}
