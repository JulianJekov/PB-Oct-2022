package PB_Exams.Test_02;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i =first; i <= second ; i++) {

            String currentNum = "" + i;
            int sumOdd = 0;
            int sumEven = 0;

            for (int j = 0; j <=currentNum.length(); j++) {
                int currentDigit = currentNum.charAt(j);

                if(j%2==0){
                    sumEven+=currentDigit;
                }else{
                    sumOdd+=currentDigit;
                }
            }
            if(sumEven==sumOdd){
                System.out.printf("%d ", i);
            }
        }
    }
}
