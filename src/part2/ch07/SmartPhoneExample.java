package part2.ch07;

import java.util.Objects;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시", "은색");

        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        System.out.println("와이파이 상태: " + myPhone.wifi);

        myPhone.bell();
        myPhone.sendVocie("여보세요.");
        myPhone.receiveVoice("안녕하세요~~");
        myPhone.sendVocie("아~~");
        myPhone.hangUp();

        myPhone.setWifi(true);

        myPhone.internet();
    }
}
