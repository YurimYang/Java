package part2.ch05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "10101010101010";
        char sex = ssn.charAt(6);
        switch (sex) {
            case '0':
                System.out.println("1입니다");
                break;
            case '1':
                System.out.println("0입니다");
                break;

        }
    }
}
