package P05_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P13_PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int num4 = Integer.parseInt(scanner.nextLine());

        for (int i = num1; i <= num1 + num3; i++) {
            int count = 1;
            int prime = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if(count>2){
                    break;
                }
            }
            if (count <= 2) {
                prime += i;
            }
            for (int j = num2; j <= num2 + num4; j++) {
                int count2 = 1;
                int prime2 = 0;
                for (int k = 2; k <= j; k++) {
                    if (j % k == 0) {
                        count2++;
                    }
                    if(count2>2){
                        break;
                    }

                }
                    if (count2 <= 2) {
                        prime2 += j;
                    }

                    if(prime>0&&prime2>0)
                System.out.printf("%d%d%n", prime, prime2);
            }

        }

    }

}

