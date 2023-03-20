package part2.ch06;

public class CarExample2 {
    public static void main(String[] args) {
        Car2 myCar = new Car2();

        System.out.println("제작회사 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("최고속도 : " + myCar.maxSpeed);
        System.out.println("현재속도 : " + myCar.speed);

        myCar.speed = 60; //객체가 갖고 있는 필드에 접근하여 변경함
        System.out.println("수정된 속도: " + myCar.speed);
    }
}
