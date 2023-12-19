package P04_WhileLoop.Lab;

import java.util.Scanner;

public class P08_Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String student = scanner.nextLine();

        int goodGrades = 1;
        int poorGrades = 0;
        double gradeCount = 0;
        boolean isExcluded = false;


        while (goodGrades<=12){

            if(poorGrades==2){
                isExcluded = true;
                break;
            }
            double currentGrade = Double.parseDouble(scanner.nextLine());
            if(currentGrade<4){
                poorGrades++;
                continue;
            }
            gradeCount+=currentGrade;
            goodGrades++;
        }
        double avv = gradeCount / goodGrades;
        if (isExcluded){
            System.out.printf("%s has been excluded at %d grade", student, goodGrades);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f", student , avv);
        }
    }
}
