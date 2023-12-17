package P03_ForLoop.MoreExercises;

import java.util.Scanner;

public class Grades_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students1 = 0;
        int students2 = 0;
        int students3 = 0;
        int students4 = 0;

        double sumAllGrade = 0;

        int numStudents = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= numStudents; i++) {
            double examGrade = Double.parseDouble(scanner.nextLine());

            if (examGrade >= 2.00 && examGrade < 3.00) {
                students1++;
            } else if (examGrade >= 3.00 & examGrade < 4.00) {
                students2++;
            } else if (examGrade >= 4.00 && examGrade < 5.00) {
                students3++;
            } else {
                students4++;
            }
            sumAllGrade += examGrade;
        }
        double percentStudents1 = 1.0 * students1 / numStudents * 100;
        double percentStudents2 = 1.0 * students2 / numStudents * 100;
        double percentStudents3 = 1.0 * students3 / numStudents * 100;
        double percentStudents4 = 1.0 * students4 / numStudents * 100;

        double averageGrade = sumAllGrade / numStudents;

        System.out.printf("Top students: %.2f%%%n", percentStudents4);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentStudents3);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentStudents2);
        System.out.printf("Fail: %.2f%%%n", percentStudents1);
        System.out.printf("Average: %.2f", averageGrade);

    }
}