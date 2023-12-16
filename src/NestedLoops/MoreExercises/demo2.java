package NestedLoops.MoreExercises;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        char miss = scanner.nextLine().charAt(0);
        int counter = 0;
        for (char i = start; i <= end; i++) {
            for (char j = start; j <= end; j++) {
                for (char k = start; k <= end; k++) {
                    if(i!= miss && j != miss && k!= miss) {
                        System.out.printf("%c%c%c ", i, j, k);
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }
}