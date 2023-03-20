package part2.ch06;

public class CarExample4 {
    public static void main(String[] args) {
        Car4 car1 = new Car4(); //객체 생성
        System.out.println(car1.company);
        System.out.println();

        Car4 car2 = new Car4("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car4 car3 = new Car4("자가용", "빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        Car4 car4 = new Car4("택시", "검정" ,200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
        System.out.println();


    }
}
