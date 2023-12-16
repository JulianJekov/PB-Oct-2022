package NestedLoops.Lab;

import java.util.Scanner;

public class Combinations_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int validCombinations = 0;
        boolean flag = false;
        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                    if (x1 + x2 + x3 == n) {

                        System.out.printf("%d + %d + %d = %d%n", x1 , x2 , x3 ,n);
                        flag = true;
                       break;
                    }
                }
                if(flag){
                    break;
                }
            }
            if(flag){
               break;
            }
        }

    }
}
