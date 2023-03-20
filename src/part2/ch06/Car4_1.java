package part2.ch06;

public class Car4_1 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car4_1(String model) {
        this(model, "은색" , 250);

    }

    Car4_1(String model, String color){
        this(model, color, 250);
    }

    Car4_1(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


}
