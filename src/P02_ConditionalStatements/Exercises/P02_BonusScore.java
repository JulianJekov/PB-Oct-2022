package P02_ConditionalStatements.Exercises;

import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. Четем от конзолата
        //2. Правим проверка в кой диапазон попада числото
        //3. Допълнитена проверка и Пресмятаме бонус точките ( дали е четно или завършва на 5)
        //4. Принтираме

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (number <= 100){
        bonus = 5;
        }else if (number <= 1000){
        bonus = number * 0.2;
        }else{
        bonus = number * 0.1;
        }

        if (number % 2 ==0){
            bonus = bonus +1;
        }else if (number % 10 == 5){
        bonus = bonus +2;

        }
        double sum = number + bonus;
        System.out.printf("%.1f%n%.1f",bonus, sum);

    }
}
