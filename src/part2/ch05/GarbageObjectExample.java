package part2.ch05;

public class GarbageObjectExample {
    public static void main(String[] args) {
        String hobby = "여행";
        hobby = null; //"여행"에 해당하는 String 객체를 쓰레기로 만들어버림

        String kind1 = "자동차";
        String kind2 = kind1; //kind1 변수에 있는 번지를 kind2 변수에 대입
        kind1 = null; //"자동차"는 쓰레기 값이 아님! kind2에 이미 연결해뒀으니!!
        System.out.println("kind2: " + kind2);
    }
}
