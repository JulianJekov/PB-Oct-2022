package P02_ConditionalStatements.MoreExercises;


import java.util.Scanner;

public class P07_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String oilName = scanner.nextLine();
        double oilLiters = Double.parseDouble(scanner.nextLine());

        if (oilName.equals("Diesel") || oilName.equals("Gasoline") || oilName.equals("Gas")) {
            if (oilLiters >= 25) {
                System.out.printf("You have enough %s.", oilName.toLowerCase());
            } else if (oilLiters < 25) {
                System.out.printf("Fill your tank with %s!", oilName.toLowerCase());
            } else
                System.out.println("Invalid fuel!");


        }

    }

}