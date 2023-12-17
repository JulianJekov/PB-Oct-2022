package P03_ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class P06_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        //1.switch  оператора, за да извършим съответното пресмятане
        // 1.1пресмятаме
        // При +, -, *, проверяване дали е четен резултат
        //принтираме

        switch (operator) {
            case "+":
                int sum = number1 + number2;
                if(sum % 2 == 0){
                    System.out.printf("%d + %d = %d - even",number1, number2, sum);
                }else{
                    System.out.printf("%d + %d = %d - odd", number1, number2, sum);
                }
                break;
            case "-":
                int diff = number1 - number2;
                if(diff % 2 ==0){
                    System.out.printf("%d - %d = %d - even",number1, number2, diff);
                }else{
                    System.out.printf("%d - %d = %d - odd",number1, number2, diff);
                }
                break;
            case "*":
                int result = number1 * number2;
                if(result % 2 ==0){
                    System.out.printf("%d * %d = %d - even",number1, number2, result);
                }else{
                    System.out.printf("%d * %d = %d - odd",number1, number2, result);
                }
                break;
            case "/":
                if(number2 == 0){
                    System.out.printf("Cannot divide %d by zero", number1);
                }else{
                    double division = number1 * 0.1/ number2;
                    System.out.printf("%d / %d = %.2f", number1, number2, division);
                }
                break;
            case "%":
                if (number2 == 0) {
                    System.out.printf("Cannot divide %d by zero", number1);
                }else{
                    int leftover = number1 % number2;
                    System.out.printf("%d %% %d = %d", number1, number2, leftover);
                }
                break;
        }
    }
}
