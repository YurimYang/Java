package part2.ch06;

public class Car7 {
    //인스턴스 변수
    int speed;
    //인스턴스 메소드
    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    //정적 메소드
    static void simulate(){
        Car7 myCar = new Car7();
        myCar.speed = 200;
        myCar.run();
    }

    public static void main(String[] args) {
        simulate();
        //정적변수 내의 새 객체와 다름
        Car7 myCar = new Car7();
        myCar.speed = 60;
        myCar.run();
    }
}
