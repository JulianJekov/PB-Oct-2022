package ForLoop.MoreExercises;

public class ClockPlusClock2_09_10 {
    public static void main(String[] args) {

        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <= 59; j++) {
                for (int k = 0; k <= 59; k++) {

                    System.out.printf("%d : %d : %d%n", i,j,k);

                }
            }


        }
    }
}