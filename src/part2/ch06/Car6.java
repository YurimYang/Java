package part2.ch06;

public class Car6 {
    String model;
    int speed;

    Car6(String model) {
        this.model = model;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        setSpeed(100);
        System.out.println(model + "가 달립니다. 시속:" + speed);
    }
}
