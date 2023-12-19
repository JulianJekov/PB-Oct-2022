package P06_ExamProblems;

import java.util.Scanner;

public class From_Exam_P05_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double space = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int count = 0;
        int count2 = 0;
        while (!command.equals("End")){
            double currentNum = Double.parseDouble(command);

            count++;
            if(count%3==0){
                currentNum*=1.1;
            }
            space-=currentNum;
            if(space<=0){
                System.out.println("No more space!");
                break;
            }else {
                count2++;
            }

            command = scanner.nextLine();
        }

        if(space>0){
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.",count2);

    }
}
