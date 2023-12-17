package P01_FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class P03_DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //прочитаме от конзолата входните данни
        double depositAmount = Double.parseDouble(scanner.nextLine());
        int months = Integer.parseInt(scanner.nextLine());
        double interestRate = Double.parseDouble(scanner.nextLine());

        //пресмятаме лихвата за месец
        double profit =  depositAmount * (interestRate/100);
        double profitPerMonth = profit / 12;

        //пресмятаме цялата сума за всички месеци
        double finalSum = depositAmount + (months * profitPerMonth);

        //принтиране на конзолата
        System.out.println(finalSum);





    }

}
