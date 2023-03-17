package part2.ch05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "양유림";
        String strVar2 = "양유림";

        if (strVar1 == strVar2) {
            System.out.println("same !"); //str1이랑 str2는 문자열 리터럴이 같으므로 참조가 같음
        }
        else{
            System.out.println("diff !");
        }

        if (strVar1.equals(strVar2)){
            System.out.println("both same !");
        }

        String strVar3 = new String("양유림");
        String strVar4 = new String("양유림");

        if (strVar3 == strVar4) {
            System.out.println("same");
        }
        else{
            System.out.println("diff"); //str3 랑 str4는 객체를 별도로 생성하여 넣었기에 다름
        }

        if (strVar3.equals(strVar4)){
            System.out.println("both same"); //내부 문자열 그 자체로만 비교했을 때는 같음
        }
    }
}
