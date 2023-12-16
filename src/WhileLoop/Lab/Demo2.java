package WhileLoop.Lab;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int year = 1;
        int badGrades = 0;
        double sumGrades = 0;

        while (year <= 12) {
            double currentGrades = Double.parseDouble(scanner.nextLine());
            if (currentGrades < 4) {
                badGrades++;
            }
            if (badGrades > 1) {
                System.out.printf("%s has been excluded at %d grade", name, year);
                break;
            }
            sumGrades += currentGrades;
            if (currentGrades >= 4) {
                year++;

            }
        }

        double averrage = sumGrades / 12;
        if (year > 11) {
            System.out.printf("%s graduated. Average grade: %.2f", name, averrage);
        }

    }
}
