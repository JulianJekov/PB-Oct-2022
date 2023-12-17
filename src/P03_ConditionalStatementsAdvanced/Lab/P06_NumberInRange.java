package P03_ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class P06_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        //[-100; 100] -> число >= -100 и число <= 100 и число != 0-> Yes

        if(number >= -100 && number <= 100 && number != 0) {
            System.out.println("Yes");

        }else {
            System.out.println("No");
        }

    }
}
