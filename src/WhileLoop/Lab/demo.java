package WhileLoop.Lab;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int year = 1;
        int fail = 0;
        double sum = 0;
        while (year<=12){
            double grade = Double.parseDouble(scanner.nextLine());
            if(grade<4){
                fail++;
            }
            if(fail>1){
                System.out.printf("%s has been excluded at %d grade", name, year);
                break;
            }
            sum+=grade;

                year++;

        }
        if(year>11){
            System.out.printf("%s graduated. Average grade: %.2f",name, sum/12);
        }
    }
}


