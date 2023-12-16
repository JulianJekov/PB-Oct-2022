package NestedLoops.Exercises;

import java.util.Scanner;

public class demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;
        while (!command.equals("stop")) {
            int currentNum = Integer.parseInt(command);

            if (currentNum < 0) {
                System.out.println("Number is negative");
                command = scanner.nextLine();
                continue;
            }
            int counter = 0;
            for (int i = 1; i <= currentNum; i++) {
                if (currentNum % i == 0) {
                    counter++;
                    if (counter == 3) {
                        break;
                    }
                }
            }
            if (counter > 2) {
                sumNonPrime += currentNum;
            } else {
                sumPrime += currentNum;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%nSum of all non prime numbers is: %d", sumPrime, sumNonPrime);
    }
}