package ForLoop.Lab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());
        int sumL = 0;
        int sumR = 0;
        for (int i = 1; i <= n; i++) {
            int numbersL = Integer.parseInt(scanner.nextLine());
            sumL += numbersL;
        }
        for (int i = 1; i <= n; i++) {
            int numbersR = Integer.parseInt(scanner.nextLine());
            sumR += numbersR;
        }
        if (sumL == sumR) {
            System.out.printf("Yes, sum = %d",sumL);
        }else {
            System.out.printf("No, diff = %d", Math.abs(sumL - sumR));
        }
    }
}
