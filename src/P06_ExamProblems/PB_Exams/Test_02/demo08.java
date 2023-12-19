package P06_ExamProblems.PB_Exams.Test_02;

import java.util.Scanner;

public class demo08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        double maxSum = Double.MIN_VALUE;
        String maxWord = "";
        while (!word.equals("End of words")) {
        boolean check = false;
            double sum = 0;
            for (int i = 0; i < word.length(); i++) {
                char all = word.charAt(i);
                sum += all;
               // boolean isVowel = all == 'a' || all == 'o' || all == 'e' || all == 'i' || all == 'u' || all == 'y' ||
               //         all == 'A' || all == 'O' || all == 'E' || all == 'I' || all == 'U' || all == 'Y';
                if (i == 0 & all == 'a' || all == 'o' || all == 'e' || all == 'i' || all == 'u' || all == 'y' ||
                        all == 'A' || all == 'O' || all == 'E' || all == 'I' || all == 'U' || all == 'Y') {
                    check = true;
                }
            }
            if(check){
                sum*=word.length();
            }else {
                sum/=word.length();
            }
            if (maxSum < sum) {
                maxSum = sum;
                maxWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f", maxWord, maxSum);
    }
}