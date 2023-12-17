package P03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P01_DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> цяло число
        //2. проверка за числото -> 7 проверки
        //3. серия от 7 проверки за една променлива за точна стойност

        int number = Integer.parseInt(scanner.nextLine());

        switch (number) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;

        }

    }
}
