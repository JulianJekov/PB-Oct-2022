package P03_ForLoop.MoreExercises;

import java.util.Scanner;

public class P11_OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sumEven = 0;
        double maxEven = Integer.MIN_VALUE;
        double minEven = Integer.MAX_VALUE;

        double sumOdd = 0;
        double maxOdd = Integer.MIN_VALUE;
        double minOdd = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            double nums = Double.parseDouble(scanner.nextLine());
            if(i%2==0){
                sumEven+=nums;
                if(maxEven<nums){
                    maxEven=nums;
                }
                if(minEven>nums){
                    minEven=nums;
                }
            }else {
                sumOdd+=nums;
                if(maxOdd<nums){
                    maxOdd=nums;
                }

                if(minOdd>nums){
                    minOdd=nums;
                }
            }

        }
        System.out.printf("OddSum=%.2f,%n",sumOdd);
        if(minOdd==Integer.MAX_VALUE){
            System.out.println("OddMin=No,");
        }else{
            System.out.printf("OddMin=%.2f,%n", minOdd);
        }
        if(maxOdd==Integer.MIN_VALUE){
            System.out.println("OddMax=No,");
        }else{
            System.out.printf("OddMax=%.2f,%n", maxOdd);
        }
        System.out.printf("EvenSum=%.2f,%n", sumEven);
        if(minEven==Integer.MAX_VALUE){
            System.out.println("EvenMin=No,");
        }else{
            System.out.printf("EvenMin=%.2f,%n", minEven);
        }
        if(maxEven==Integer.MIN_VALUE){
            System.out.println("EvenMax=No");
        }else{
            System.out.printf("EvenMax=%.2f", maxEven);
        }

    }
}
