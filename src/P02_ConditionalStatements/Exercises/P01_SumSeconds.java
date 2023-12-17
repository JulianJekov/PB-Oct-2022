package P02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P01_SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Четем входните данни
        //2. Пресмятаме общия брой секунди
        //3. Намираме минутите и секундите
        //4. Принтираме

        int firstSeconds = Integer.parseInt(scanner.nextLine());
        int secondSeconds = Integer.parseInt(scanner.nextLine());
        int thirdSeconds = Integer.parseInt(scanner.nextLine());

        int sumSeconds = firstSeconds + secondSeconds + thirdSeconds;
        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

        if (seconds < 10){
            System.out.printf("%d:0%d", minutes, seconds);
        }else{
            System.out.printf("%d:%d", minutes, seconds);

        }


    }
}
