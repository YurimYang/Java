package part2.ch06;

public class CarExample {
    public static void main(String[] args){
        Car myCar = new Car();

        System.out.println("모델명 :" + myCar.model); //myCar란 새로운 객체에서 model 값을 가져온다.
        System.out.println("시동여부 :" + myCar.start); //myCar란 새로운 객체에서 start 값을 가져온다.
        System.out.println("현재속도 :" + myCar.speed); //myCar란 새로운 객체에서 speed 값을 가져온다.
    }
}
