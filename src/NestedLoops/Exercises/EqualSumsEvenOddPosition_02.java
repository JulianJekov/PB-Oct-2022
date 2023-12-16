package NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        for (int i = firstNum; i <=secondNum; i++) {

            int currentFirstNum = i/100000%10;
            int currentSecondNum = i/10000%10;
            int currentThirdNum = i/1000%10;
            int currentForthNum = i/100%10;
            int currentFifthNum = i/10%10;
            int currentSixthNum = i%10;

            int sumOdd = currentThirdNum +currentFifthNum + currentFirstNum;
            int sumEven = currentSecondNum+ currentForthNum + currentSixthNum;

            if(sumEven==sumOdd){
                System.out.printf("%d ",i);
            }
        }
    }
}