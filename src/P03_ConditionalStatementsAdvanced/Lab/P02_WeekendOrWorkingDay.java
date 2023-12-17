package P03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P02_WeekendOrWorkingDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. входни данни -> текст -> ден от седмицата
        //2. серия от проверки за ден от седмицата за точна стойност

        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Working day");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
}
