package P01_FirstStepsInCoding.Exercises;


import java.util.Scanner;

public class P01_USDToBGN {
    public static void main(String[] args) {

        //създаваме си скенер
        Scanner scanner = new Scanner(System.in);
        //четене от конзолата
        double usd = Double.parseDouble(scanner.nextLine());
        //преобразуване от долар в лева
        double bgn = usd * 1.79549;
        //принтиране на конзолата
        System.out.println(bgn);



    }
}
