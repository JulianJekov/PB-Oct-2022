package P06_ExamProblems.PB_Exams.PreExam;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double party = Double.parseDouble(scanner.nextLine());
        int love = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyChain = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int surprise = Integer.parseInt(scanner.nextLine());

        double sum = love * 0.60 + roses * 7.20 + keyChain * 3.60 + caricatures * 18.20 + surprise * 22;
        int numItems = love + roses + keyChain + caricatures + surprise;

        if (numItems >= 25) {
            sum *= 0.65;
        }
        double finalSum = sum * 0.90;

        if (finalSum >= party) {
            System.out.printf("Yes! %.2f lv left.", finalSum - party);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", party - finalSum);
        }


    }
}
