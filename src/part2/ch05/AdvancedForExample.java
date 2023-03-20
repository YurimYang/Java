package part2.ch05;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71,84, 93, 87};
        int sum = 0;
        for (int score : scores) { //타입 변수 : 배열 -> 배열에서 순서대로 값 가져오기
            sum = sum + score;
        }
        System.out.println("점수 총합 =" + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수평균 =" + avg);
    }
}
