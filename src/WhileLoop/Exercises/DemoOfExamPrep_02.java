package WhileLoop.Exercises;

import java.util.Scanner;

public class DemoOfExamPrep_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maxNumOfNegativeGrades = Integer.parseInt(scanner.nextLine());
        int gradeSum = 0;
        int numAllProblems = 0;
        int numOfNegativeGrades = 0;
        String lastProblem = "";

        while (numOfNegativeGrades < maxNumOfNegativeGrades) {
            String nameOfProblem = scanner.nextLine();
            if (nameOfProblem.equals("Enough")) {
                double avv = 1.0*gradeSum / numAllProblems;
                System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s"
                        ,avv, numAllProblems, lastProblem);
                break;
            }
            int currentGrade = Integer.parseInt(scanner.nextLine());
            if (currentGrade <= 4) {
                numOfNegativeGrades++;
            }
            gradeSum += currentGrade;
            numAllProblems++;
            lastProblem = nameOfProblem;

        }

        if (numOfNegativeGrades >= maxNumOfNegativeGrades) {
            System.out.printf("You need a break, %d poor grades.", numOfNegativeGrades);
        } //else {
            //System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s"
                   // , 1.0 * gradeSum / numAllProblems, numAllProblems, lastProblem);
       // }
    }
}
