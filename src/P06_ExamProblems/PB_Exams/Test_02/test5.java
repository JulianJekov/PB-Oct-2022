package P06_ExamProblems.PB_Exams.Test_02;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int maxGoals = Integer.MIN_VALUE;
        String bestPlayer = "";
        while (!name.equals("END")) {
            int goals = Integer.parseInt(scanner.nextLine());

            if (goals > maxGoals) {
                maxGoals = goals;
                bestPlayer = name;
            }
            if (goals >= 10) {
                break;
            }
            name = scanner.nextLine();
        }
        System.out.printf("%s is the best player!%n",bestPlayer);
        if(maxGoals>=3){
            System.out.printf("He has scored %d goals and made a hat-trick !!!",maxGoals);
        }else {
            System.out.printf("He has scored %d goals.",maxGoals);
        }
    }
}
