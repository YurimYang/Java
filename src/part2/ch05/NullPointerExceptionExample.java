package part2.ch05;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null;
        intArray[0] = 10; //NullPointerExceptionExample 발생

        String str = null;
        System.out.println("총 문자 수: " + str.length()); //NullPointerExceptionExample 발생
    }
    //자바에서 객체를 직접 제거 x -> 객체를 제거하는 유일한 방법은 객체의 모든 참조를 없애는 것!
}
