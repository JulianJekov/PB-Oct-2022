package WhileLoop.Exercises;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int daysSpend = 0;
        int daysCount = 0;

        while (ownedMoney < neededMoney && daysSpend < 5) {
            String command = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            if (command.equals("save")) {
                daysSpend = 0;
                ownedMoney += money;
            } else if (command.equals("spend")) {
                daysSpend++;
                ownedMoney -= money;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
            daysCount++;
        }
        if(daysSpend==5){
            System.out.printf("You can't save the money.%n%d",daysCount);
        }
        if(ownedMoney>= neededMoney){
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}