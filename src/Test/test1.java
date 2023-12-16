package Test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double space = Double.parseDouble(scanner.nextLine());
        String commnad = scanner.nextLine();
        int count = 0;
        int count2 = 0;
        while (!commnad.equals("End")){
            double currentNum = Double.parseDouble(commnad);

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

            commnad = scanner.nextLine();
        }

        if(space>0){
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.",count2);

    }
}
