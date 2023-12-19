package P06_ExamProblems.PB_Exams.PreExam;

import java.util.Scanner;

public class Problem_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 1;
        int meters = 5364;
        String comand = scanner.nextLine();

        while (!comand.equals("END")) {
            int climbe = Integer.parseInt(scanner.nextLine());
            if (comand.equals("Yes")) {
                days++;
                if (days > 5) {
                    break;
                }
            }
            meters += climbe;

            if (meters >= 8848) {
                break;
            }

            comand = scanner.nextLine();
        }
        if (meters >= 8848) {
            System.out.printf("Goal reached for %d days!", days);
        } else {
            System.out.printf("Failed!%n%d", meters);
        }

    }
}
