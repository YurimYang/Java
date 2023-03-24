package part2.ch06;

public class RectangleExample {
    public static void main(String[] args) {
        Rectangle myRec = new Rectangle();

        double res1 = myRec.areaRectangle(10);
        double res2 = myRec.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 :" + res1);
        System.out.println("직사각형 넓이 :" + res2);
    }
}
