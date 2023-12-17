package P03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P08_CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Friday".equals(day)) {
            System.out.println(12);
        } else if ("Wednesday".equals(day) || "Thursday".equals(day)) {
            System.out.println(14);
        } else if ("Saturday".equals(day) || "Sunday".equals(day)) {
            System.out.println(16);
        }

    }
}
