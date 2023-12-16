package PB_Exams.Test;

import java.util.Scanner;

public class Test_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;

        for (int i = 1; i <= n; i++) {
            int nums = Integer.parseInt(scanner.nextLine());
            if(nums%2==0){
                p1++;
            }
            if(nums%3==0){
                p2++;
            }
            if(nums%4==0){
                p3++;
            }


        }

        double percentP1 = 1.0* p1 / n *100;
        double percentP2 = 1.0* p2 / n *100;
        double percentP3 = 1.0* p3 / n *100;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", percentP1, percentP2, percentP3);
    }
}
