package ch03.sec04;

public class AccuracyExample2 {
    public static void main(String[] args) {
        int apple = 1;
        int totalPieces = apple * 10;
        int number = 7;

        double result = totalPieces - number;
        System.out.println(result);
        System.out.println(result/10.0); //정수 연산으로 변경해서 다음과 같이 계산하기
    }
}
