package ConditionalStatements.Exercises;

import java.util.Scanner;

public class TimePlud15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Прочитаме входните данни
        //2.Превръщаме всичко в минути
        //3.Добавяме 15 минути
        //4.Пресмятаме времето - часове:минути
        //5.Принтираме

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = (hours * 60 + minutes) + 15;

        int newHours = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHours >= 24){
            newHours = 0;
            System.out.printf("%d:%02d", newHours, newMinutes);
        }else{
            System.out.printf("%d:%02d", newHours, newMinutes);
        }
    }
}
