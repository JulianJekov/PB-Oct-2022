package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();


        if (operation.equals("+")) {
            int sum = num1 + num2;
            if (sum % 2 == 0) {
                System.out.printf("%d + %d = %d - even", num1, num2, sum);
            } else {
                System.out.printf("%d + %d = %d - odd",num1, num2, sum);
            }
        }else if(operation.equals("-")){
            int diff = num1 - num2;
            if (diff % 2 == 0) {
                System.out.printf("%d - %d = %d - even", num1, num2, diff);
            } else {
                System.out.printf("%d - %d = %d - odd",num1, num2, diff);
            }
        }else if(operation.equals("*")){
            int result = num1 * num2;
            if (result % 2 == 0) {
                System.out.printf("%d * %d = %d - even", num1, num2, result);
            } else {
                System.out.printf("%d * %d = %d - odd",num1, num2, result);
            }
        }else if(operation.equals("/")){
            if(num2 == 0){
                System.out.printf("Cannot divide %d by zero", num1);
            }else {
                double division = num1*0.1 / num2;
                System.out.printf("%d / %d = %.2f",num1, num2, division);
            }
        }else if(operation.equals("%")){
            if(num2 == 0){
                System.out.printf("Cannot divide %d by zero", num1);
            }else{
                double leftover = num1 % num2;
                System.out.printf("%d %% %d = %.0f", num1, num2, leftover);

            }
        }

    }
}
