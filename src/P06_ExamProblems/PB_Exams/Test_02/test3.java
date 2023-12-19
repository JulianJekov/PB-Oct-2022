package P06_ExamProblems.PB_Exams.Test_02;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJoinery = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;

        if (type.equals("90X130")) {
            price = 110*numJoinery;
            if (numJoinery > 30 && numJoinery <= 60) {
                price *= 0.95;
            } else if (numJoinery > 60 ) {
                price *= 0.92;
            }
        } else if (type.equals("100X150")) {
            price = 140*numJoinery;
            if (numJoinery > 40 && numJoinery <= 80) {
                price *= 0.94;
            } else if (numJoinery > 80) {
                price *= 0.90;
            }
        } else if (type.equals("130X180")) {
            price = 190*numJoinery;
            if (numJoinery > 20 && numJoinery <= 50) {
                price *= 0.93;
            } else if (numJoinery > 50) {
                price *= 0.88;
            }
        } else if (type.equals("200X300")) {
            price = 250*numJoinery;
            if (numJoinery > 25 && numJoinery <= 50) {
                price *= 0.91;
            } else if (numJoinery > 50) {
                price *= 0.86;
            }
        }
            if(delivery.equals("With delivery")){
                price+=60;
            }
            if(numJoinery>99){
                price*=0.96;
            }

            if(numJoinery>10){
                System.out.printf("%.2f BGN", price);
            }else {
                System.out.println("Invalid order");
            }
    }
}