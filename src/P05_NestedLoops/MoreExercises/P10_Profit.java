package P05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P10_Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int num1Levs = Integer.parseInt(scanner.nextLine());
        int num2Levs = Integer.parseInt(scanner.nextLine());
        int num5Levs = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i <= num1Levs; i++) {

            for (int j = 0; j <= num2Levs; j++) {

                for (int k = 0; k <= num5Levs; k++) {

                    if(i + j*2 + k*5 == sum){

                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n",i,j,k,sum);

                    }
                }
            }
        }
    }
}
