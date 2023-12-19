package P06_ExamProblems.PB_Exams.PreExam;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double kilos = Double.parseDouble(scanner.nextLine());
        String text = scanner.nextLine();
        int kilometers = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (text.equals("standard")) {
            if (kilos < 1) {
                price = 0.03 * kilometers;
            } else if (kilos >= 1 && kilos < 10) {
                price = 0.05 * kilometers;
            } else if (kilos >= 10 && kilos < 40) {
                price = 0.10 * kilometers;
            } else if (kilos >= 40 && kilos < 90) {
                price = 0.15 * kilometers;
            } else if (kilos >= 90 && kilos < 150) {
                price = 0.20 * kilometers;
            }
        } else if (text.equals("express")) {
            if (kilos < 1) {
                price = (0.03 * kilometers) + 0.03 * 0.80 * kilos * kilometers;
            } else if (kilos >= 1 && kilos < 10) {
                price = (0.05 * kilometers) + (((0.05 * 0.40) * kilos) * kilometers);
            } else if (kilos >= 10 && kilos < 40) {
                price = (0.10 * kilometers) + (((0.10 * 0.05) * kilos) * kilometers);
            } else if (kilos >= 40 && kilos < 90) {
                price = (0.15 * kilometers) + (((0.15 * 0.02) * kilos) * kilometers);
            } else if (kilos >= 90 && kilos < 150) {
                price = (0.20 * kilometers) + (((0.20 * 0.01) * kilos) * kilometers);
            }

        }

        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.",kilos,price);
    }
}
