package part2.ch06;

public class CarExample4_1 {
    public static void main(String[] args) {

        Car4_1 car2 = new Car4_1("자가용");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car4_1 car3 = new Car4_1("자가용", "빨강");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        Car4_1 car4 = new Car4_1("택시", "검정" ,200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
        System.out.println();


    }
}
