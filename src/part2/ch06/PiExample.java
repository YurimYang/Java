package part2.ch06;

public class PiExample {
    public static void main(String[] args){
        double res1= 10 * 10 * Pi.pi;
        double res2 = Pi.plus(5,6);
        double res3 = Pi.minus(10,5);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}
