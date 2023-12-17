package P02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P01_PoolPipes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double water = p1*hours +p2*hours;
        double percentWater = water / v * 100;
        double percentP1 = p1*hours / v * 100;

        if (water <= v) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",
            (water/v*100),
            (p1*hours/water*100),
            (p2*hours/water*100));
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, water - v);
        }
    }
}

























        //1. ==, >=, <=, >, < ---- =, ==

        //int number = 5;
        // double number2 = 7.5;
        //String name = "Julian";
        //System.out.println(Math.ceil(number2));
        //System.out.println(Math.floor(number2));
        // System.out.println(Math.abs(number));
        // System.out.printf("%d", number);
        // System.out.printf("%f", number2);
        // System.out.printf("%s", name);

        //int num1 = Integer.parseInt(scanner.nextLine());
        //int num2 = Integer.parseInt(scanner.nextLine());
        //int num3 = Integer.parseInt(scanner.nextLine());
        // String name = "Julian";
        //  if (num1 < 10){
        //     System.out.println(num1);
        // }else if (num2 <= 20){
        //     System.out.println(num2);
        // }else if (num3 <= 30){
        //      System.out.println(num3);
        // }



 //   }


  //  }
