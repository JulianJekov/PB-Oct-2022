package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class PersonalTitles_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1. входни данни -> age (double) -> gender String
        //2. проверка за пола -> "m" или "f" -> switch
        //

        double age = Double.parseDouble(scanner.nextLine());
        String gender = scanner.nextLine();

        switch (gender) {
            case "m":
                //проверка за възрастта
                if (age < 16) {
                    System.out.println("Master");
                } else {
                    System.out.println("Mr.");
                }
                break;
            case "f":
                //проверка за възрастта
                if (age < 16) {
                    System.out.println("Miss");
                } else {
                    System.out.println("Ms.");
                }
                break;

        }


    }
}
