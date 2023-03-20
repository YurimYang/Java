package part2.ch06;

public class Car4 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car4() {}

    Car4(String model) {
        this.model = model;
    }

    Car4(String model, String color){
        this.model = model;
        this.color = color;
    }

    Car4(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

}
