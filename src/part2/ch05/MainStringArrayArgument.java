package part2.ch05;

public class MainStringArrayArgument {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("프로그램 입력값이 부족"); //처음엔 무조건 입력값이 부족하므로 종료됨
            System.exit(0); //프로그램 강제종료
        }

        String strNum1 = args[0];
        String strNum2 = args[1];

        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);

        int result = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + result);
    }
}
