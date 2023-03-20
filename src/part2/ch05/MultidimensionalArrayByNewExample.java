package part2.ch05;

public class MultidimensionalArrayByNewExample {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];

        for (int i =0; i< mathScores.length; i++) {
            for (int k=0; k< mathScores.length; k++) {
                System.out.println("mathScore[" + i +"][" + k + "] :" + mathScores[i][k]);
            }
        }

        System.out.println();

        mathScores[0][0] = 80;
        mathScores[0][1] = 83;
        mathScores[0][2] = 85;
        mathScores[1][0] = 86;
        mathScores[1][1] = 90;
        mathScores[1][2] = 92;


        int totalStudent = 0;
        int totalMathSum = 0;

        for (int i = 0; i < mathScores.length; i++) { //mathScores = 2 (행의 개수)
            totalStudent += mathScores[i].length;
            for (int k = 0; k < mathScores[i].length; k++){
                totalMathSum += mathScores[i][k];
                System.out.println("mathScore[" + i +"][" + k + "] :" + mathScores[i][k]);
            }
        }

        double totalMathAvg = (double) totalMathSum/totalStudent;
        System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
        System.out.println();

    }
}
