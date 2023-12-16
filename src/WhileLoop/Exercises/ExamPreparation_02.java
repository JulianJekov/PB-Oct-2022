package WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialFalse = Integer.parseInt(scanner.nextLine());

        int countFailedProblems = 0;
        double sumScore = 0;
        int countProblems = 0;
        String lastProblemName = "";

        while(countFailedProblems<initialFalse){
            String currentProblemName = scanner.nextLine();
            if(currentProblemName.equals("Enough")){
                break;
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());

            if(currentGrade<=4){
                countFailedProblems++;
            }

            sumScore+= currentGrade;
            countProblems++;
            lastProblemName = currentProblemName;
        }
        if(countFailedProblems>=initialFalse){
            System.out.printf("You need a break, %d poor grades.", countFailedProblems);
        }else {
            System.out.printf("Average score: %.2f%n", sumScore / countProblems);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s", lastProblemName);
        }
    }
}
