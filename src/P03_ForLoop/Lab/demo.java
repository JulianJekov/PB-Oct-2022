package P03_ForLoop.Lab;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0) {
                sumEven+=numbers;
            }else {
                sumOdd+=numbers;
            }

        }

        if(sumEven==sumOdd){
            System.out.printf("Yes%nSum = %d",sumEven);
        }else {
            System.out.printf("No%nDiff = %d",Math.abs(sumEven - sumOdd));
        }
    }
}
