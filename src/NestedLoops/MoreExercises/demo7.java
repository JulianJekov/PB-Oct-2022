package NestedLoops.MoreExercises;

import java.util.Scanner;

public class demo7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int max = Integer.parseInt(scanner.nextLine());


        char A = 35;
        char B = 64;
        int count = 0;
        for (int i = 1; i <= a; i++) {

            for (int j = 1; j <= b; j++) {
                count++;
                if (count > max) {
                    break;
                }
                System.out.printf("%c%c%d%d%c%c|", A, B, i, j, B, A);
                A++;
                B++;
                if(A>55){
                    A=35;
                }
                if(B>96){
                    B=64;
                }
            }
            if (count > max) {
                break;
            }
        }
    }
}
