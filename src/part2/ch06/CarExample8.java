package part2.ch06;

public class CarExample8 {
    public static void main(String[] args) {
        Car8 myCar = new Car8();

        myCar.setSpeed(-50);
        System.out.println(myCar.getSpeed());

        myCar.setSpeed(50);
        System.out.println(myCar.getSpeed());

        if(!myCar.isStop()){
            myCar.setStop(true);
        }

        System.out.println(myCar.getSpeed());
    }
}
