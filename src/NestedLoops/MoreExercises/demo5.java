package NestedLoops.MoreExercises;

import java.util.Scanner;

public class demo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int stop = Integer.parseInt(scanner.nextLine());
        int combinations = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= start; i++) {

            for (int j = 1; j <= stop; j++) {

                System.out.printf("(%d <-> %d) ", i, j);
                combinations -= 1;
                if (combinations <= 0) {
                    break;
                }
            }
            if(combinations<=0){
                break;
            }
        }
    }
}

