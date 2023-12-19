package P06_ExamProblems.PB_Exams.PreExam;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

            int rate = 0;
            double sales = 0;
        for (int i = 1; i <=num; i++) {

            int currentNums = Integer.parseInt(scanner.nextLine());

            int lastNum = currentNums%10;
            int otherNums = currentNums/10;
            rate+=lastNum;


            if(lastNum==2){
                sales+=0;
            }else if(lastNum==3){
                sales+=0.50*otherNums;
            }else if(lastNum==4){
                sales+=0.70*otherNums;
            }else if(lastNum==5){
                sales+=0.85*otherNums;
            }else if(lastNum==6){
                sales+=otherNums;
            }
        }

        System.out.printf("%.2f%n",sales);
        double average = 1.0*rate/num;
        System.out.printf("%.2f",average);

    }
}
