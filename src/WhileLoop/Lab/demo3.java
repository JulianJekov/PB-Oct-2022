package WhileLoop.Lab;

import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int year = 1;
        int fail = 0;
        double sumGoodGrades = 0;

        while (year <= 12) {
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if (currentGrade >= 4) {
                year++;
                sumGoodGrades += currentGrade;
            } else {
                fail++;
            }
            if (fail > 1) {
                System.out.printf("%s has been excluded at %d grade", name, year);
                break;
            }
        }
        double averrage = sumGoodGrades / 12;
        if(year>12){
            System.out.printf("%s graduated. Average grade: %.2f", name, averrage);
        }

    }
}
