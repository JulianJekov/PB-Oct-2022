package P07_DrawingFiguresWithLoopsMoreExercises;

import java.util.Scanner;


public class P_Pattern_PiramidFromNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int z = 1;

        for (int i = 1; i <=n; i++) {
            for (int j = n-1; j >=i ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j<=z; j++) {
                System.out.printf("%d",Math.abs(j-i));
            }
            z+=2;
            System.out.println();
        }
    }
}


